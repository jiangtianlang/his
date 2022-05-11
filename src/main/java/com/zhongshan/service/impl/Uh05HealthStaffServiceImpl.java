package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.entity.Uh05HealthStaff;
import com.zhongshan.service.Uh05HealthStaffService;
import com.zhongshan.mapper.Uh05HealthStaffMapper;
import com.zhongshan.utils.result.R;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
* @author 13427
* @description 针对表【uh05_health_staff】的数据库操作Service实现
* @createDate 2022-04-27 18:13:39
*/
@Service
public class Uh05HealthStaffServiceImpl extends ServiceImpl<Uh05HealthStaffMapper, Uh05HealthStaff>
    implements Uh05HealthStaffService{
    @Resource
   private Uh05HealthStaffMapper uh05HealthStaffMapper;
    @Override
    public R insertHealthStaff(Uh05HealthStaff uh05HealthStaff) {
        int row=uh05HealthStaffMapper.insert(uh05HealthStaff);
        if(row>0)
            return R.ok().message("添加成功");
        else
            return R.ok().message("添加失败");
    }

    @Override
    public R selectHealthStaff(Uh05HealthStaff uh05HealthStaff) {
        QueryWrapper<Uh05HealthStaff> queryWrapper=new QueryWrapper<>();
        if(StringUtils.isNotBlank(uh05HealthStaff.getCheckNo())){
            if(!uh05HealthStaff.getCheckNo().equals("undefined")){
            queryWrapper.like("check_no",uh05HealthStaff.getCheckNo());}
        }
        if(StringUtils.isNotBlank(uh05HealthStaff.getStaffNo())){
            if(!uh05HealthStaff.getStaffNo().equals("undefined")){
            queryWrapper.like("staff_no",uh05HealthStaff.getStaffNo());}
        }
        List<Uh05HealthStaff> list=uh05HealthStaffMapper.selectList(queryWrapper);
        if(list.size()>0)
            return R.ok().data("data",list);
        else
            return R.ok().message("没有数据");
    }

    @Override
    public R deleteHealthStaff(Uh05HealthStaff uh05HealthStaff) {
       int row= uh05HealthStaffMapper.deleteById(uh05HealthStaff);
        if(row>0)
            return R.ok().message("删除成功");
        else
            return R.ok().message("删除失败");
    }

    @Override
    public R updateHealthStaff(Uh05HealthStaff uh05HealthStaff) {
        int row=uh05HealthStaffMapper.updateById(uh05HealthStaff);
        if(row>0)
            return R.ok().message("修改成功");
        else
            return R.ok().message("修改失败");
    }
}




