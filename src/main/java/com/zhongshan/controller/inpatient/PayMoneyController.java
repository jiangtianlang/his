package com.zhongshan.controller.inpatient;


import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhongshan.entity.inpatient.PatientBase;
import com.zhongshan.entity.inpatient.PayMoney;
import com.zhongshan.service.PayMoneyService;
import com.zhongshan.utils.result.R;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
    @PostMapping("selectByLimit")
    public R selectByConditions(
            @RequestBody @ApiParam(name = "patientBaseVo", value = "查询对象", required = true)
                    PayMoney payMoney) {
        List<PayMoney> payMonies = payMoneyService.list();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>page:");
        return R.ok().data("items", payMonies).data("total", payMonies.size());
    }

    @ApiOperation(value = "病人预交款资料录入")
    @PostMapping("add")
    public R add(
            @RequestBody@ApiParam(name = "payMoney", value = "添加对象", required = true)
                    PayMoney payMoney) {
        boolean save = payMoneyService.save(payMoney);

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>patientBase");
        return R.ok().message(save?"添加成功!!":"添加失败!!");
    }

    @ApiOperation(value = "病人预交款资料删除")
    @PostMapping("delete")
    public R delete(
            @RequestBody@ApiParam(name = "payMoney", value = "添加对象", required = true)
                    String patientNo) {


        System.out.println(">>>>>>>>>>>>>>>>>>>>>>patientBase");
        return R.ok().message("删除成功!!");
    }

    @ApiOperation(value = "病人预交款资料修改")
    @PostMapping("update")
    public R update(
            @RequestBody@ApiParam(name = "payMoney", value = "修改对象", required = true)
                    PayMoney payMoney) {


        System.out.println(">>>>>>>>>>>>>>>>>>>>>>payMoney"+payMoney);
        return R.ok().message("修改成功!!");
    }
}