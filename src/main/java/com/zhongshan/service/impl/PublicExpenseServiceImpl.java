package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.mapper.PublicExpenseMapper;
import com.zhongshan.entity.PublicExpense;
import com.zhongshan.service.PublicExpenseService;
import org.springframework.stereotype.Service;

/**
 * (PublicExpense)表服务实现类
 *
 * @author jtl
 * @since 2022-04-27 16:27:28
 */
@Service("publicExpenseService")
public class PublicExpenseServiceImpl extends ServiceImpl<PublicExpenseMapper, PublicExpense> implements PublicExpenseService {

}
