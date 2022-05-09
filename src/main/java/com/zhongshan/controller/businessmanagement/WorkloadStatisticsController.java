package com.zhongshan.controller.businessmanagement;

import com.zhongshan.service.Uh08OnDutyService;
import com.zhongshan.utils.result.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Api(value = "工作量统计",tags = "(医院业务管理子系统)工作量统计接口API")
public class WorkloadStatisticsController {
    @Resource
    private Uh08OnDutyService uh08OnDutyService;
    @RequestMapping(value = "/test/queryWorkload",method = RequestMethod.GET)
    @ApiOperation(value = "根据姓名和部门工作量查询",notes = "",httpMethod = "GET", response = String.class)
    public R queryWorkload(String name){
        return uh08OnDutyService.queryWorkload(name);
    }
    @RequestMapping(value = "/test/enteringWorkload",method = RequestMethod.GET)
    @ApiOperation(value = "工作量录入",notes = "",httpMethod = "GET", response = String.class)
    public R enteringWorkload(){
        return R.ok();
    }
}
