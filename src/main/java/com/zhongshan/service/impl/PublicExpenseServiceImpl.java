package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.entity.PublicExpense;
import com.zhongshan.service.PublicExpenseService;
import com.zhongshan.mapper.PublicExpenseMapper;
import org.springframework.stereotype.Service;

/**
* @author 13427
* @description 针对表【public_expense】的数据库操作Service实现
* @createDate 2022-04-27 18:13:38
*/
@Service
public class PublicExpenseServiceImpl extends ServiceImpl<PublicExpenseMapper, PublicExpense>
    implements PublicExpenseService{

}




