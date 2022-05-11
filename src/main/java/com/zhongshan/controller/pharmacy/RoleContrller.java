package com.zhongshan.controller.pharmacy;

import com.zhongshan.entity.Department;
import com.zhongshan.entity.Uh03CompanyList;
import com.zhongshan.service.DepartmentService;
import com.zhongshan.utils.result.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Api(value = "部门test",tags = "(药房管理系统)部门接口API")
@RequestMapping(value = "role")
public class RoleContrller {
    @Resource
    DepartmentService departmentService;

    @RequestMapping(value = "insert", method = RequestMethod.POST)
    @ApiOperation(value = "部门添加接口", notes = "输入信息", httpMethod = "POST", response = String.class)
    public R insert(@RequestBody Department department) {
        int row = departmentService.add(department);
        if (row > 0) {
            return R.ok().message("添加成功");
        } else {
            return R.ok().message("添加失败");
        }
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    @ApiOperation(value = "部门修改接口", notes = "输入信息", httpMethod = "POST", response = String.class)
    public R update(@RequestBody Department department) {
        int row = departmentService.select(department);
        if (row > 0) {
            return R.ok().message("修改成功");
        } else {
            return R.ok().message("修改失败");
        }
    }

    @RequestMapping(value = "delete", method = RequestMethod.POST)
    @ApiOperation(value = "部门删除接口", notes = "根据部门Id", httpMethod = "POST", response = String.class)
    public R delete(Integer id) {
        return this.departmentService.removeById(id) ? R.ok().message("删除成功") : R.ok().message("删除失败");
    }

    @RequestMapping(value = "query", method = RequestMethod.POST)
    @ApiOperation(value = "部门查询接口", notes = "输入信息", httpMethod = "POST", response = String.class)
    public R query() {
        List<Department> list = departmentService.findAll();
        if (list.size() > 0) {
            return R.ok().data("data", list).message("查询成功");
        } else {
            return R.ok().message("还没有部门");
        }
    }

    @RequestMapping(value = "queryById", method = RequestMethod.POST)
    @ApiOperation(value = "部门条件查询接口", notes = "输入信息", httpMethod = "POST", response = String.class)
    public R queryById(@RequestBody Department department) {
        List<Department> list = departmentService.findById(department);
        if (list.size() > 0) {
            return R.ok().data("data", list).message("查询成功");
        } else {
            return R.ok().message("还没有部门");
        }

    }
}
