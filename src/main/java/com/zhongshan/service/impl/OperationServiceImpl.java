package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.entity.Diagnose;
import com.zhongshan.entity.Operation;
import com.zhongshan.entity.vo.OperationVo;
import com.zhongshan.service.OperationService;
import com.zhongshan.mapper.OperationMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
* @author 13427
* @description 针对表【operation】的数据库操作Service实现
* @createDate 2022-04-27 18:13:38
*/
@Service
public class OperationServiceImpl extends ServiceImpl<OperationMapper, Operation>
    implements OperationService{
@Resource
OperationMapper operationMapper;
    @Override
    public List<Operation> findAll() {
        List<Operation> list=operationMapper.findAll();
        return list;
    }

    @Override
    public List<OperationVo> findId(OperationVo operationVo) {
        List<OperationVo> list=operationMapper.findById(operationVo);
        return list;
    }

    @Override
    public int insert(Operation operation) {
        int row =operationMapper.insert(operation);
        return row;
    }

    @Override
    public int updateBy(Operation operation) {
        int row =operationMapper.updateById(operation);
        return row;
    }
}




