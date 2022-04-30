package com.zhongshan.controller.medicalRecord;

import com.zhongshan.entity.Firstpage;
import com.zhongshan.service.FirstpageService;
import com.zhongshan.utils.result.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Api(value = "病案首页管理",tags = "(病案管理子系统)病案首页接口API")
@RequestMapping(value = "test/firstPage")
public class FirstpageController {
    @Resource
    private FirstpageService firstpageService;
@RequestMapping(value = "update",method = RequestMethod.POST)
@ApiOperation(value = "病案首页修改接口",notes = "输入信息",httpMethod = "POST",response = String.class)
    public R update(Firstpage firstpage){
    return R.ok().message("修改成功");
}
    @RequestMapping(value = "insert",method = RequestMethod.POST)
    @ApiOperation(value = "病案首页添加接口",notes = "输入信息",httpMethod = "POST",response = String.class)

    public R insert(Firstpage firstpage){
        return R.ok().message("添加成功");
    }
    @RequestMapping(value = "findByfgNum",method = RequestMethod.POST)
    @ApiOperation(value = "病案首页病案号查询接口",notes = "输入病案号",httpMethod = "POST",response = String.class)
    @ApiImplicitParam(name = "fgNum",value = "病案号",paramType = "query",dataType = "String",required = true)
    public R findByfgNum(String fgNum){
        return R.ok().message("查询成功");
    }
    @RequestMapping(value = "findall",method = RequestMethod.POST)
    @ApiOperation(value = "病案首页全部查询号查询接口",notes = "输入当前页码数和每页显示的条数",httpMethod = "POST",response = String.class)
    public R findall(Firstpage firstpage,Integer page,Integer linit){
    return R.ok().message("查询成功");
    }
    @RequestMapping(value = "deleteByfgNum",method = RequestMethod.POST)
    @ApiOperation(value = "病案首页病案号删除接口",notes = "输入病案号",httpMethod = "POST",response = String.class)
    @ApiImplicitParam(name = "fgNum",value = "病案号",paramType = "query",dataType = "String",required = true)

    public R deleteByfgNum(String fgNum){
    return R.ok().message("删除成功");
}
    @RequestMapping(value = "download", method = RequestMethod.POST)
    @ApiOperation(value = "下载信息接口", notes = "下载信息", httpMethod = "POST", response = String.class)
    public R download(){
        return R.ok().message("下载成功");
    }
    @RequestMapping(value = "findByfgTimes",method = RequestMethod.POST)
    @ApiOperation(value = "根据条件查询",notes = "根据条件查询根据条件查询",httpMethod = "POST",response = String.class)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "fgNum",value = "病案号",paramType = "query",dataType = "String"),
            @ApiImplicitParam(name = "fgTimes",value = "第几次入院",paramType = "query",dataType = "String")
    })
    public R findByfgTimes(Firstpage firstpage){
        return R.ok().message("查询成功");
    }

}
