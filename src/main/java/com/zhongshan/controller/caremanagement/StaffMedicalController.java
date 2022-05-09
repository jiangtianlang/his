package com.zhongshan.controller.caremanagement;

import com.zhongshan.entity.Uh05HealthStaff;
import com.zhongshan.service.Uh05HealthStaffService;
import com.zhongshan.utils.result.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "教职工体检表",tags = "(保健档案管理子系统)教职工体检表增删改查")
public class StaffMedicalController {
    private Uh05HealthStaffService uh05HealthStaffService;
    @RequestMapping(value = "/test/insertHealthStaff",method = RequestMethod.GET)
    @ApiOperation(value = "教职工体检信息录入",notes = "",httpMethod = "GET", response = String.class)
    public R insertHealthStaff(Uh05HealthStaff uh05HealthStaff){
        return uh05HealthStaffService.insertHealthStaff(uh05HealthStaff);
    }
    @RequestMapping(value = "/test/bulkInsertHealthStaff",method = RequestMethod.GET)
    @ApiOperation(value = "教职工体检信息批量录入",notes = "",httpMethod = "GET", response = String.class)
    public R bulkInsertHealthStaff(Uh05HealthStaff uh05HealthStaff){
        return R.ok();
    }
    @RequestMapping(value = "/test/updateHealthStaff",method = RequestMethod.GET)
    @ApiOperation(value = "教职工体检信息修改",notes = "",httpMethod = "GET", response = String.class)
    public R updateHealthStaff(Uh05HealthStaff uh05HealthStaff){
        return uh05HealthStaffService.insertHealthStaff(uh05HealthStaff);
    }
    @RequestMapping(value = "/test/deleteHealthStaff",method = RequestMethod.GET)
    @ApiOperation(value = "教职工体检信息删除",notes = "",httpMethod = "GET", response = String.class)
    public R deleteHealthStaff(Uh05HealthStaff uh05HealthStaff){
        return uh05HealthStaffService.deleteHealthStaff(uh05HealthStaff);
    }
    @RequestMapping(value = "/test/selectHealthStaff",method = RequestMethod.GET)
    @ApiOperation(value = "教职工体检信息查询",notes = "",httpMethod = "GET", response = String.class)
    public R selectHealthStaff(Uh05HealthStaff uh05HealthStaff){
        return uh05HealthStaffService.selectHealthStaff(uh05HealthStaff);
    }

}
