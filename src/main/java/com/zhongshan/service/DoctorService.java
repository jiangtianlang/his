package com.zhongshan.service;

import com.zhongshan.entity.Doctor;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author 13427
* @description 针对表【doctor】的数据库操作Service
* @createDate 2022-04-27 18:13:38
*/
public interface DoctorService extends IService<Doctor> {

    boolean addaddDoctor(Doctor doctor);

    boolean updateDoctor(Doctor doctor);

    List<Doctor> selectAllDoctor();

    List<Doctor> selectDoctor(String doctorName);
}
