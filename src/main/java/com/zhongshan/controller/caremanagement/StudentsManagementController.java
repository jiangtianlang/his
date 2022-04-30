package com.zhongshan.controller.caremanagement;

import com.zhongshan.entity.Uh05Student;
import com.zhongshan.utils.result.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "学生管理接口",tags = "(保健档案管理子系统)学生管理接口API")
public class StudentsManagementController {
    @RequestMapping(value = "/insertStudent",method = RequestMethod.GET)
    @ApiOperation(value = "学生基本信息录入",notes = "",httpMethod = "GET", response = String.class)
    public R insertStudent(Uh05Student uh05Student){
        return R.ok();
    }
    @RequestMapping(value = "/updateStudent",method = RequestMethod.GET)
    @ApiOperation(value = "学生基本信息修改",notes = "",httpMethod = "GET", response = String.class)
    public R updateStudent(Uh05Student uh05Student){
        return R.ok();
    }
    @RequestMapping(value = "/deleteStudent",method = RequestMethod.GET)
    @ApiOperation(value = "学生基本信息删除",notes = "",httpMethod = "GET", response = String.class)
    public R deleteStudent(Uh05Student uh05Student){
        return R.ok();
    }
    @RequestMapping(value = "/bulkInsertStudent",method = RequestMethod.POST)
    @ApiOperation(value = "学生基本信息批量录入",notes = "",httpMethod = "POST", response = String.class)
    public R bulkInsertStudent(Uh05Student uh05Student){
        return R.ok();
    }
    @RequestMapping(value = "/printStudent",method = RequestMethod.POST)
    @ApiOperation(value = "学生基本信息打印",notes = "",httpMethod = "POST", response = String.class)
    public R printStudent(Uh05Student uh05Student){
        return R.ok();
    }
}
