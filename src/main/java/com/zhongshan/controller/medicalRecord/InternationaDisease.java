package com.zhongshan.controller.medicalRecord;

import com.zhongshan.entity.Diagnose;
import com.zhongshan.service.DiagnoseService;
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
@Api(value = "疾病test",tags = "(病案管理子系统)疾病接口API")
@RequestMapping(value = "test/Disease")
public class InternationaDisease {
    @Resource
    private DiagnoseService diagnoseService;

    @RequestMapping(value = "findAll", method = RequestMethod.GET)
    @ApiOperation(value = "查询所有的疾病信息", notes = "输入当前页码数和每页显示的条数", httpMethod = "GET", response = String.class)
    public R findAll(Diagnose diagnose, Integer page, Integer limit) {
        return R.ok().message("查询成功");
    }

    @RequestMapping(value = "findByIcd", method = RequestMethod.GET)
    @ApiOperation(value = "查询信息接口", notes = "根据编码查询信息", httpMethod = "POST", response = String.class)
    @ApiImplicitParam(name = "diseaseIcd9", value = "icd-9编码", paramType = "query", dataType = "String", required = true)
    public R findByIcd(String diseaseIcd9) {
        return R.ok().message("查询成功");
    }

    @RequestMapping(value = "insert", method = RequestMethod.POST)
    @ApiOperation(value = "添加信息接口", notes = "添加信息", httpMethod = "POST", response = String.class)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "diseaseIcd9", value = "icd-9编码", paramType = "query", dataType = "String", required = true),
            @ApiImplicitParam(name = "diseaseCode", value = "拼音码", paramType = "query", dataType = "String", required = true),
            @ApiImplicitParam(name = "diseaseType", value = "疾病分类码", paramType = "query", dataType = "String", required = true),
            @ApiImplicitParam(name = "diseaseName", value = "疾病名称", paramType = "query", dataType = "String", required = true)
    })
    public R insert(Diagnose diagnose) {
        return R.ok().message("添加成功");
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    @ApiOperation(value = "修改信息接口", notes = "修改信息", httpMethod = "POST", response = String.class)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "diseaseIcd9", value = "icd-9编码", paramType = "query", dataType = "String", required = true),
            @ApiImplicitParam(name = "diseaseCode", value = "拼音码", paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = "diseaseType", value = "疾病分类码", paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = "diseaseName", value = "疾病名称", paramType = "query", dataType = "String")
    })
    public R update(Diagnose diagnose) {
        return R.ok().message("修改成功");
    }
    @RequestMapping(value = "download", method = RequestMethod.POST)
    @ApiOperation(value = "下载信息接口", notes = "下载信息", httpMethod = "POST", response = String.class)
    public R download(){
        return R.ok().message("下载成功");
}
    @RequestMapping(value = "deleteByfgNum",method = RequestMethod.POST)
    @ApiOperation(value = "疾病删除接口",notes = "输入icd-9编码",httpMethod = "POST",response = String.class)
    @ApiImplicitParam(name = "diseaseIcd9",value = "icd-9编码",paramType = "query",dataType = "String",required = true)

    public R deleteByfgNum(String diseaseIcd9){
        return R.ok().message("删除成功");
    }
}
