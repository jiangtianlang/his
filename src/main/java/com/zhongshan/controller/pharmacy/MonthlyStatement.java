package com.zhongshan.controller.pharmacy;

import com.zhongshan.entity.Uh03MonthBalanceC;
import com.zhongshan.service.Uh03MonthBalanceCService;
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
@Api(value = "调价test",tags = "(药房管理系统)月结接口API")
@RequestMapping(value = "test/MonthlyStatement")
public class MonthlyStatement {
    @Resource
    Uh03MonthBalanceCService uh03MonthBalanceCService;
    @RequestMapping(value = "query" ,method = RequestMethod.POST)
    @ApiOperation(value = "查询所有月结表接口",notes = "")
    public R  query(){
        List<Uh03MonthBalanceC> list=uh03MonthBalanceCService.queryAll();
        if (list.size()>0){
            return R.ok().data("data",list).message("查询成功");
        }else {
            return R.ok().message("查询失败");
        }
    }
    @RequestMapping(value = "queryByid" ,method = RequestMethod.POST)
    @ApiOperation(value = "多条件查询药品出库接口",notes = "")
    public R  queryById(@RequestBody Uh03MonthBalanceC uh03MonthBalanceC){
        List<Uh03MonthBalanceC> list=uh03MonthBalanceCService.queryById(uh03MonthBalanceC);
        if (list.size()>0){
            return R.ok().data("data",list).message("查询成功");
        }else {
            return R.ok().message("查询失败");
        }
    }
}
