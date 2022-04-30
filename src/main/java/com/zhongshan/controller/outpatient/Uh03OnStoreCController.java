package com.zhongshan.controller.outpatient;

import com.zhongshan.entity.Uh03OnStoreC;
import com.zhongshan.service.Uh03OnStoreCService;
import com.zhongshan.utils.result.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Api(value = "在库药品资料test",tags = "在库药品数据接口API")
public class Uh03OnStoreCController {
    @Resource
    private Uh03OnStoreCService uh03OnStoreCService;
    @RequestMapping(value = "/test/updateCount",method = RequestMethod.GET)
    @ApiOperation(value = "更新药品库存接口",notes = "药品代号mediNo和药品数量quantity",httpMethod = "GET", response = String.class)
    public  R updateCount(String mediNo,Integer quantity){
        return R.ok();
    }

}
