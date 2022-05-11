package com.zhongshan.mapper;

import com.zhongshan.entity.Operation;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhongshan.entity.vo.OperationVo;

import java.util.List;

/**
* @author 13427
* @description 针对表【operation】的数据库操作Mapper
* @createDate 2022-04-27 18:13:38
* @Entity com.zhongshan.entity.Operation
*/
public interface OperationMapper extends BaseMapper<Operation> {

    List<Operation> findAll();

    List<OperationVo> findById(OperationVo operationVo);
}




