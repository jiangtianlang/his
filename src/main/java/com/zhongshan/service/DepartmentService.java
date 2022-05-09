package com.zhongshan.service;

import com.zhongshan.entity.Department;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author 13427
* @description 针对表【department】的数据库操作Service
* @createDate 2022-04-27 18:13:36
*/
public interface DepartmentService extends IService<Department> {

    int add(Department department);

    int select(Department department);

    List<Department> findAll();

    List<Department> findById(Department department);
}
