package com.zhongshan.mapper;

import com.zhongshan.entity.PublicExpense;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
* @author 13427
* @description 针对表【public_expense】的数据库操作Mapper
* @createDate 2022-04-27 18:13:38
* @Entity com.zhongshan.entity.PublicExpense
*/
public interface PublicExpenseMapper extends BaseMapper<PublicExpense> {

    List<PublicExpense> findByDate(PublicExpense publicExpense);
}




