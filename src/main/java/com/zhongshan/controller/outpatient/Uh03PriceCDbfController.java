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
@Api(value = "药品资料test",tags = "（门诊子系统）药品资料数据接口API")
public class Uh03PriceCDbfController {
    @Resource
    private Uh03PriceCDbfService uh03PriceCDbfService;
    @RequestMapping(value = "/test/selectAll",method = RequestMethod.GET)
    @ApiOperation(value = "渲染药品下拉框接口",notes = "",httpMethod = "GET", response = String.class)
    public R selectAll(){
        List<Uh03PriceCDbf> list=uh03PriceCDbfService.selectAllMedicine();
        return R.ok().data("data",list).message("查询成功");
    }
}
