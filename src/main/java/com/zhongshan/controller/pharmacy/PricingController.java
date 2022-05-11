package com.zhongshan.controller.pharmacy;

import com.zhongshan.entity.Uh03PriceCDbf;
import com.zhongshan.service.Uh03PriceCDbfService;
import com.zhongshan.utils.result.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Api(value = "调价test",tags = "(药房管理系统)药品调价接口API")
@RequestMapping(value = "pricing")
public class PricingController {
    @Resource
    Uh03PriceCDbfService uh03PriceCDbfService;
    @RequestMapping(value = "insert" ,method = RequestMethod.POST)
    @ApiOperation(value = "药品调价接口",notes = "药品调价")
    public R insert(@RequestBody Uh03PriceCDbf uh03PriceCDbf){
      int row= uh03PriceCDbfService.add(uh03PriceCDbf);
      if (row>0){
          return R.ok().message("调价成功");
      }else {
          return R.ok().message("调价失败");
      }
    }
    @RequestMapping(value = "query" ,method = RequestMethod.POST)
    @ApiOperation(value = "药品调价查询接口",notes = "药品调价查询")
    public R queryAll(){
        List<Uh03PriceCDbf> list=uh03PriceCDbfService.queryAll();
        if (list.size()>0){
            return R.ok().data("data",list).message("查询成功");
        }else {
            return R.ok().message("查询失败");
        }
    }
    @RequestMapping(value = "queryByid" ,method = RequestMethod.POST)
    @ApiOperation(value = "药品调价根据条件查询接口",notes = "药品调价查询")
    public R queryByid(@RequestBody Uh03PriceCDbf uh03PriceCDbf){
        List<Uh03PriceCDbf> list=uh03PriceCDbfService.queryByid(uh03PriceCDbf);
        if (list.size()>0){
            return R.ok().data("data",list).message("查询成功");
        }else {
            return R.ok().message("查询失败");
        }
    }

}
