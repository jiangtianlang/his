package com.zhongshan.controller.caremanagement;

import com.zhongshan.utils.result.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "特殊情况处理",tags = "(保健档案管理子系统)特殊情况处理接口API")
public class SpecialManagementController {
    @RequestMapping(value = "/registrationOfDeath",method = RequestMethod.POST)
    @ApiOperation(value = "死亡登记",notes = "",httpMethod = "GET", response = String.class)
    public R registrationOfDeath(){
        return R.ok();
    }
    @RequestMapping(value = "/registrationOfContagion",method = RequestMethod.POST)
    @ApiOperation(value = "传染病登记",notes = "",httpMethod = "GET", response = String.class)
    public R registrationOfContagion(){
        return R.ok();
    }
}
