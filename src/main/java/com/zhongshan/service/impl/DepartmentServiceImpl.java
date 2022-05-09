package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.entity.Department;
import com.zhongshan.entity.Uh03CompanyList;
import com.zhongshan.service.DepartmentService;
import com.zhongshan.mapper.DepartmentMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
* @author 13427
* @description 针对表【department】的数据库操作Service实现
* @createDate 2022-04-27 18:13:36
*/
@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department>
    implements DepartmentService{
@Resource
DepartmentMapper departmentMapper;
    @Override
    public int add(Department department) {
        int row= departmentMapper.insert(department);
        if (row>0){
            return row;
        }
        return 0;
    }

    @Override
    public int select(Department department) {
        int row= departmentMapper.updateById(department);
        if (row>0){
            return row;
        }
        return 0;
    }

    @Override
    public List<Department> findAll() {
        List<Department> list = departmentMapper.queryAll();
        return list;
    }

    @Override
    public List<Department> findById(Department department) {
        List<Department> list = departmentMapper.queryById(department);
        return list;
    }
}




