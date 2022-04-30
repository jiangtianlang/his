package com.zhongshan.controller.businessmanagement;

import com.zhongshan.utils.result.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "工作量统计",tags = "(医院业务管理子系统)工作量统计接口API")
public class WorkloadStatisticsController {
    @RequestMapping(value = "/queryWorkload",method = RequestMethod.GET)
    @ApiOperation(value = "根据姓名和部门工作量查询",notes = "",httpMethod = "GET", response = String.class)
    public R queryWorkload(String person_name, String department){
        return R.ok();
    }
    @RequestMapping(value = "/enteringWorkload",method = RequestMethod.GET)
    @ApiOperation(value = "工作量录入",notes = "",httpMethod = "GET", response = String.class)
    public R enteringWorkload(){
        return R.ok();
    }
}
