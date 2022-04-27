package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.dao.ChargeTypeDao;
import com.zhongshan.entity.ChargeType;
import com.zhongshan.service.ChargeTypeService;
import org.springframework.stereotype.Service;

/**
 * (ChargeType)表服务实现类
 *
 * @author jtl
 * @since 2022-04-27 16:27:25
 */
@Service("chargeTypeService")
public class ChargeTypeServiceImpl extends ServiceImpl<ChargeTypeDao, ChargeType> implements ChargeTypeService {

}
