package com.zhongshan.controller.businessmanagement;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhongshan.service.FixedAssetsService;
import com.zhongshan.service.PersonsService;
import com.zhongshan.service.personBase.PersonBaseService;
import com.zhongshan.utils.result.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Api(value = "医院基本情况查询",tags = "(医院业务管理子系统)医院基本情况查询接口API")
public class BasicHospitalController {
    @Resource
    private PersonBaseService personBaseService;
    @RequestMapping(value = "/selectPerson",method = RequestMethod.GET)
    @ApiOperation(value = "查询科室人员信息",notes = "",httpMethod = "GET", response = String.class)
    public R selectPerson(){
       // return personBaseService.selectPerson(sectionNo,page,limit);
        return R.ok();
    }
    @Resource
    private PersonsService personsService;
    @RequestMapping(value = "/selectBusiness")
    @ApiOperation(value = "查询职工业务档案",notes = "",httpMethod = "GET", response = String.class)
    public R selectBusiness(String personName, Integer page, Integer limit){
        return R.ok();
    }
    @Resource
    private FixedAssetsService fixedAssetsService;
    @RequestMapping(value = "/selectFixed")
    @ApiOperation(value = "查询医院大型设备",notes = "",httpMethod = "GET", response = String.class)
    public R selectFixed(){
        return R.ok();
    }
}
