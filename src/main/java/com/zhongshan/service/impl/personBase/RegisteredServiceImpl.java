package com.zhongshan.service.impl.personBase;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.zhongshan.entity.Registered;

import com.zhongshan.mapper.personBase_mapper.RegisteredMapper;
import com.zhongshan.service.personBase.RegisteredService;
import org.springframework.stereotype.Service;

@Service
public class RegisteredServiceImpl extends ServiceImpl<RegisteredMapper, Registered>  implements RegisteredService {
}
