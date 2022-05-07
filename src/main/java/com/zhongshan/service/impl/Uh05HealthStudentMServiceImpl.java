package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.entity.Uh05HealthStudentM;
import com.zhongshan.service.Uh05HealthStudentMService;
import com.zhongshan.mapper.Uh05HealthStudentMMapper;
import com.zhongshan.utils.result.R;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
* @author 13427
* @description 针对表【uh05_health_student_m】的数据库操作Service实现
* @createDate 2022-04-27 18:13:39
*/
@Service
public class Uh05HealthStudentMServiceImpl extends ServiceImpl<Uh05HealthStudentMMapper, Uh05HealthStudentM>
    implements Uh05HealthStudentMService{
    @Resource
    private Uh05HealthStudentMMapper uh05HealthStudentMMapper;

    @Override
    public R insertStudentsMedicalGao(Uh05HealthStudentM uh05HealthStudentM) {
        int row =uh05HealthStudentMMapper.insert(uh05HealthStudentM);
        if(row>0)
        return R.ok().message("添加成功");
        else
            return R.ok().message("添加失败");
    }

    @Override
    public R deleteStudentsMedicalGao(Uh05HealthStudentM uh05HealthStudentM) {
        int row =uh05HealthStudentMMapper.deleteById(uh05HealthStudentM);
        if(row>0)
            return R.ok().message("删除成功");
        else
            return R.ok().message("删除失败");
    }

    @Override
    public R updateStudentsMedicalGao(Uh05HealthStudentM uh05HealthStudentM) {
        int row =uh05HealthStudentMMapper.updateById(uh05HealthStudentM);
        if(row>0)
            return R.ok().message("修改成功");
        else
            return R.ok().message("修改失败");
    }
}




