package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.entity.Uh05HealthStudent;
import com.zhongshan.service.Uh05HealthStudentService;
import com.zhongshan.mapper.Uh05HealthStudentMapper;
import com.zhongshan.utils.result.R;
import org.springframework.stereotype.Service;

/**
* @author 13427
* @description 针对表【uh05_health_student】的数据库操作Service实现
* @createDate 2022-04-27 18:13:39
*/
@Service
public class Uh05HealthStudentServiceImpl extends ServiceImpl<Uh05HealthStudentMapper, Uh05HealthStudent>
    implements Uh05HealthStudentService{
    private Uh05HealthStudentMapper uh05HealthStudentMapper;

    @Override
    public R insertStudentsMedical(Uh05HealthStudent uh05HealthStudent) {
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
}




