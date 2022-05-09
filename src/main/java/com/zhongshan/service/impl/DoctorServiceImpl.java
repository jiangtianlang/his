package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.entity.Doctor;
import com.zhongshan.service.DoctorService;
import com.zhongshan.mapper.DoctorMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
* @author 13427
* @description 针对表【doctor】的数据库操作Service实现
* @createDate 2022-04-27 18:13:38
*/
@Service
public class DoctorServiceImpl extends ServiceImpl<DoctorMapper, Doctor>
    implements DoctorService{
    @Resource
    private DoctorMapper doctorMapper;
    @Override
    public boolean addaddDoctor(Doctor doctor) {
        int rows=doctorMapper.insert(doctor);
        return rows>0?true:false;
    }

    @Override
    public boolean updateDoctor(Doctor doctor) {
        int rows=doctorMapper.updateById(doctor);
        return rows>0?true:false;
    }

    @Override
    public List<Doctor> selectAllDoctor() {
        QueryWrapper<Doctor> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("isdelete",0);
        List<Doctor> list=doctorMapper.selectList(queryWrapper);
        return list;
    }

    @Override
    public List<Doctor> selectDoctor(String doctorName) {
        QueryWrapper<Doctor> queryWrapper=new QueryWrapper<>();
        queryWrapper.like("doctor_name",doctorName);
        queryWrapper.eq("isdelete",0);
        List<Doctor> list=doctorMapper.selectList(queryWrapper);
        return list;
    }
}




