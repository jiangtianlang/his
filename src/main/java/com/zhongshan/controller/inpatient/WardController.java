package com.zhongshan.controller.inpatient;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zhongshan.entity.inpatient.Ward;

import com.zhongshan.entity.inpatient.WardUse;
import com.zhongshan.service.inpatient.WardService;
import com.zhongshan.service.inpatient.WardUseService;
import com.zhongshan.utils.result.R;
import io.swagger.annotations.Api;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;


import javax.annotation.Resource;
import java.util.List;

/**
 * 
 * @TableName ward
 */
@Api(tags = "(住院管理)床位登记接口")
@RestController
@RequestMapping({"/ward", "/test/ward"})
public class WardController  {
    @Resource
    private WardService wardService;
    @Resource
    private WardUseService wardUseService;

    @ApiOperation(value = "查询空床位接口")
    @GetMapping("selectEmpty")
    public R selectEmpty() {
        QueryWrapper<Ward> wrapper = new QueryWrapper<>();
        wrapper.eq("is_null",1);
        List<Ward> wards = wardService.list(wrapper);
        return R.ok().data("data", wards).data("total", wards.size());
    }

    @ApiOperation(value = "床位记录查询")
    @GetMapping("selectByConditions")
    public R selectByConditions(
            @RequestBody @ApiParam(name = "WardUse", value = "查询对象", required = true)
                    WardUse wardUse) {
        QueryWrapper<WardUse> wrapper = new QueryWrapper<>(wardUse);
        List<WardUse> wardUses = wardUseService.list(wrapper);
        return R.ok().data("items", wardUses).data("total", wardUses.size());
    }

//    @ApiOperation(value = "床位情况登记")
//    @PostMapping("add")
//    public R add(
//            @RequestBody @ApiParam(name = "WardUse", value = "WardUse对象", required = true)
//                    WardUse wardUse) {
//        boolean save = wardUseService.save(wardUse);
//        return R.ok().message(save?"添加成功!!":"添加失败!!");
//    }
    @ApiOperation(value = "床位调整")
    @PostMapping("update")
    public R update(
            @RequestBody @ApiParam(name = "WardUse", value = "WardUse对象", required = true)
                    WardUse wardUse) {

        boolean save = wardUseService.updateById(wardUse);
        if (save) {
            return R.ok().message("修改成功!!");
        } else {
            return R.error();
        }
    }
}