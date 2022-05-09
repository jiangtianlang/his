package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.entity.Uh03MonthBalanceC;
import com.zhongshan.service.Uh03MonthBalanceCService;
import com.zhongshan.mapper.Uh03MonthBalanceCMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
* @author 13427
* @description 针对表【uh03_month_balance_c】的数据库操作Service实现
* @createDate 2022-04-27 18:13:38
*/
@Service
public class Uh03MonthBalanceCServiceImpl extends ServiceImpl<Uh03MonthBalanceCMapper, Uh03MonthBalanceC>
    implements Uh03MonthBalanceCService{
@Resource
Uh03MonthBalanceCMapper uh03MonthBalanceCMapper;
    @Override
    public List<Uh03MonthBalanceC> queryAll() {
        List<Uh03MonthBalanceC> list=uh03MonthBalanceCMapper.queryAll();
        return list;
    }

    @Override
    public List<Uh03MonthBalanceC> queryById(Uh03MonthBalanceC uh03MonthBalanceC) {
        List<Uh03MonthBalanceC> list=uh03MonthBalanceCMapper.queryById(uh03MonthBalanceC);
        return list;
    }
}




