package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.mapper.OperationMapper;
import com.zhongshan.entity.Operation;
import com.zhongshan.service.OperationService;
import org.springframework.stereotype.Service;

/**
 * (Operation)表服务实现类
 *
 * @author jtl
 * @since 2022-04-27 16:27:26
 */
@Service("operationService")
public class OperationServiceImpl extends ServiceImpl<OperationMapper, Operation> implements OperationService {

}
