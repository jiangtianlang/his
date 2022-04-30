package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.entity.inpatient.PayMoney;
import com.zhongshan.service.PayMoneyService;
import com.zhongshan.mapper.PayMoneyMapper;
import org.springframework.stereotype.Service;

/**
* @author 13427
* @description 针对表【pay_money】的数据库操作Service实现
* @createDate 2022-04-27 18:13:38
*/
@Service
public class PayMoneyServiceImpl extends ServiceImpl<PayMoneyMapper, PayMoney>
    implements PayMoneyService{

}




