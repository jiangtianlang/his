package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.mapper.CheckStandardMapper;
import com.zhongshan.entity.CheckStandard;
import com.zhongshan.service.CheckStandardService;
import org.springframework.stereotype.Service;

/**
 * (CheckStandard)表服务实现类
 *
 * @author jtl
 * @since 2022-04-27 16:27:25
 */
@Service("checkStandardService")
public class CheckStandardServiceImpl extends ServiceImpl<CheckStandardMapper, CheckStandard> implements CheckStandardService {

}
