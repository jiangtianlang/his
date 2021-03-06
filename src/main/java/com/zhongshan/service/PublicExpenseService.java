package com.zhongshan.service;

import com.zhongshan.entity.PublicExpense;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author 13427
* @description 针对表【public_expense】的数据库操作Service
* @createDate 2022-04-27 18:13:38
*/
public interface PublicExpenseService extends IService<PublicExpense> {

    List<PublicExpense> findByDate(PublicExpense publicExpense);
}
