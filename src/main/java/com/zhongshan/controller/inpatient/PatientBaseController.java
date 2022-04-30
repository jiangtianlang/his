package com.zhongshan.controller.inpatient;



import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhongshan.entity.inpatient.PatientBase;
import com.zhongshan.service.PatientBaseService;
import com.zhongshan.utils.result.R;
import com.zhongshan.vo.inpatient.PatientBaseVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author jtl
 * @date 2022年04月29日 10:39:27
 */
@Api(tags = "病人基本资料接口")
@RestController
@RequestMapping("/patientBase")
public class PatientBaseController {
    @Resource
    private PatientBaseService patientBaseService;

    @ApiOperation(value = "获取病人基本资料分页列表")
    @PostMapping("selectByLimit")
    public R selectByLimit(
            @RequestBody@ApiParam(name = "patientBaseVo", value = "查询对象", required = true)
                    PatientBaseVo patientBaseVo) {
        //设置分页参数
        Page<PatientBase> patientBasePage = new Page<>(patientBaseVo.getPage(), patientBaseVo.getLimit());
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>page:");
        return R.ok().data("items", patientBasePage.getRecords()).data("total", patientBasePage.getTotal());
    }

    @ApiOperation(value = "病人基本资料表录入")
    @PostMapping("add")
    public R add(
            @RequestBody@ApiParam(name = "patientBase", value = "添加对象", required = true)
                    PatientBase patientBase) {


        System.out.println(">>>>>>>>>>>>>>>>>>>>>>patientBase");
        return R.ok().message("添加成功!!");
    }

    @ApiOperation(value = "病人基本资料表删除")
    @PostMapping("delete")
    public R delete(
            @RequestBody@ApiParam(name = "patientBase", value = "添加对象", required = true)
                    String patientNo) {


        System.out.println(">>>>>>>>>>>>>>>>>>>>>>patientBase");
        return R.ok().message("删除成功!!");
    }

    @ApiOperation(value = "病人基本资料表修改")
    @PostMapping("update")
    public R update(
            @RequestBody@ApiParam(name = "patientBase", value = "添加对象", required = true)
                    PatientBase patientBase) {


        System.out.println(">>>>>>>>>>>>>>>>>>>>>>patientBase");
        return R.ok().message("修改成功!!");
    }

}
