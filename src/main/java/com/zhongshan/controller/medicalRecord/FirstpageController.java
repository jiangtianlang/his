package com.zhongshan.controller.medicalRecord;

import com.zhongshan.entity.Firstpage;
import com.zhongshan.service.FirstpageService;
import com.zhongshan.utils.result.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Api(value = "病案首页管理",tags = "(病案管理子系统)病案首页接口API")
@RequestMapping(value = "test/firstPage")
public class FirstpageController {
    @Resource
    private FirstpageService firstpageService;
@RequestMapping(value = "update",method = RequestMethod.POST)
@ApiOperation(value = "病案首页修改接口",notes = "输入信息",httpMethod = "POST")
    public R update(@RequestBody Firstpage firstpage){
    int row =firstpageService.updateBy(firstpage);
    if (row>0) {
        return R.ok().message("修改成功");
    }else if (row==-1){
        return R.ok().message("该人员不是主任医师");
    }else if (row==-2){
        return R.ok().message("该人员不是主治医师");
    }else if (row==-3){
        return R.ok().message("该人员不是住院医师");
    }else if (row==-4){
        return R.ok().message("该人员不是实习医师");
    }
    else {
        return R.ok().message("修改失败");
    }
}


    @RequestMapping(value = "findByfgNum",method = RequestMethod.POST)
    @ApiOperation(value = "病案首页多条件查询接口",notes = "",httpMethod = "POST")
    public R findByfgNum(@RequestBody Firstpage firstpage){
        List<Firstpage> list=firstpageService.queryByNum(firstpage);
        if (list.size()>0){
            return R.ok().data("data",list).message("查询成功");
        }else {
            return R.ok().message("查询失败");
        }
    }
    @RequestMapping(value = "findCount",method = RequestMethod.POST)
    @ApiOperation(value = "病案首页病案号查询住院次数接口",notes = "",httpMethod = "POST")
    public R findCount(String fgNum){
    List<Firstpage> list=firstpageService.findCount(fgNum);
        if (list.size()>0){
            return R.ok().data("data",list).message("查询成功");
        }else {
            return R.ok().message("查询失败");
        }
    }
    @RequestMapping(value = "findall",method = RequestMethod.POST)
    @ApiOperation(value = "病案首页全部查询接口",notes = "",httpMethod = "POST",response = String.class)
    public R findall(){
    List<Firstpage> list=firstpageService.queryAll();
        if (list.size()>0){
            return R.ok().data("data",list).message("查询成功");
        }else {
            return R.ok().message("查询失败");
        }
    }
    @RequestMapping(value = "根据病案号查询病人第几次入院期间的资料",method = RequestMethod.POST)
    @ApiOperation(value = "病案首页全部查询号查询接口",notes = "",httpMethod = "POST",response = String.class)
    public R findCountall(@RequestBody String fgNum,Integer fgTimes){
        List<Firstpage> list=firstpageService.findCountall(fgNum,fgTimes);
        if (list.size()>0){
            return R.ok().data("data",list).message("查询成功");
        }else {
            return R.ok().message("查询失败");
        }
    }


    @RequestMapping(value = "deleteByfgNum",method = RequestMethod.POST)
    @ApiOperation(value = "病案首页病案号删除接口",notes = "输入病案号",httpMethod = "POST",response = String.class)
    @ApiImplicitParam(name = "fgNum",value = "病案号",paramType = "query",dataType = "String",required = true)

    public R deleteByfgNum(String fgNum){
        return   this.firstpageService.removeById(fgNum)?R.ok().message("删除成功"):R.ok().message("删除失败");
}



}
