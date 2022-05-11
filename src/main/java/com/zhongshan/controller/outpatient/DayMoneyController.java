package com.zhongshan.controller.outpatient;

import com.zhongshan.service.DayMoneyService;
import com.zhongshan.utils.result.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Api(value = "医疗卡追加流水test",tags = "（门诊子系统）医疗卡追加流水数据接口API")
public class DayMoneyController {
    @Resource
    private DayMoneyService dayMoneyService;
    @RequestMapping(value = "/addMoney",method = RequestMethod.GET)
    @ApiOperation(value = "追加金额接口",notes = "",httpMethod = "GET", response = String.class)
    public R addMoney(Double dayMoney){
        return R.ok();
    }

}
