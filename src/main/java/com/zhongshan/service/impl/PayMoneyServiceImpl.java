package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.dao.PayMoneyDao;
import com.zhongshan.entity.PayMoney;
import com.zhongshan.service.PayMoneyService;
import org.springframework.stereotype.Service;

/**
 * (PayMoney)表服务实现类
 *
 * @author jtl
 * @since 2022-04-27 16:27:26
 */
@Service("payMoneyService")
public class PayMoneyServiceImpl extends ServiceImpl<PayMoneyDao, PayMoney> implements PayMoneyService {

}
