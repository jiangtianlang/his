package com.zhongshan.service;

import com.zhongshan.entity.Uh03MonthBalanceC;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author 13427
* @description 针对表【uh03_month_balance_c】的数据库操作Service
* @createDate 2022-04-27 18:13:38
*/
public interface Uh03MonthBalanceCService extends IService<Uh03MonthBalanceC> {

    List<Uh03MonthBalanceC> queryAll();

    List<Uh03MonthBalanceC> queryById(Uh03MonthBalanceC uh03MonthBalanceC);
}
