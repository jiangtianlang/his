package com.zhongshan.controller.inpatient;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zhongshan.entity.inpatient.PayMoney;
import com.zhongshan.service.inpatient.PayMoneyService;
import com.zhongshan.utils.result.R;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 
 * @TableName pay_money
 */
@Api(tags = "(住院管理)预交款接口")
@RestController
@RequestMapping("/payMoney")
public class PayMoneyController{
    @Resource
    private PayMoneyService payMoneyService;

    @ApiOperation(value = "病人预交款资料查询")
    @GetMapping("selectByConditions")
    public R selectByConditions(
             @ApiParam(name = "patientBaseVo", value = "查询对象", required = true)
                    PayMoney payMoney) {
        //病人预交款资料查询 单项选择
        QueryWrapper<PayMoney> wrapper = new QueryWrapper<>(payMoney);
        List<PayMoney> payMonies = payMoneyService.list(wrapper);
        return R.ok().data("payMonies", payMonies).data("total", payMonies.size());
    }

//    @ApiOperation(value = "病人预交款资料录入")
//    @PostMapping("add")
//    public R add(
//            @RequestBody@ApiParam(name = "payMoney", value = "添加对象", required = true)
//                    PayMoney payMoney) {
//        boolean save = payMoneyService.save(payMoney);
//        if (save) {
//            return R.ok().message("添加成功!!");
//        } else {
//            return R.error().message("添加失败!!");
//        }
//    }

    @ApiOperation(value = "病人预交款资料批量删除")
    @PostMapping("delete")
    public R delete(
            @RequestBody@ApiParam(name = "payId", value = "删除ById", required = true)
                    List<String> payIds) {

        boolean result = payMoneyService.removeByIds(payIds);
        if (result) {
            return R.ok().message("删除成功!!");
        } else {
            return R.error().message("删除失败!!");
        }
    }

    @ApiOperation(value = "病人预交款资料修改")
    @PostMapping("update")
    public R update(
            @RequestBody@ApiParam(name = "payMoney", value = "修改对象", required = true)
                    PayMoney payMoney) {

        boolean result = payMoneyService.updateById(payMoney);
        if (result) {
            return R.ok().message("修改成功!!");
        } else {
            return R.error().message("修改成功!!");
        }
    }
}