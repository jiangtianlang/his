package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.mapper.DoctorMapper;
import com.zhongshan.entity.Doctor;
import com.zhongshan.service.DoctorService;
import org.springframework.stereotype.Service;

/**
 * (Doctor)表服务实现类
 *
 * @author jtl
 * @since 2022-04-27 16:27:26
 */
@Service("doctorService")
public class DoctorServiceImpl extends ServiceImpl<DoctorMapper, Doctor> implements DoctorService {

}
