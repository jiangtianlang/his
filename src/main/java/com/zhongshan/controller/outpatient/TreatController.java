package com.zhongshan.controller.outpatient;

import com.zhongshan.service.TreatService;
import com.zhongshan.utils.result.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Api(value = "挂号资料test",tags = "挂号数据接口API")
public class TreatController {
    @Resource
    private TreatService treatService;
    @RequestMapping(value = "/test/getNumber",method = RequestMethod.GET)
    @ApiOperation(value = "挂号接口",notes = "医疗卡号personsNo",httpMethod = "GET", response = String.class)
    public R getNumber(String personsNo){
        return R.ok().message("挂号成功");
    }
}
