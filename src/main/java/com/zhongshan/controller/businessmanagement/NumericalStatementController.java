package com.zhongshan.controller.businessmanagement;

import com.zhongshan.utils.result.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "统计报表生成",tags = "(医院业务管理子系统)统计报表生成接口API")
public class NumericalStatementController {
    @RequestMapping(value = "/outpatientDaily",method = RequestMethod.GET)
    @ApiOperation(value = "门诊日报表",notes = "",httpMethod = "GET", response = String.class)
    public R outpatientDaily(){
        return R.ok();
    }

    @RequestMapping(value = "/inpatientDaily",method = RequestMethod.GET)
    @ApiOperation(value = "住院部日报表",notes = "",httpMethod = "GET", response = String.class)
    public R inpatientDaily(){
        return R.ok();
    }

    @RequestMapping(value = "/workloadDaily",method = RequestMethod.GET)
    @ApiOperation(value = "当日医护人员工作量统计表",notes = "",httpMethod = "GET", response = String.class)
    public R workloadDaily(){
        return R.ok();
    }

    @RequestMapping(value = "/outpatientMonth",method = RequestMethod.GET)
    @ApiOperation(value = "门诊月报表",notes = "",httpMethod = "GET", response = String.class)
    public R outpatientMonth(){
        return R.ok();
    }

    @RequestMapping(value = "/inpatientMonth",method = RequestMethod.GET)
    @ApiOperation(value = "住院部月报表",notes = "",httpMethod = "GET", response = String.class)
    public R inpatientMonth(){
        return R.ok();
    }

    @RequestMapping(value = "/workloadMonth",method = RequestMethod.GET)
    @ApiOperation(value = "医务人员月工作量统计计算",notes = "",httpMethod = "GET", response = String.class)
    public R workloadMonth(){
        return R.ok();
    }

    @RequestMapping(value = "/workloadYear",method = RequestMethod.GET)
    @ApiOperation(value = "医务人员年工作量统计计算",notes = "",httpMethod = "GET", response = String.class)
    public R workloadYear(){
        return R.ok();
    }

    @RequestMapping(value = "/medicalYear",method = RequestMethod.GET)
    @ApiOperation(value = "医疗服务统计",notes = "",httpMethod = "GET", response = String.class)
    public R medical(){
        return R.ok();
    }

    @RequestMapping(value = "/healthPersonnel",method = RequestMethod.GET)
    @ApiOperation(value = "卫生人员数",notes = "",httpMethod = "GET", response = String.class)
    public R healthPersonnel(){
        return R.ok();
    }

    @RequestMapping(value = "/professionalTitles",method = RequestMethod.GET)
    @ApiOperation(value = "主治医师及以上技术职称人员数",notes = "",httpMethod = "GET", response = String.class)
    public R professionalTitles(){
        return R.ok();
    }

    @RequestMapping(value = "/numberBed",method = RequestMethod.GET)
    @ApiOperation(value = "床位数",notes = "",httpMethod = "GET", response = String.class)
    public R numberBed(){
        return R.ok();
    }

    @RequestMapping(value = "/doctorsBySubject",method = RequestMethod.GET)
    @ApiOperation(value = "分科医师数",notes = "",httpMethod = "GET", response = String.class)
    public R doctorsBySubject(){
        return R.ok();
    }

    @RequestMapping(value = "/technician",method = RequestMethod.GET)
    @ApiOperation(value = "分类其它技师",notes = "",httpMethod = "GET", response = String.class)
    public R technician(){
        return R.ok();
    }

}