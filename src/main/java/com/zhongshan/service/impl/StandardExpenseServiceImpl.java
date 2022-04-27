package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.entity.StandardExpense;
import com.zhongshan.service.StandardExpenseService;
import com.zhongshan.mapper.StandardExpenseMapper;
import org.springframework.stereotype.Service;

/**
* @author 13427
* @description 针对表【standard_expense】的数据库操作Service实现
* @createDate 2022-04-27 18:13:38
*/
@Service
public class StandardExpenseServiceImpl extends ServiceImpl<StandardExpenseMapper, StandardExpense>
    implements StandardExpenseService{

}




