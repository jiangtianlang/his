package com.zhongshan.controller.pharmacy;

import com.zhongshan.entity.Operation;
import com.zhongshan.entity.Uh03OnStoreC;
import com.zhongshan.service.Uh03StoreOutCService;

import com.zhongshan.utils.result.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

@RestController
@RequestMapping(value = "test/pharmacyOut")
@Api(value = "药品出库管理",tags = "(药房管理系统)药品出库API")
public class OutController {


    @RequestMapping(value = "add")
    @ApiOperation(value ="药品出库接口",notes ="添加出库表",httpMethod = "POST",response = String.class)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "mediNo",value = "药品编号",paramType = "insert",dataType = "String",required = true),
            @ApiImplicitParam(name = "quantity",value = "数量",paramType = "insert",dataType = "String",required = true)
    })
    public R add(String MediNo, Integer Quantity){
        return R.ok().message("药品出库成功");
    }
    @RequestMapping(value = "findById")
    @ApiOperation(value = "根据出库单号查询接口",notes = "根据单号查询",httpMethod = "GET",response = String.class)
    @ApiImplicitParam(name = "outNo",value = "出库单号",paramType = "query",dataType = "String",required = true)
public R findById(Integer id){
        return R.ok().message("查询成功");
}
@RequestMapping(value = "findByTime")
@ApiOperation(value = "根据时间查询接口",notes = "根据时间查询",httpMethod = "GET",response = String.class)
@ApiImplicitParams({
@ApiImplicitParam(name = "startTime",value = "开始时间",paramType = "query",dataType = "String",required = true),
@ApiImplicitParam(name = "startTime",value = "结束时间",paramType = "query",dataType = "String",required = true)
})
public R findByTime(Date startTime,Date endTime){
        return R.ok().message("查询成功");
}
    @RequestMapping(value = "download", method = RequestMethod.POST)
    @ApiOperation(value = "下载信息接口", notes = "下载信息", httpMethod = "POST", response = String.class)
    public R download(Operation operation) {
        return R.ok().message("下载成功");
    }
    @RequestMapping(value = "delete",method = RequestMethod.GET)
    @ApiOperation(value = "入库单删除接口",notes = "条件删除入库单",httpMethod = "GET",response = String.class)
    public R delete(Integer InNo){
        return R.ok().message("删除成功");
    }
}
