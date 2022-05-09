package com.zhongshan.controller.pharmacy;

import com.fasterxml.uuid.Generators;
import com.zhongshan.entity.Operation;
import com.zhongshan.entity.Uh03OnStoreC;
import com.zhongshan.entity.Uh03StoreInC;
import com.zhongshan.entity.Uh03StoreOutC;
import com.zhongshan.entity.vo.Uh03StoreInCVo;
import com.zhongshan.entity.vo.Uh03StoreOutVo;
import com.zhongshan.service.Uh03StoreOutCService;

import com.zhongshan.utils.result.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "test/pharmacyOut")
@Api(value = "药品出库管理",tags = "(药房管理系统)药品出库API")
public class OutController {
@Resource
Uh03StoreOutCService uh03StoreOutCService;
    @RequestMapping(value = "add" ,method = RequestMethod.POST)
    @ApiOperation(value = "药品出库库接口",notes = "")
//@ApiImplicitParams({
//        @ApiImplicitParam(name = "mediNo",value = "药品代码",paramType = "insert",dataType = "String",required = true),
//        @ApiImplicitParam(name = "specification",value = "规格",paramType = "insert",dataType = "String",required = true),
//        @ApiImplicitParam(name = "unit",value = "单位",paramType = "insert",dataType = "String",required = true),
//        @ApiImplicitParam(name = "unitPrice",value = "单价",paramType = "insert",dataType = "String",required = true),
//        @ApiImplicitParam(name = "billNo",value = "发票号码",paramType = "insert",dataType = "String",required = true),
//        @ApiImplicitParam(name = "quantity",value = "数量",paramType = "insert",dataType = "Integer",required = true),
//        @ApiImplicitParam(name = "comNo",value = "供应商代号",paramType = "insert",dataType = "String",required = true)
//})
    public R add(@RequestBody List<Uh03StoreOutC> uh03StoreOutCS) {
        //UUID Version 1：基于时间的UUID（全球唯一）
        String uuid1 = Generators.timeBasedGenerator().generate().toString();

        for (int i = 0; i < uh03StoreOutCS.size(); i++) {
            uh03StoreOutCS.get(i).setOutNo(uuid1);

        }
        int row = uh03StoreOutCService.insertBatch(uh03StoreOutCS);
        if (row > 0) {
            return R.ok().message("出库成功");
        } else if(row==-1){
            return R.ok().message("没有该药品");
        }else if(row==-2){
            return R.ok().message("药品数量不够");
        }
        else {
            return R.ok().message("出库失败");
        }

    }
    @RequestMapping(value = "query" ,method = RequestMethod.POST)
    @ApiOperation(value = "查询药品出库接口",notes = "")
    public  R query(){
        List<Uh03StoreOutC> list=uh03StoreOutCService.queryAll();
        if (list.size()>0){
            return R.ok().data("data",list).message("查询成功");
        }else {
            return R.ok().message("查询失败");
        }
    }

    @RequestMapping(value = "selectbyid",method = RequestMethod.GET)
    @ApiOperation(value = "药品入库查询接口",notes = "根据多条件查询药品入库订单",httpMethod = "GET",response = String.class)
    public R findById(@RequestBody Uh03StoreOutVo uh03StoreOutVo){
        List<Uh03StoreOutVo> list=uh03StoreOutCService.findById(uh03StoreOutVo);
        if (list.size()>0){
            return R.ok().data("data",list).message("查询成功");
        }else {
            return R.ok().message("没有符合的数据");
        }
    }

    @RequestMapping(value = "delete",method = RequestMethod.GET)
    @ApiOperation(value = "入库单删除接口",notes = "条件删除入库单",httpMethod = "GET",response = String.class)
    public R delete(Integer id){
        return   this.uh03StoreOutCService.removeById(id)?R.ok().message("删除成功"):R.ok().message("删除失败");
    }
}
