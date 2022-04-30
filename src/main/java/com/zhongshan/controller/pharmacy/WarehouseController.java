package com.zhongshan.controller.pharmacy;

import com.zhongshan.entity.Operation;
import com.zhongshan.entity.Uh03OnStoreC;
import com.zhongshan.service.Uh03OnStoreCService;
import com.zhongshan.service.Uh03StoreWService;
import com.zhongshan.utils.result.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Api(value = "药品仓库test",tags = "(药房管理系统)药品仓库接口API")
@RequestMapping(value = "pharmacy")
public class WarehouseController {
@Resource
  private Uh03OnStoreCService uh03OnStoreCService;
@RequestMapping(value = "findByMN",method = RequestMethod.GET)
@ApiOperation(value = "药品查询库存接口",notes = "输入编码",httpMethod = "GET",response =String.class )
  public R findByMN(String mediNo){
  return R.ok().message("查询成功");
}
@RequestMapping(value = "findallList",method = RequestMethod.GET)
@ApiOperation(value = "库存低于警戒线的药品接口",notes = "输入当前页码数和每页显示的条数",httpMethod = "GET",response = String.class)
public R findallList(Integer Page,Integer limit){
return R.ok().message("查询成功");
}
@RequestMapping(value = "findByCount",method = RequestMethod.GET)
@ApiOperation(value = "查询总库存量接口",httpMethod = "GET",response = String.class)
public R findByCount(){
  return R.ok().message("查询成功");
}
  @RequestMapping(value = "findallZ",method = RequestMethod.GET)
  @ApiOperation(value = "查询所有中药接口",notes = "输入当前页码数和每页显示的条数",httpMethod = "GET",response = String.class)
  public R findallZ(Uh03OnStoreC uh03OnStoreC,Integer Page,Integer limit){
  return R.ok().message("查询成功");
}
  @RequestMapping(value = "findallH",method = RequestMethod.GET)
  @ApiOperation(value = "查询所有西药接口",notes = "输入当前页码数和每页显示的条数",httpMethod = "GET",response = String.class)
  public R findallH(Uh03OnStoreC uh03OnStoreC,Integer Page,Integer limit){
    return R.ok().message("查询成功");
  }
  @RequestMapping(value = "update",method = RequestMethod.POST)
  @ApiOperation(value = "修改信息接口",notes = "根据编码修改信息",httpMethod ="POST",response = String.class)
  @ApiImplicitParams({
          @ApiImplicitParam(name="mediNo",value = "药品代码",paramType = "update",dataType = "String",required = true),
          @ApiImplicitParam(name = "unitPrice",value = "单价",paramType = "update",dataType = "String"),
          @ApiImplicitParam(name = "Quantity",value = "数量",paramType = "update",dataType = "String")
  })
  public R update(String mediNo,Double unitPrice,Integer Quantity){
  return R.ok().message("修改成功");
  }
  @RequestMapping(value = "delete",method = RequestMethod.POST)
  @ApiOperation(value = "删除信息接口",notes = "根据编码删除信息",httpMethod ="POST",response = String.class)
  @ApiImplicitParam(name="mediNo",value = "药品代码",paramType = "update",dataType = "String",required = true)
  public R delete(String mediNo){
  return R.ok().message("删除成功");
  }
  @RequestMapping(value = "download", method = RequestMethod.POST)
  @ApiOperation(value = "下载信息接口", notes = "下载信息", httpMethod = "POST", response = String.class)
  public R download(Operation operation) {
    return R.ok().message("下载成功");
  }

}
