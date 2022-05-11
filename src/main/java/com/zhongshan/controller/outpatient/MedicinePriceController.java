package com.zhongshan.controller.outpatient;

import com.zhongshan.entity.Uh03PriceCDbf;
import com.zhongshan.service.Uh03PriceCDbfService;
import com.zhongshan.utils.result.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Api(value = "药品价格管理test",tags = "（门诊子系统）药品价格管理接口API")
public class MedicinePriceController {
    @Resource
    Uh03PriceCDbfService uh03PriceCDbfService;
    @RequestMapping(value = "/selectAllMedicine",method = RequestMethod.GET)
    @ApiOperation(value = "查询所有药品接口",notes = "",httpMethod = "GET", response = String.class)
    public  R selectAllMedicine(){
        List<Uh03PriceCDbf> list=uh03PriceCDbfService.selectAllMedicine();
        return R.ok().data("data",list).message("查询成功");
    }

}
