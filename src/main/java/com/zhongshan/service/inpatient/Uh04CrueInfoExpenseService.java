package com.zhongshan.service.inpatient;

import com.zhongshan.entity.inpatient.Uh04CrueInfoExpense;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.HashMap;

/**
* @author 13427
* @description 针对表【uh04_crue_info_expense】的数据库操作Service
* @createDate 2022-05-04 20:07:41
*/
public interface Uh04CrueInfoExpenseService extends IService<Uh04CrueInfoExpense> {

    HashMap<String, Double> selectByDate(Integer year, Integer month);
}
