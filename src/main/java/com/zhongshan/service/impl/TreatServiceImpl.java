package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.mapper.TreatMapper;
import com.zhongshan.entity.Treat;
import com.zhongshan.service.TreatService;
import org.springframework.stereotype.Service;

/**
 * (Treat)表服务实现类
 *
 * @author jtl
 * @since 2022-04-27 16:27:29
 */
@Service("treatService")
public class TreatServiceImpl extends ServiceImpl<TreatMapper, Treat> implements TreatService {

}
