package com.zhongshan.controller.outpatient;

import com.zhongshan.entity.Doctor;
import com.zhongshan.service.DoctorService;
import com.zhongshan.utils.result.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Api(value = "医生test",tags = "医生数据接口API")
public class DoctorController {
    @Resource
    private DoctorService doctorService;
    @RequestMapping(value = "/test/addDoctor",method = RequestMethod.GET)
    @ApiOperation(value = "添加医生接口",notes = "",httpMethod = "GET", response = String.class)
    public R addDoctor(Doctor doctor){
        return R.ok();
    }
    @RequestMapping(value = "/test/deleteDoctor",method = RequestMethod.GET)
    @ApiOperation(value = "删除医生接口",notes = "",httpMethod = "GET", response = String.class)
    public R deleteDoctor(String doctorNo){
        return R.ok();
    }
    @RequestMapping(value = "/test/updateDoctor",method = RequestMethod.GET)
    @ApiOperation(value = "更新医生接口",notes = "",httpMethod = "GET", response = String.class)
    private R updateDoctor(Doctor doctor){
        return R.ok();
    }
    @RequestMapping(value = "/test/selectDoctor",method = RequestMethod.GET)
    @ApiOperation(value = "查询医生接口",notes = "",httpMethod = "GET", response = String.class)
    public R selectDoctor(Doctor doctor){
        return R.ok();
    }
}
