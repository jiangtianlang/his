package com.zhongshan.controller.outpatient;

import com.zhongshan.entity.Subject;
import com.zhongshan.service.inpatient.SubjectService;
import com.zhongshan.utils.result.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Api(value = "门诊科目test",tags = "门诊科目数据接口API")
public class SubjectKeController {
    @Resource
    private SubjectService subjectService;
    @RequestMapping(value = "/test/addSubject",method = RequestMethod.GET)
    @ApiOperation(value = "添加门诊科目代码接口",notes = "",httpMethod = "GET", response = String.class)
    public R addSubject(Subject subject){
        return R.ok();
    }
    @RequestMapping(value = "/test/deleteSubject",method = RequestMethod.GET)
    @ApiOperation(value = "删除门诊科目代码接口",notes = "",httpMethod = "GET", response = String.class)
    public R deleteSubject(Integer subjectNo){
        return R.ok();
    }
    @RequestMapping(value = "/test/updateSubject",method = RequestMethod.GET)
    @ApiOperation(value = "更新门诊科目代码接口",notes = "",httpMethod = "GET", response = String.class)
    private R updateSubject(Subject subject){
        return R.ok();
    }
    @RequestMapping(value = "/test/selectSubject",method = RequestMethod.GET)
    @ApiOperation(value = "查询门诊科目代码接口",notes = "",httpMethod = "GET", response = String.class)
    public R selectSubject(Subject subject){
        return R.ok();
    }
}
