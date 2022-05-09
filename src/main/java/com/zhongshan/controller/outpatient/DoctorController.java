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
import java.util.List;

@RestController
@Api(value = "医生test",tags = "（门诊子系统）医生数据接口API")
public class DoctorController {
    @Resource
    private DoctorService doctorService;
    @RequestMapping(value = "/test/addDoctor",method = RequestMethod.GET)
    @ApiOperation(value = "添加医生接口",notes = "",httpMethod = "GET", response = String.class)
    public R addDoctor(Doctor doctor){
        boolean b=doctorService.addaddDoctor(doctor);
        if(b){
            return R.ok().message("添加成功");
        }else{
        return R.error().message("添加失败");
        }
    }
    @RequestMapping(value = "/test/deleteDoctor",method = RequestMethod.GET)
    @ApiOperation(value = "删除医生接口",notes = "",httpMethod = "GET", response = String.class)
    public R deleteDoctor(String doctorNo){
        return R.ok();
    }
    @RequestMapping(value = "/test/updateDoctor",method = RequestMethod.GET)
    @ApiOperation(value = "修改医生接口",notes = "",httpMethod = "GET", response = String.class)
    private R updateDoctor(Doctor doctor){
        boolean b=doctorService.updateDoctor(doctor);
        if(b){
            return R.ok().message("修改成功");
        }else{
        return R.error().message("修改失败");
        }
    }
    @RequestMapping(value = "/test/selectDoctor",method = RequestMethod.GET)
    @ApiOperation(value = "查询医生接口",notes = "",httpMethod = "GET", response = String.class)
    public R selectDoctor(String doctorName){
        if(doctorName==null){
            List<Doctor> list=doctorService.selectAllDoctor();
            return R.ok().data("data",list).message("查询成功");
        }
        List<Doctor> list=doctorService.selectDoctor(doctorName);
        return R.ok().data("data",list).message("查询成功");
    }
}
