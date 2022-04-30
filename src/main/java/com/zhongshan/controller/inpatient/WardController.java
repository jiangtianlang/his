package com.zhongshan.controller.inpatient;



import com.zhongshan.entity.inpatient.Ward;

import com.zhongshan.service.WardService;
import com.zhongshan.utils.result.R;
import io.swagger.annotations.Api;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.annotation.Resource;
import java.util.List;

/**
 * 
 * @TableName ward
 */
@Api(tags = "(住院管理)床位登记接口")
@RestController
@RequestMapping("/ward")
public class WardController  {
    @Resource
    private WardService wardService;

    @ApiOperation(value = "床位记录查询")
    @PostMapping("selectByLimit")
    public R selectByConditions(
            @RequestBody @ApiParam(name = "patientBaseVo", value = "查询对象", required = true)
                    Ward ward) {
        List<Ward> wards = wardService.list();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>page:");
        return R.ok().data("items", wards).data("total", wards.size());
    }

    @ApiOperation(value = "床位登记")
    @PostMapping("add")
    public R add(
            @RequestBody@ApiParam(name = "payMoney", value = "添加对象", required = true)
                    Ward ward) {
        boolean save = wardService.save(ward);

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>patientBase");
        return R.ok().message(save?"添加成功!!":"添加失败!!");
    }

    @ApiOperation(value = "床位记录删除")
    @PostMapping("delete")
    public R delete(
            @RequestBody@ApiParam(name = "payMoney", value = "添加对象", required = true)
                    String patientNo) {


        System.out.println(">>>>>>>>>>>>>>>>>>>>>>patientBase");
        return R.ok().message("删除成功!!");
    }

    @ApiOperation(value = "床位记录修改")
    @PostMapping("update")
    public R update(
            @RequestBody@ApiParam(name = "payMoney", value = "修改对象", required = true)
                    Ward ward) {


        System.out.println(">>>>>>>>>>>>>>>>>>>>>>payMoney"+ward);
        return R.ok().message("修改成功!!");
    }
}