package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.entity.Uh05StandardNutritionStudent;
import com.zhongshan.service.Uh05StandardNutritionStudentService;
import com.zhongshan.mapper.Uh05StandardNutritionStudentMapper;
import com.zhongshan.utils.result.R;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author 13427
* @description 针对表【uh05_standard_nutrition_student】的数据库操作Service实现
* @createDate 2022-04-27 18:13:39
*/
@Service
public class Uh05StandardNutritionStudentServiceImpl extends ServiceImpl<Uh05StandardNutritionStudentMapper, Uh05StandardNutritionStudent>
    implements Uh05StandardNutritionStudentService{
   private Uh05StandardNutritionStudentMapper uh05StandardNutritionStudentMapper;
    @Override
    public R insertStandardNutrition(Uh05StandardNutritionStudent uh05StandardNutritionStudent) {
        int row=uh05StandardNutritionStudentMapper.insert(uh05StandardNutritionStudent);
        if(row>0)
            return R.ok().message("添加成功");
        else
            return R.ok().message("添加失败");
    }

    @Override
    public R updateStandardNutrition(Uh05StandardNutritionStudent uh05StandardNutritionStudent) {
        int row=uh05StandardNutritionStudentMapper.updateById(uh05StandardNutritionStudent);
        if(row>0)
            return R.ok().message("修改成功");
        else
            return R.ok().message("修改失败");
    }

    @Override
    public void queryStandardNutrition(Uh05StandardNutritionStudent uh05StandardNutritionStudent) {
        QueryWrapper<Uh05StandardNutritionStudent> queryWrapper=new QueryWrapper<>();
        if(StringUtils.isNotBlank(uh05StandardNutritionStudent.getSex())){
            queryWrapper.like("sex",uh05StandardNutritionStudent.getSex());
        }
        if(uh05StandardNutritionStudent.getAge()!=null){
            queryWrapper.like("age",uh05StandardNutritionStudent.getAge());
        }
        if(uh05StandardNutritionStudent.getHight()!=null){
            queryWrapper.like("hight",uh05StandardNutritionStudent.getHight());
        }
        List<Uh05StandardNutritionStudent> list=uh05StandardNutritionStudentMapper.selectList(queryWrapper);
    }
}




