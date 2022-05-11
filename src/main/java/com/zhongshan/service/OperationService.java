package com.zhongshan.service;

import com.zhongshan.entity.Diagnose;
import com.zhongshan.entity.Operation;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zhongshan.entity.vo.OperationVo;

import java.util.List;

/**
* @author 13427
* @description 针对表【operation】的数据库操作Service
* @createDate 2022-04-27 18:13:38
*/
public interface OperationService extends IService<Operation> {

    List<Operation> findAll();

    List<OperationVo> findId(OperationVo operationVo);

    int insert(Operation operation);

    int updateBy(Operation operation);
}
