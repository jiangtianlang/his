package com.zhongshan.controller.outpatient;

import com.zhongshan.entity.Subject;
import com.zhongshan.service.CheckStandardService;
import com.zhongshan.utils.result.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

@RestController
@Api(value = "检查项目定价资料test",tags = "(门诊子系统)检查项目定价数据接口API")
public class CheckStandardController {
    @Resource
    private CheckStandardService checkStandardService;
    @RequestMapping(value = "/test/addCheckStandard",method = RequestMethod.GET)
    @ApiOperation(value = "检查项目接口",notes = "",httpMethod = "GET", response = R.class)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "check_no",value = " 检查项目代号",paramType = "query",dataType = "String",required = true),
            @ApiImplicitParam(name = "check_name",value = "名称",paramType = "query",dataType = "String",required = true),
            @ApiImplicitParam(name = "check_pay ",value = " 价格",paramType = "query",dataType = "String",required = true),
            @ApiImplicitParam(name = "check_type ",value = "类型",paramType = "query",dataType = "String",required = true)
    })
    public R addCheckStandard(CheckStandardController checkStandard){
        return R.ok();
    }
    @RequestMapping(value = "/test/deleteCheckStandard",method = RequestMethod.GET)
    @ApiOperation(value = "删除检查项目接口",notes = "",httpMethod = "GET", response = R.class)
    public R deleteCheckStandard(String checkNo){
        return R.ok();
    }
    @RequestMapping(value = "/test/updateCheckStandard",method = RequestMethod.GET)
    @ApiOperation(value = "更新检查项目接口",notes = "",httpMethod = "GET", response = R.class)
    private R updateCheckStandard(String checkNo){
        return R.ok();
    }
    @RequestMapping(value = "/test/selectCheckStandard",method = RequestMethod.GET)
    @ApiOperation(value = "查询检查项目接口",notes = "",httpMethod = "GET", response = R.class)
    public R selectCheckStandard(String checkNo){
        return R.ok();
    }

}
