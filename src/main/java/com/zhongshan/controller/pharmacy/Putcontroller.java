package com.zhongshan.controller.pharmacy;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fasterxml.uuid.Generators;
import com.zhongshan.entity.CaseHistory;
import com.zhongshan.entity.Operation;
import com.zhongshan.entity.Uh03StoreInC;
import com.zhongshan.entity.vo.Uh03StoreInCVo;
import com.zhongshan.service.Uh03StoreInCService;
import com.zhongshan.utils.result.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@RestController
@Api(value = "药品入库test",tags = "(药房管理系统)药品入库接口API")
public class Putcontroller {
@Resource
private Uh03StoreInCService uh03StoreInCService;

@RequestMapping(value = "pharmacyPut/add" ,method = RequestMethod.POST)
@ApiOperation(value = "药品入库接口",notes = "添加药品")
//@ApiImplicitParams({
//        @ApiImplicitParam(name = "mediNo",value = "药品代码",paramType = "insert",dataType = "String",required = true),
//        @ApiImplicitParam(name = "specification",value = "规格",paramType = "insert",dataType = "String",required = true),
//        @ApiImplicitParam(name = "unit",value = "单位",paramType = "insert",dataType = "String",required = true),
//        @ApiImplicitParam(name = "unitPrice",value = "单价",paramType = "insert",dataType = "String",required = true),
//        @ApiImplicitParam(name = "billNo",value = "发票号码",paramType = "insert",dataType = "String",required = true),
//        @ApiImplicitParam(name = "quantity",value = "数量",paramType = "insert",dataType = "Integer",required = true),
//        @ApiImplicitParam(name = "comNo",value = "供应商代号",paramType = "insert",dataType = "String",required = true)
//})
public R add(@RequestBody List<Uh03StoreInC>  uh03StoreInCS){
        //UUID Version 1：基于时间的UUID（全球唯一）
        String uuid1 = Generators.timeBasedGenerator().generate().toString();

        for (int i=0;i<uh03StoreInCS.size();i++) {
         uh03StoreInCS.get(i).setInNo(uuid1);
         uh03StoreInCS.get(i).setBillNo(uuid1);

        }
        int row=uh03StoreInCService.insertBatch(uh03StoreInCS);
        if (row>0){
            return R.ok().message("添加成功");
        }else {
            return R.ok().message("添加失败");
        }

}

@RequestMapping(value = "pharmacyPut/selectAll",method = RequestMethod.GET)
@ApiOperation(value = "药品入库订单查询接口",notes = "根据查询所有药品入库订单",httpMethod = "GET")
public R findAll(){
      List list=  uh03StoreInCService.findAll();
        if (list.size()>0) {
            return R.ok().data("data",list).message("查询成功");
        }else {
            return  R.ok().message("没有数据");
        }
}

@RequestMapping(value = "pharmacyPut/select",method = RequestMethod.GET)
@ApiOperation(value = "药品入库查询接口",notes = "根据多条件查询药品入库订单",httpMethod = "GET")
public R findById(@RequestBody Uh03StoreInCVo uh03StoreInCVo){
    List list=uh03StoreInCService.findById(uh03StoreInCVo);
    if (list.size()>0){
        return R.ok().data("data",list).message("查询成功");
    }else {
        return R.ok().message("没有符合的数据");
    }
}
    @RequestMapping(value = "pharmacyPut/delete",method = RequestMethod.POST)
    @ApiOperation(value = "入库单删除接口",notes = "条件删除入库单",httpMethod = "POST")
public R delete(Integer inId){
      return   this.uh03StoreInCService.removeById(inId)?R.ok().message("删除成功"):R.ok().message("删除失败");
}
}
