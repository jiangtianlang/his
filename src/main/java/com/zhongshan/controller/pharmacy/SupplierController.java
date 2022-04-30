package com.zhongshan.controller.pharmacy;

import com.zhongshan.entity.Firstpage;
import com.zhongshan.entity.Uh03CompanyList;
import com.zhongshan.utils.result.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "供应商test",tags = "(药房管理系统)供应商接口API")
@RequestMapping(value = "test/supplier")
public class SupplierController {
   @RequestMapping(value = "update",method = RequestMethod.POST)
    @ApiOperation(value = "供应商修改接口",notes = "输入信息",httpMethod = "POST",response = String.class)
    public R update(Uh03CompanyList uh03CompanyList){
        return R.ok().message("修改成功");
    }
    @RequestMapping(value = "drown",method = RequestMethod.POST)
    @ApiOperation(value = "供应商下载接口",notes = "输入信息",httpMethod = "POST",response = String.class)
    public R drown(){
        return R.ok().message("修改成功");
    }
    @RequestMapping(value = "delete",method = RequestMethod.POST)
    @ApiOperation(value = "供应商删除接口",notes = "输入信息",httpMethod = "POST",response = String.class)
    public R delete(Uh03CompanyList uh03CompanyList){
        return R.ok().message("修改成功");
    }
    @RequestMapping(value = "query",method = RequestMethod.POST)
    @ApiOperation(value = "供应商查询接口",notes = "输入信息",httpMethod = "POST",response = String.class)
    public R query(Uh03CompanyList uh03CompanyList){
        return R.ok().message("修改成功");
    }

}
