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
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@Api(value = "药品仓库test",tags = "(药房管理系统)药品仓库接口API")
@RequestMapping(value = "pharmacy")
public class WarehouseController {
@Resource
  private Uh03OnStoreCService uh03OnStoreCService;

@RequestMapping(value = "findByMN",method = RequestMethod.GET)
@ApiOperation(value = "药品查询库存接口",notes = "输入编码",httpMethod = "GET",response =String.class )
  public R findByMN(){
  List<Uh03OnStoreC> list=uh03OnStoreCService.findMN();
  if (list.size()>0){
  return R.ok().data("data",list).message("查询成功");
  }else {
    return  R.ok().message("没有该药品");
  }
}

@RequestMapping(value = "findallList",method = RequestMethod.GET)
@ApiOperation(value = "库存低于警戒线的药品接口",notes = "",httpMethod = "GET",response = String.class)
public R findallList(){
  List<Uh03OnStoreC> list=uh03OnStoreCService.findallList();
  if (list.size()>0) {
    return R.ok().data("data",list).message("查询成功");
  }else {
    return R.ok().message("没有符合条件的数据");
  }
}

@RequestMapping(value = "findSum",method = RequestMethod.GET)
@ApiOperation(value = "查询总库存量接口",httpMethod = "GET",response = String.class)
public R findSum(){
  Integer uh03OnStoreC= uh03OnStoreCService.findSum();
  return R.ok().data("总库存",uh03OnStoreC).message("查询成功");
}

  @RequestMapping(value = "findallZ",method = RequestMethod.GET)
  @ApiOperation(value = "查询所有中药接口",notes = "",httpMethod = "GET")
  public R findallZ(){
   List<Uh03OnStoreC> list= uh03OnStoreCService.findByZ();
    if (list.size()>0){
      return R.ok().data("data",list).message("查询成功");
    }else {
      return R.ok().message("没有药品");
    }
}

  @RequestMapping(value = "findallH",method = RequestMethod.GET)
  @ApiOperation(value = "查询所有西药接口",notes = "",httpMethod = "GET")
  public R findallH(){
    List<Uh03OnStoreC> list= uh03OnStoreCService.findByH();
    if (list.size()>0){
      return R.ok().data("data",list).message("查询成功");
    }else {
      return R.ok().message("没有药品");
    }
  }
@RequestMapping(value ="findAll",method = RequestMethod.POST)
@ApiOperation(value = "查询所有的药品",notes = "",httpMethod = "POST")
public R findAll(){
  List<Uh03OnStoreC> list=uh03OnStoreCService.findAll();
  if (list.size()>0){
    return R.ok().data("data",list).message("查询成功");
  }else {
    return R.ok().message("没有药品");
  }
}
  @RequestMapping(value = "delete",method = RequestMethod.POST)
  @ApiOperation(value = "删除信息接口",notes = "根据编码删除信息",httpMethod ="POST",response = String.class)
  @ApiImplicitParam(name="mediNo",value = "药品代码",paramType = "update",dataType = "String",required = true)
  public R delete(String mediNo){
   return this.uh03OnStoreCService.removeById(mediNo)? R.ok().message("删除成功"):R.ok().message("删除失败");
  }

  @RequestMapping(value = "download", method = RequestMethod.POST)
  @ApiOperation(value = "下载信息接口", notes = "下载信息", httpMethod = "POST", response = String.class)
  public R download(Operation operation) {
    return R.ok().message("下载成功");
  }

}
