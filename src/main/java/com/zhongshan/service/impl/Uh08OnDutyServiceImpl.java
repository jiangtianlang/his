package com.zhongshan.service.impl;

import cn.hutool.core.date.DateUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.entity.*;
import com.zhongshan.entity.inpatient.PatientBase;
import com.zhongshan.entity.inpatient.Uh04WardBedSum;
import com.zhongshan.entity.vo.MappVo;
import com.zhongshan.entity.vo.MonthVo;
import com.zhongshan.entity.vo.Uho8OnDutyVo;
import com.zhongshan.mapper.*;
import com.zhongshan.mapper.personBase_mapper.PersonBaseMapper;
import com.zhongshan.service.Uh08OnDutyService;
import com.zhongshan.utils.result.R;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
* @author 13427
* @description 针对表【uh08_on_duty】的数据库操作Service实现
* @createDate 2022-04-27 18:13:39
*/
@Service
public class Uh08OnDutyServiceImpl extends ServiceImpl<Uh08OnDutyMapper, Uh08OnDuty>
    implements Uh08OnDutyService{
    @Resource
    private Uh08OnDutyMapper uh08OnDutyMapper;
    @Override
    public List<Uh08OnDuty> selectDepartment(String department) {
        Date date=new Date();
        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        String date1=dateFormat.format(date);
        String year=date1.substring(0,4);
        String month=date1.substring(5,7);
        String day=date1.substring(8);
        String branchOfWork="02";
        return uh08OnDutyMapper.selectDepartment(year,month,day,branchOfWork,department);
    }

    @Override
    public R outpatientDaily() {

        return R.ok();
    }
    @Resource
    private Uh05StaffMapper uh05StaffMapper;
    @Resource
    private PersonBaseMapper personBaseMapper;
    @Override
    public R queryWorkload(String name) {
        QueryWrapper<Uh08OnDuty> queryWrapper=new QueryWrapper<>();
        if(StringUtils.isNotBlank(name)){
            QueryWrapper<PersonBase> queryWrapper1=new QueryWrapper<>();
            queryWrapper1.like("name",name);
            List<PersonBase> list=personBaseMapper.selectList(queryWrapper1);
            queryWrapper.like("staff_no",list.get(0).getPersonNo());
            queryWrapper.like("department",name);
        }
        queryWrapper.eq("work_date",DateFormat.getDateInstance().format(new Date()));
        queryWrapper.orderByDesc(DateFormat.getDateInstance().format(new Date()));
        List<Uh08OnDuty> list=uh08OnDutyMapper.selectList(queryWrapper);

        List<Uho8OnDutyVo> list1=new ArrayList<>();
        if(list.size()>0){
        for (Uh08OnDuty u :list) {
            Uho8OnDutyVo uho8OnDutyVo=new Uho8OnDutyVo();
            uho8OnDutyVo.setStaffNo(u.getStaffNo());
            uho8OnDutyVo.setDepartment(u.getDepartment());
            uho8OnDutyVo.setAverWorkAmount(u.getAverWorkAmount());
            uho8OnDutyVo.setWorkAmount(u.getWorkAmount());
            uho8OnDutyVo.setExWorkAmount(u.getExWorkAmount());
            QueryWrapper<PersonBase> queryWrapper1=new QueryWrapper<>();
            queryWrapper1.like("person_no",u.getStaffNo());
            uho8OnDutyVo.setName(personBaseMapper.selectList(queryWrapper1).get(0).getPersonName());
            list1.add(uho8OnDutyVo);
        }}
        if(list.size()>0)
            return R.ok().data("data",list1);
        else
            return R.ok().message("没有数据");
    }

    @Override
    public R workloadDaily() {
        Date date=new Date();
        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        String date1=dateFormat.format(date);
        String year=date1.substring(0,4);
        String month=date1.substring(5,7);
        String day=date1.substring(8);
        List<MonthVo> list=uh08OnDutyMapper.workloadDaily(year,month,day);
        if(list.size()>0)
            return R.ok().data("data",list);
        else
            return R.ok().message("没有数据");
    }

    @Override
    public R workloadMonth(String date) {
        if(!StringUtils.isNotBlank(date)){
            date=DateFormat.getDateInstance().format(new Date());
        }
        String year=date.substring(0,4);
        String month=date.substring(5);
        List<MonthVo> list=uh08OnDutyMapper.workloadMonth(year,month);
        if(list.size()>0) {
            for (MonthVo m : list) {
                m.setDefen(((m.getWork()) / (m.getEx())));
                if ((m.getWork()) / (m.getEx()) < 0.7) {
                    m.setQingkuang("工作完成度低,工作不认真");
                }
                if ((m.getWork()) / (m.getEx()) < 0.8 && (m.getWork()) / (m.getEx()) > 0.7) {
                    m.setQingkuang("工作完成度较低");
                }
                if ((m.getWork()) / (m.getEx()) < 0.9 && (m.getWork()) / (m.getEx()) >= 0.8) {
                    m.setQingkuang("工作完成度良好");
                }
                if ((m.getWork()) / (m.getEx()) <=1.0 && (m.getWork()) / (m.getEx()) >= 0.9) {
                    m.setQingkuang("工作完成优秀");
                }
            }
            return R.ok().data("data", list);
        }
        else
            return R.ok().message("没有数据");
    }

    @Override
    public R workloadYear(String date) {
        List<MonthVo> list=uh08OnDutyMapper.workloadYear(date);
        if(list.size()>0) {
            for (MonthVo m : list) {
                m.setDefen(((m.getWork()) / (m.getEx())));
                if ((m.getWork()) / (m.getEx()) < 0.7) {
                    m.setQingkuang("工作完成度低,工作不认真");
                }
                if ((m.getWork()) / (m.getEx()) < 0.8 && (m.getWork()) / (m.getEx()) > 0.7) {
                    m.setQingkuang("工作完成度较低");
                }
                if ((m.getWork()) / (m.getEx()) < 0.9 && (m.getWork()) / (m.getEx()) >= 0.8) {
                    m.setQingkuang("工作完成度良好");
                }
                if ((m.getWork()) / (m.getEx()) <=1.0 && (m.getWork()) / (m.getEx()) >= 0.9) {
                    m.setQingkuang("工作完成优秀");
                }
            }
            return R.ok().data("data", list);
        }
        else
            return R.ok().message("没有数据");
    }
    @Resource
    private PrescriptionMapper prescriptionMapper;
    @Resource
    private Uh04WardBedSumMapper uh04WardBedSumMapper;
    @Resource
    private FirstpageMapper firstpageMapper;
    @Override
    public R selectDate(String workDate) {
        Map<String,Object> map=new HashMap<>();
        if(StringUtils.isNotBlank(workDate)){
                MappVo mappVo=new MappVo();
                QueryWrapper<Prescription> queryWrapper=new QueryWrapper<>();
                queryWrapper.like("today_date",workDate);
                List<Prescription> list=prescriptionMapper.selectList(queryWrapper);
               // map.put("kanbing",list.size()+"");
                //有效床位数和开放数
                QueryWrapper<Uh04WardBedSum> queryWrapper2=new QueryWrapper<>();
                queryWrapper2.like("total_date",workDate);
                List<Uh04WardBedSum> list2=uh04WardBedSumMapper.selectList(queryWrapper2);
//                if(list2.size()>0){
//                map.put("zhanyong",list2.get(0).getUseBedNumber()+"");
//                map.put("youxiao",list2.get(0).getValidBedNumber()+"");}
                //出院人数
                QueryWrapper<Firstpage> queryWrapper3=new QueryWrapper<>();
                queryWrapper3.like("fg_out_date",workDate);
                queryWrapper3.like("fg_leave_hospital","t");
                List<Firstpage> list3=firstpageMapper.selectList(queryWrapper3);
                //map.put("chuyuan",list3.size()+"");
                QueryWrapper<Firstpage> queryWrapper4=new QueryWrapper<>();
                queryWrapper4.like("fg_in_time",workDate);
                List<Firstpage> list4=firstpageMapper.selectList(queryWrapper4);
               // map.put("ruyuan",list4.size()+"");
//                date = new SimpleDateFormat("yyyy-MM").parse(workDate);
                QueryWrapper<Prescription> queryWrapper1=new QueryWrapper<>();
                queryWrapper1.like("today_date",workDate.substring(0,7));
                List<Prescription> list1=prescriptionMapper.selectList(queryWrapper);
               // map.put("month",list1.size()+"");
                QueryWrapper<Firstpage> queryWrapper5=new QueryWrapper<>();
                queryWrapper5.like("fg_in_time",workDate.substring(0,7));
                List<Firstpage> list5=firstpageMapper.selectList(queryWrapper5);
               // map.put("ruyuanmonth",list5.size()+"");
                QueryWrapper<Firstpage> queryWrapper6=new QueryWrapper<>();
                queryWrapper6.like("fg_out_date",workDate);
                queryWrapper6.like("fg_leave_hospital","t");
                List<Firstpage> list6=firstpageMapper.selectList(queryWrapper6);
               // map.put("liudong",(list6.size()+list5.size())+"");
                mappVo.setKanbing(list.size());
                mappVo.setChuyuan(list3.size());
                mappVo.setLiudong(list6.size()+list5.size());
                mappVo.setMonth(list1.size());
                mappVo.setRuyuan(list4.size());
                if(list2.size()>0){
                mappVo.setYouxiao(list2.get(0).getValidBedNumber());
                mappVo.setZhanyong(list2.get(0).getUseBedNumber());
                }else {
                    mappVo.setYouxiao(0);
                    mappVo.setZhanyong(0);
                }
                mappVo.setRuyuanmonth(list5.size());
                List<MappVo> list7=new ArrayList<>();
                list7.add(mappVo);
                if(list7.get(0)!=null)
                return R.ok().data("data",list7);
                else

                    return R.ok().message("没有数据");
        }
        return R.ok().message("请输入时间");
    }

    @Override
    public R selectDepart(String department) {
        Date date=new Date();
        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        String date1=dateFormat.format(date);
       String branchOfWork="02";
        QueryWrapper<Uh08OnDuty> queryWrapper=new QueryWrapper<>();
        if(StringUtils.isNotBlank(department)){
            queryWrapper.like("department",department);
        }
        queryWrapper.like("branch_of_work",branchOfWork);
        queryWrapper.like("work_date",date1);
        List<Uh08OnDuty> list=uh08OnDutyMapper.selectList(queryWrapper);
        if(list.size()>0){
            for (Uh08OnDuty u:list) {
                PersonBase personBase=personBaseMapper.selectById(u.getStaffNo());
                u.setStaffNo(personBase.getPersonName());
            }
            return R.ok().data("data",list);
        }else {
            return R.ok().message("值班人员未安排");
        }
    }
    @Scheduled(cron = " 0 0 1 * * ?")
    @Transactional(
            rollbackFor = {Exception.class}
    )
    @Override
    public void schedule() {
        QueryWrapper<PersonBase> queryWrapper=new QueryWrapper<>();
        List<PersonBase> list=personBaseMapper.selectList(queryWrapper);
        for (PersonBase p:list) {
            Uh08OnDuty uh08OnDuty=new Uh08OnDuty();
            uh08OnDuty.setStaffNo(p.getPersonNo());
            QueryWrapper<Uh08OnDuty> queryWrapper1=new QueryWrapper<>();
            queryWrapper1.like("staff_no",p.getPersonNo());
            queryWrapper1.eq("work_date", DateUtil.yesterday());
            List<Uh08OnDuty> list1=uh08OnDutyMapper.selectList(queryWrapper1);
            if(list1.size()>0){
            if(list1.get(0).getBranchOfWork().equals("01")){
            uh08OnDuty.setBranchOfWork("02");
            uh08OnDuty.setExWorkAmount(8.0);
            uh08OnDuty.setWorkAmount(8.0);
            }if(list1.get(0).getBranchOfWork().equals("02")){
                uh08OnDuty.setBranchOfWork("03");
                uh08OnDuty.setExWorkAmount(9.0);
                uh08OnDuty.setWorkAmount(9.0);
            }if(list1.get(0).getBranchOfWork().equals("03")){
                uh08OnDuty.setBranchOfWork("04");
                uh08OnDuty.setExWorkAmount(6.0);
                uh08OnDuty.setWorkAmount(6.0);
            }if(list1.get(0).getBranchOfWork().equals("04")){
                uh08OnDuty.setBranchOfWork("05");
                uh08OnDuty.setExWorkAmount(10.0);
                uh08OnDuty.setWorkAmount(10.0);
            }if(list1.get(0).getBranchOfWork().equals("05")){
                uh08OnDuty.setBranchOfWork("01");
                uh08OnDuty.setExWorkAmount(6.0);
                uh08OnDuty.setWorkAmount(6.0);
            }
            }else {
                uh08OnDuty.setBranchOfWork("01");
                uh08OnDuty.setExWorkAmount(6.0);
                uh08OnDuty.setWorkAmount(6.0);
            }

            uh08OnDuty.setWorkDate(new Date());
            uh08OnDutyMapper.insert(uh08OnDuty);
        }

    }
}




