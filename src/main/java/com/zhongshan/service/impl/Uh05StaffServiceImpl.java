package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.entity.Uh05Staff;
import com.zhongshan.service.Uh05StaffService;
import com.zhongshan.mapper.Uh05StaffMapper;
import com.zhongshan.utils.result.R;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
* @author 13427
* @description 针对表【uh05_staff】的数据库操作Service实现
* @createDate 2022-04-27 18:13:39
*/
@Service
public class Uh05StaffServiceImpl extends ServiceImpl<Uh05StaffMapper, Uh05Staff>
    implements Uh05StaffService{
    @Resource
    private Uh05StaffMapper uh05StaffMapper;
    @Transactional(
            rollbackFor = {Exception.class}
    )
    @Override
    public R insertStaff(Uh05Staff uh05Staff) {
        if(uh05Staff.getStaffNo().length()!=8){
            return R.ok().message("职工号错误");}
        QueryWrapper<Uh05Staff> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("staff_no",uh05Staff.getStaffNo());
        List<Uh05Staff> list=uh05StaffMapper.selectList(queryWrapper);
        if(list.size()!=0){
            R.ok().message("员工信息已录入");
        }
        int row=uh05StaffMapper.insert(uh05Staff);
        if(row>0)
        return R.ok().message("添加成功");
        else
            return R.ok().message("添加失败");
    }

    @Override
    public R updateStaff(Uh05Staff uh05Staff) {
        int row=uh05StaffMapper.updateById(uh05Staff);
        if(row>0)
            return R.ok().message("修改成功");
        else
            return R.ok().message("修改失败");
    }

    @Override
    public R deleteStaff(Uh05Staff uh05Staff) {
        int row=uh05StaffMapper.deleteById(uh05Staff);
        if(row>0)
            return R.ok().message("删除成功");
        else
            return R.ok().message("删除失败");
    }

    @Override
    public R queryStaff(Uh05Staff uh05Staff) {
        QueryWrapper<Uh05Staff> queryWrapper=new QueryWrapper<>();
        if(StringUtils.isNotBlank(uh05Staff.getStaffNo())){
           if(!uh05Staff.getStaffNo().equals("undefined")){
            queryWrapper.like("staff_no",uh05Staff.getStaffNo());}
        }

        if(StringUtils.isNotBlank(uh05Staff.getName())){
            if(!uh05Staff.getName().equals("undefined")){
            queryWrapper.like("name",uh05Staff.getName());}
        }
        queryWrapper.orderByDesc("staff_no");
        List<Uh05Staff> list=uh05StaffMapper.selectList(queryWrapper);
        if(list.size()>0)
            return R.ok().data("data",list);
        else
            return R.ok().message("没有数据");
    }
}




