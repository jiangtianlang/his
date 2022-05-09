package com.zhongshan.mapper;

import com.zhongshan.entity.Uh03MonthBalanceC;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
* @author 13427
* @description 针对表【uh03_month_balance_c】的数据库操作Mapper
* @createDate 2022-04-27 18:13:38
* @Entity com.zhongshan.entity.Uh03MonthBalanceC
*/
public interface Uh03MonthBalanceCMapper extends BaseMapper<Uh03MonthBalanceC> {

    void updateByUbc(String mediNo, Double unitPrice,Integer month);

    void updateByOutUbc(String mediNo, Double unitPrice, Integer quantity, int month);

    Double findprice(int month,String mediNo);

    List<Uh03MonthBalanceC> queryAll();

    List<Uh03MonthBalanceC> queryById(Uh03MonthBalanceC uh03MonthBalanceC);
}




