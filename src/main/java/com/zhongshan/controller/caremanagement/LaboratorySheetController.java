package com.zhongshan.controller.caremanagement;

import com.zhongshan.entity.Sp05Electrocardiogram;
import com.zhongshan.entity.Sp05Ultrasonic;
import com.zhongshan.utils.result.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "化验单",tags = "(保健档案管理子系统)化验单录入,修改,删除")
public class LaboratorySheetController {
    //1．心电图报告单录入、修改、删除
    @RequestMapping(value = "/insertElectrocardiograph")
    @ApiOperation(value = "心电图化验单录入",notes = "",httpMethod = "GET", response = String.class)
    public R insertElectrocardiograph(Sp05Electrocardiogram sp05Electrocardiogram){
        return R.ok();
    }
    @RequestMapping(value = "/updateElectrocardiograph")
    @ApiOperation(value = "心电图化验单修改",notes = "",httpMethod = "GET", response = String.class)
    public R updateElectrocardiograph(Sp05Electrocardiogram sp05Electrocardiogram){
        return R.ok();
    }
    @RequestMapping(value = "/deleteElectrocardiograph")
    @ApiOperation(value = "心电图化验单删除",notes = "",httpMethod = "GET", response = String.class)
    public R deleteElectrocardiograph(Sp05Electrocardiogram sp05Electrocardiogram){
        return R.ok();
    }
    //2．b超显象报告单录入、修改、删除
    @RequestMapping(value = "/insertUltrasonic")
    @ApiOperation(value = "心电图化验单录入",notes = "",httpMethod = "GET", response = String.class)
    public R insertUltrasonic(Sp05Ultrasonic sp05Ultrasonic){
        return R.ok();
    }
    @RequestMapping(value = "/updateUltrasonic")
    @ApiOperation(value = "心电图化验单修改",notes = "",httpMethod = "GET", response = String.class)
    public R updateUltrasonic(Sp05Ultrasonic sp05Ultrasonic){
        return R.ok();
    }
    @RequestMapping(value = "/deleteUltrasonic")
    @ApiOperation(value = "心电图化验单删除",notes = "",httpMethod = "GET", response = String.class)
    public R deleteUltrasonic(Sp05Ultrasonic sp05Ultrasonic){
        return R.ok();
    }
    //3．肝微量检验单录入、修改、删除
    //4．小便检验单录入、修改、删除
    //5．胸透检验单录入、修改、删除
    //6．妇科检验单录入、修改、删除
}
