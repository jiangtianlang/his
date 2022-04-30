package com.zhongshan.controller.pharmacy;


import com.zhongshan.entity.Operation;
import com.zhongshan.entity.Uh03StoreInC;
import com.zhongshan.service.Uh03StoreInCService;
import com.zhongshan.utils.result.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

@RestController
@Api(value = "药品入库test",tags = "(药房管理系统)药品入库接口API")
public class Putcontroller {
@Resource
    private Uh03StoreInCService uh03StoreInCService;
@RequestMapping(value = "test/pharmacyPut/add" ,method = RequestMethod.POST)
@ApiOperation(value = "药品入库接口",notes = "添加药品",httpMethod = "POST", response = String.class)
@ApiImplicitParams({
        @ApiImplicitParam(name = "mediNo",value = "药品编号",paramType = "insert",dataType = "String",required = true),
        @ApiImplicitParam(name = "specification",value = "规格",paramType = "insert",dataType = "String",required = true),
        @ApiImplicitParam(name = "unit",value = "单位",paramType = "insert",dataType = "String",required = true),
        @ApiImplicitParam(name = "unitPrice",value = "单价",paramType = "insert",dataType = "String",required = true),
        @ApiImplicitParam(name = "billNo",value = "发票号码",paramType = "insert",dataType = "String",required = true),
        @ApiImplicitParam(name = "quantity",value = "数量",paramType = "insert",dataType = "Integer",required = true),
        @ApiImplicitParam(name = "comNo",value = "供应商代号",paramType = "insert",dataType = "String",required = true)
})
public String add(Uh03StoreInC uh03StoreInC){
    return uh03StoreInCService.insert(uh03StoreInC)?"成功":"失败";
}
@RequestMapping(value = "test/pharmacyPut/select",method = RequestMethod.GET)
@ApiOperation(value = "药品查询接口",notes = "根据条件查询药品",httpMethod = "GET",response = String.class)
@ApiImplicitParams({
        @ApiImplicitParam(name="inNo",value = "入库单号",paramType = "query",dataType = "String"),
        @ApiImplicitParam(name = "inDate",value = "入库日期",paramType = "query",dataType = "String")
})
public Uh03StoreInC findById(int id, Date date){
    return uh03StoreInCService.findById(id,date);
}
    @RequestMapping(value = "test/pharmacyPut/delete",method = RequestMethod.GET)
    @ApiOperation(value = "入库单删除接口",notes = "条件删除入库单",httpMethod = "GET",response = String.class)
public R delete(Integer InNo){
return R.ok().message("删除成功");
}
    @RequestMapping(value = "test/pharmacyPut/download", method = RequestMethod.POST)
    @ApiOperation(value = "下载信息接口", notes = "下载信息", httpMethod = "POST", response = String.class)
    public R download(Operation operation) {
        return R.ok().message("下载成功");
    }
}
