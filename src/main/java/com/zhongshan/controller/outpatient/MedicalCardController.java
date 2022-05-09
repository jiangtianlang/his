package com.zhongshan.controller.outpatient;

import com.zhongshan.service.personBase.MedicalCardService;
import com.zhongshan.utils.result.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
@RestController
@Api(value = "医疗卡号管理test",tags = "（门诊子系统）医疗卡号管理接口API")
public class MedicalCardController {
    @Resource
    private MedicalCardService medicalCardService;
    @RequestMapping(value = "/test/updateState",method = RequestMethod.GET)
    @ApiOperation(value = "医疗卡号挂失接口",notes = "",httpMethod = "GET", response = String.class)
    public R updateState(String personsNo){
        boolean b=medicalCardService.updateState(personsNo);
        if(b){
            return R.ok().message("挂失成功");
        }else{
            return R.error().message("挂失失败");
        }
 }
}
