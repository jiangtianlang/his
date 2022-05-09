package com.zhongshan.controller.pharmacy;

import com.zhongshan.entity.Firstpage;
import com.zhongshan.entity.Uh03CompanyList;
import com.zhongshan.entity.Uh03OnStoreC;
import com.zhongshan.service.Uh03CompanyListService;
import com.zhongshan.utils.result.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Api(value = "供应商test",tags = "(药房管理系统)供应商接口API")
@RequestMapping(value = "test/supplier")
public class SupplierController {
    @Resource
    Uh03CompanyListService uh03CompanyListService;
    @RequestMapping(value = "insert",method = RequestMethod.POST)
    @ApiOperation(value = "供应商添加接口",notes = "输入信息",httpMethod = "POST",response = String.class)
    public R insert(@RequestBody Uh03CompanyList uh03CompanyList){
        int row =uh03CompanyListService.add(uh03CompanyList);
        if (row>0){
            return R.ok().message("添加成功");
        }else if(row==-1){
            return R.ok().message("电话格式不对");
        }
        else {
            return R.ok().message("添加失败");
        }
    }
    @RequestMapping(value = "update",method = RequestMethod.POST)
    @ApiOperation(value = "供应商修改接口",notes = "根据id修改",httpMethod = "POST",response = String.class)
    public R update(@RequestBody Uh03CompanyList uh03CompanyList){
        int row=uh03CompanyListService.select(uh03CompanyList);
        if (row>0){
            return R.ok().message("修改成功");
        }else {
            return R.ok().message("修改失败");
        }
    }
    @RequestMapping(value = "drown",method = RequestMethod.POST)
    @ApiOperation(value = "供应商下载接口",notes = "输入信息",httpMethod = "POST",response = String.class)
    public R drown(){
        return R.ok().message("修改成功");
    }

    @RequestMapping(value = "delete",method = RequestMethod.POST)
    @ApiOperation(value = "供应商删除接口",notes = "输入信息",httpMethod = "POST",response = String.class)
    public R delete(Integer comId){
        return   this.uh03CompanyListService.removeById(comId)?R.ok().message("删除成功"):R.ok().message("删除失败");
    }

    @RequestMapping(value = "query",method = RequestMethod.POST)
    @ApiOperation(value = "供应商查询接口",notes = "输入信息",httpMethod = "POST",response = String.class)
    public R query(){
        List<Uh03CompanyList> list= uh03CompanyListService.findAll();
        if (list.size() > 0) {
            return R.ok().data("data", list).message("查询成功");
        } else {
            return R.ok().message("还没有供应商");
        }
    }

    @RequestMapping(value = "queryById",method = RequestMethod.POST)
    @ApiOperation(value = "供应商条件查询接口",notes = "输入信息",httpMethod = "POST",response = String.class)
    public R queryById(@RequestBody Uh03CompanyList uh03CompanyList){
        List<Uh03CompanyList> list= uh03CompanyListService.findById(uh03CompanyList);
        if (list.size() > 0) {
            return R.ok().data("data", list).message("查询成功");
        } else {
            return R.ok().message("还没有供应商");
        }
    }

}
