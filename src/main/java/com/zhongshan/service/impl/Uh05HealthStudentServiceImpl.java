package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.entity.Uh05HealthStudent;
import com.zhongshan.entity.Uh05HealthStudentM;
import com.zhongshan.entity.Uh05Student;
import com.zhongshan.mapper.Uh05HealthStudentMMapper;
import com.zhongshan.service.Uh05HealthStudentService;
import com.zhongshan.mapper.Uh05HealthStudentMapper;
import com.zhongshan.utils.result.R;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
* @author 13427
* @description 针对表【uh05_health_student】的数据库操作Service实现
* @createDate 2022-04-27 18:13:39
*/
@Service
public class Uh05HealthStudentServiceImpl extends ServiceImpl<Uh05HealthStudentMapper, Uh05HealthStudent>
    implements Uh05HealthStudentService{
    @Resource
    private Uh05HealthStudentMapper uh05HealthStudentMapper;
    @Transactional(
            rollbackFor = {Exception.class}
    )
    @Override
    public R insertStudentsMedical(Uh05HealthStudent uh05HealthStudent) {
        QueryWrapper<Uh05HealthStudent> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("check_no",uh05HealthStudent.getCheckNo());
        List<Uh05HealthStudent> list=uh05HealthStudentMapper.selectList(queryWrapper);
        if(list.size()!=0){
            return R.ok().message("该体检单已录入");
        }
        int row =uh05HealthStudentMapper.insert(uh05HealthStudent);
        if(row>0)
           return R.ok().message("添加成功");
        else
            return R.ok().message("添加失败");
    }

    @Override
    public R deleteStudentsMedical(Uh05HealthStudent uh05HealthStudent) {
        int row =uh05HealthStudentMapper.deleteById(uh05HealthStudent);
        if(row>0)
            return R.ok().message("删除成功");
        else
            return R.ok().message("删除失败");
    }

    @Override
    public R updateStudentsMedical(Uh05HealthStudent uh05HealthStudent) {
        int row =uh05HealthStudentMapper.updateById(uh05HealthStudent);
        if(row>0)
            return R.ok().message("修改成功");
        else
            return R.ok().message("修改失败");
    }
    @Resource
    private Uh05HealthStudentMMapper uh05HealthStudentMMapper;
    @Override
    public R queryStudentsMedical(Uh05HealthStudent uh05HealthStudent) {
        QueryWrapper<Uh05HealthStudent> queryWrapper=new QueryWrapper<>();
        QueryWrapper<Uh05HealthStudentM> queryWrapper1=new QueryWrapper<>();
        if(uh05HealthStudent.getStudentNo()!=null){
            if(!uh05HealthStudent.getStudentNo().equals("undefined")){
//                queryWrapper1.like("student_no",uh05HealthStudent.getStudentNo());
               queryWrapper.like("student_no",uh05HealthStudent.getStudentNo());
            }
        }
        if(uh05HealthStudent.getCheckNo()!=null){
            if(!uh05HealthStudent.getCheckNo().equals("undefined")){
//                queryWrapper1.like("student_no",uh05HealthStudent.getStudentNo());
                queryWrapper.like("check_no",uh05HealthStudent.getCheckNo());
            }
        }
        queryWrapper.orderByDesc("student_no");
        List<Uh05HealthStudent> list=uh05HealthStudentMapper.selectList(queryWrapper);
//        List<Uh05HealthStudentM> list1=uh05HealthStudentMMapper.selectList(queryWrapper1);
        if(list.size()>0)
            return R.ok().data("data",list);
        else
            return R.ok().message("没有数据");
    }
}




