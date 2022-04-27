package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.dao.DayMoneyDao;
import com.zhongshan.entity.DayMoney;
import com.zhongshan.service.DayMoneyService;
import org.springframework.stereotype.Service;

/**
 * (DayMoney)表服务实现类
 *
 * @author jtl
 * @since 2022-04-27 16:27:25
 */
@Service("dayMoneyService")
public class DayMoneyServiceImpl extends ServiceImpl<DayMoneyDao, DayMoney> implements DayMoneyService {

}
