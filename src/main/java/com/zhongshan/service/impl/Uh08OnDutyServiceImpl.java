package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.entity.Uh05Staff;
import com.zhongshan.entity.Uh08OnDuty;
import com.zhongshan.entity.vo.MonthVo;
import com.zhongshan.entity.vo.Uho8OnDutyVo;
import com.zhongshan.mapper.Uh05StaffMapper;
import com.zhongshan.service.Uh08OnDutyService;
import com.zhongshan.mapper.Uh08OnDutyMapper;
import com.zhongshan.utils.result.R;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
      // uh08OnDutyMapper.selectList();
        Date date=new Date();
        String branchOfWork="02";
        QueryWrapper<Uh08OnDuty> queryWrapper=new QueryWrapper<>();
        queryWrapper.like("branch_of_work",branchOfWork);
        queryWrapper.like("work_date",date.toString());
        if(StringUtils.isNotBlank(department)){
            queryWrapper.like("department",department);
        }
        return uh08OnDutyMapper.selectList(queryWrapper);
    }

    @Override
    public R outpatientDaily() {

        return R.ok();
    }
    @Resource
    private Uh05StaffMapper uh05StaffMapper;
    @Override
    public R queryWorkload(String name) {
        QueryWrapper<Uh08OnDuty> queryWrapper=new QueryWrapper<>();
        if(StringUtils.isNotBlank(name)){
            QueryWrapper<Uh05Staff> queryWrapper1=new QueryWrapper<>();
            queryWrapper1.like("name",name);
            List<Uh05Staff> list=uh05StaffMapper.selectList(queryWrapper1);
            queryWrapper.like("staff_no",list.get(0).getName());
            queryWrapper.like("department",name);
        }
        List<Uh08OnDuty> list=uh08OnDutyMapper.selectList(queryWrapper);
        List<Uho8OnDutyVo> list1=new ArrayList<>();
        for (Uh08OnDuty u :list) {
            Uho8OnDutyVo uho8OnDutyVo=new Uho8OnDutyVo();
            uho8OnDutyVo.setStaffNo(u.getStaffNo());
            uho8OnDutyVo.setDepartment(u.getDepartment());
            uho8OnDutyVo.setAverWorkAmount(u.getAverWorkAmount());
            uho8OnDutyVo.setWorkAmount(u.getWorkAmount());
            uho8OnDutyVo.setExWorkAmount(u.getExWorkAmount());
            QueryWrapper<Uh05Staff> queryWrapper1=new QueryWrapper<>();
            queryWrapper1.like("staff_no",u.getStaffNo());
            uho8OnDutyVo.setName(uh05StaffMapper.selectList(queryWrapper1).get(0).getName());
            list1.add(uho8OnDutyVo);
        }
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
}




