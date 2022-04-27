package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.mapper.StandardExpenseMapper;
import com.zhongshan.entity.StandardExpense;
import com.zhongshan.service.StandardExpenseService;
import org.springframework.stereotype.Service;

/**
 * (StandardExpense)表服务实现类
 *
 * @author jtl
 * @since 2022-04-27 16:27:29
 */
@Service("standardExpenseService")
public class StandardExpenseServiceImpl extends ServiceImpl<StandardExpenseMapper, StandardExpense> implements StandardExpenseService {

}
