package com.zhongshan.controller.caremanagement;

import com.zhongshan.entity.Uh05Staff;
import com.zhongshan.service.Uh05StaffService;
import com.zhongshan.utils.result.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Api(value = "教职工管理接口",tags = "(保健档案管理子系统)教职工管理接口API")
public class StaffManagementController {
    @Resource
    private Uh05StaffService uh05StaffService;
    @RequestMapping(value = "/test/insertStaff",method = RequestMethod.GET)
    @ApiOperation(value = "教职工基本信息录入",notes = "",httpMethod = "GET", response = String.class)
    public R insertStaff(Uh05Staff uh05Staff){
        return uh05StaffService.insertStaff(uh05Staff);
    }
    @RequestMapping(value = "/test/updateStaff",method = RequestMethod.GET)
    @ApiOperation(value = "教职工基本信息修改",notes = "",httpMethod = "GET", response = String.class)
    public R updateStaff(Uh05Staff uh05Staff){
        return uh05StaffService.updateStaff(uh05Staff);
    }
    @RequestMapping(value = "/test/deleteStaff",method = RequestMethod.GET)
    @ApiOperation(value = "教职工基本信息删除",notes = "",httpMethod = "GET", response = String.class)
    public R deleteStaff(Uh05Staff uh05Staff){
        return uh05StaffService.deleteStaff(uh05Staff);
    }
    @RequestMapping(value = "/test/queryStaff",method = RequestMethod.GET)
    @ApiOperation(value = "教职工基本信息查询",notes = "",httpMethod = "GET", response = String.class)
    public R queryStaff(Uh05Staff uh05Staff){
        return uh05StaffService.queryStaff(uh05Staff);
    }

    @RequestMapping(value = "/bulkInsertStaff",method = RequestMethod.POST)
    @ApiOperation(value = "教职工基本信息批量录入",notes = "",httpMethod = "POST", response = String.class)
    public R bulkInsertStaff(Uh05Staff uh05Staff){
        return R.ok();
    }
    @RequestMapping(value = "/printStaff",method = RequestMethod.POST)
    @ApiOperation(value = "教职工基本信息打印",notes = "",httpMethod = "POST", response = String.class)
    public R printStaff(Uh05Staff uh05Staff){
        return R.ok();
    }
}
