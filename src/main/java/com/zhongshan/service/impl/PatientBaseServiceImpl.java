package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.entity.PatientBase;
import com.zhongshan.service.PatientBaseService;
import com.zhongshan.mapper.PatientBaseMapper;
import org.springframework.stereotype.Service;

/**
* @author 13427
* @description 针对表【patient_base】的数据库操作Service实现
* @createDate 2022-04-27 18:13:38
*/
@Service
public class PatientBaseServiceImpl extends ServiceImpl<PatientBaseMapper, PatientBase>
    implements PatientBaseService{

}




