package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.mapper.UhmsLogMapper;
import com.zhongshan.entity.UhmsLog;
import com.zhongshan.service.UhmsLogService;
import org.springframework.stereotype.Service;

/**
 * (UhmsLog)表服务实现类
 *
 * @author jtl
 * @since 2022-04-27 16:27:32
 */
@Service("uhmsLogService")
public class UhmsLogServiceImpl extends ServiceImpl<UhmsLogMapper, UhmsLog> implements UhmsLogService {

}
