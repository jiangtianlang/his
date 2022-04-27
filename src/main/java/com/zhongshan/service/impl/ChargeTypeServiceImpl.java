package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.entity.ChargeType;
import com.zhongshan.service.ChargeTypeService;
import com.zhongshan.mapper.ChargeTypeMapper;
import org.springframework.stereotype.Service;

/**
* @author 13427
* @description 针对表【charge_type】的数据库操作Service实现
* @createDate 2022-04-27 18:13:36
*/
@Service
public class ChargeTypeServiceImpl extends ServiceImpl<ChargeTypeMapper, ChargeType>
    implements ChargeTypeService{

}




