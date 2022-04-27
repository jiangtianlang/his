package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.entity.Department;
import com.zhongshan.service.DepartmentService;
import com.zhongshan.mapper.DepartmentMapper;
import org.springframework.stereotype.Service;

/**
* @author 13427
* @description 针对表【department】的数据库操作Service实现
* @createDate 2022-04-27 18:13:36
*/
@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department>
    implements DepartmentService{

}




