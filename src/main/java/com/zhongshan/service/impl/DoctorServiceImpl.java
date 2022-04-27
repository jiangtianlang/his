package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.entity.Doctor;
import com.zhongshan.service.DoctorService;
import com.zhongshan.mapper.DoctorMapper;
import org.springframework.stereotype.Service;

/**
* @author 13427
* @description 针对表【doctor】的数据库操作Service实现
* @createDate 2022-04-27 18:13:38
*/
@Service
public class DoctorServiceImpl extends ServiceImpl<DoctorMapper, Doctor>
    implements DoctorService{

}




