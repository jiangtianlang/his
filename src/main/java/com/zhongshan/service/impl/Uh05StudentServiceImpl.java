package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.entity.Uh05Student;
import com.zhongshan.service.Uh05StudentService;
import com.zhongshan.mapper.Uh05StudentMapper;
import com.zhongshan.utils.result.R;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
* @author 13427
* @description 针对表【uh05_student】的数据库操作Service实现
* @createDate 2022-04-27 18:13:39
*/
@Service
public class Uh05StudentServiceImpl extends ServiceImpl<Uh05StudentMapper, Uh05Student>
    implements Uh05StudentService{
    @Resource
    private Uh05StudentMapper uh05StudentMapper;
    @Override
    public R insertStudent(Uh05Student uh05Student) {
        int row=uh05StudentMapper.insert(uh05Student);
        if(row>0)
        return R.ok().message("添加成功");
        else
            return R.ok().message("添加失败");
    }

    @Override
    public R updateStudent(Uh05Student uh05Student) {
        int row=uh05StudentMapper.updateById(uh05Student);
        if(row>0)
            return R.ok().message("修改成功");
        else
            return R.ok().message("修改失败");
    }

    @Override
    public R deleteStudent(Uh05Student uh05Student) {
        int row=uh05StudentMapper.deleteById(uh05Student);
        if(row>0)
            return R.ok().message("删除成功");
        else
            return R.ok().message("删除失败");
    }

    @Override
    public R queryStudent(Uh05Student uh05Student) {
        QueryWrapper<Uh05Student> queryWrapper=new QueryWrapper<>();
        if(uh05Student.getStudentNo()!=null){
            if (  !uh05Student.getStudentNo().equals("undefined")) {
                queryWrapper.like("student_no",uh05Student.getStudentNo());
            }
        }

        if(uh05Student.getName()!=null ){
            if ( !uh05Student.getName().equals("undefined")) {
                queryWrapper.like("name",uh05Student.getName());
            }
        }
        List<Uh05Student> list=uh05StudentMapper.selectList(queryWrapper);
        if(list.size()>0)
            return R.ok().data("data",list);
        else
            return R.ok().message("没有数据");
    }
}




