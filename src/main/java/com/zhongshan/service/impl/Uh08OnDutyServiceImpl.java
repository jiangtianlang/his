package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.entity.Uh05Staff;
import com.zhongshan.entity.Uh08OnDuty;
import com.zhongshan.mapper.Uh05StaffMapper;
import com.zhongshan.service.Uh08OnDutyService;
import com.zhongshan.mapper.Uh08OnDutyMapper;
import com.zhongshan.utils.result.R;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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
        String branchOfWork="02";
        QueryWrapper<Uh08OnDuty> queryWrapper=new QueryWrapper<>();
        Date date=new Date();
        queryWrapper.like("branch_of_work",branchOfWork);
        queryWrapper.like("work_date",date);
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
    public R queryWorkload(String name, String department) {
        QueryWrapper<Uh08OnDuty> queryWrapper=new QueryWrapper<>();
        if(StringUtils.isNotBlank(name)){
            QueryWrapper<Uh05Staff> queryWrapper1=new QueryWrapper<>();
            queryWrapper1.like("name",name);
            List<Uh05Staff> list=uh05StaffMapper.selectList(queryWrapper1);
            queryWrapper.like("staff_no",list.get(0).getName());
        }
        if(StringUtils.isNotBlank(department)){
            queryWrapper.like("department",department);
        }
        List<Uh08OnDuty> list=uh08OnDutyMapper.selectList(queryWrapper);
        if(list.size()>0)
            return R.ok().data("data",list);
        else
            return R.ok().message("没有数据");
    }
}




