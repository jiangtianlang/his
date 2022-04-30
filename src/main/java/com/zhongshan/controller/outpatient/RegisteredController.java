package com.zhongshan.controller.outpatient;

import com.zhongshan.entity.Registered;
import com.zhongshan.service.personBase.RegisteredService;
import com.zhongshan.utils.result.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Api(value = "登记病人test",tags = "登记病人据接口API")
public class RegisteredController {
    @Resource
    private RegisteredService registeredService;
    @RequestMapping(value = "/test/addPatient",method = RequestMethod.GET)
    @ApiOperation(value = "挂号接口",notes = "",httpMethod = "GET", response = String.class)
    public R addPatient(Registered registered){
        return R.ok().message("添加成功");
    }
    @RequestMapping(value = "/test/selectPatient",method = RequestMethod.GET)
    @ApiOperation(value = "查询病人接口",notes = "门诊号careId和姓名",httpMethod = "GET", response = String.class)
    public R selectPatient(Integer careId,String name){
        return R.ok();
    }
    @RequestMapping(value = "/test/updatePatient",method = RequestMethod.GET)
    @ApiOperation(value = "修改病人接口",notes = "",httpMethod = "GET", response = String.class)
    public R updatePatient(Registered registered){
        return R.ok().message("修改成功");
    }
    @RequestMapping(value = "/test/dalatePatient",method = RequestMethod.GET)
    @ApiOperation(value = "删除病人接口",notes = "门诊号careId",httpMethod = "GET", response = String.class)
    public R dalatePatient(Integer careId){
        return R.ok().message("删除成功");
    }
    @RequestMapping(value = "/test/coutPeople",method = RequestMethod.GET)
    @ApiOperation(value = "查询已挂号人数接口",notes = "",httpMethod = "GET", response = String.class)
    public R coutPeople(){
        return R.ok();
    }
    @RequestMapping(value = "/test/getHasPrice",method = RequestMethod.GET)
    @ApiOperation(value = "已计价人次接口",notes = "",httpMethod = "GET", response = String.class)
    public R getHasPrice(){
        return R.ok();
    }
    @RequestMapping(value = "/test/getNoPrice",method = RequestMethod.GET)
    @ApiOperation(value = "未计价人次接口",notes = "",httpMethod = "GET", response = String.class)
    public R getNoPrice(){
        return R.ok();
    }
    @RequestMapping(value = "/test/hasNumberNoPrice",method = RequestMethod.GET)
    @ApiOperation(value = "查询已挂号但未计价人员费用接口",notes = "",httpMethod = "GET", response = String.class)
    public R hasNumberNoPrice(){
        return R.ok();
    }
    @RequestMapping(value = "/test/getPersonsNo",method = RequestMethod.GET)
    @ApiOperation(value = "制作医疗卡接口",notes = "",httpMethod = "GET", response = String.class)
    public R getPersonsNo(){
        return R.ok();
    }
    @RequestMapping(value = "/test/updateSate",method = RequestMethod.GET)
    @ApiOperation(value = "挂失医疗卡接口",notes = "",httpMethod = "GET", response = String.class)
    public R updateSate(String personsNo){
        return R.ok();
    }
//    @RequestMapping(value = "/test/oneGetPriceInfo",method = RequestMethod.GET)
//    @ApiOperation(value = "个人代扣计价收费明细接口",notes = "",httpMethod = "GET", response = String.class)
//    public R oneGetPriceInfo(PersonVo personVo){
//        return R.ok();
//    }
    @RequestMapping(value = "/test/allNoPrice",method = RequestMethod.GET)
    @ApiOperation(value = "查询所有欠款人员名单接口",notes = "",httpMethod = "GET", response = String.class)
    public R allNoPrice(){
        return R.ok();
    }
    @RequestMapping(value = "/test/balance",method = RequestMethod.GET)
    @ApiOperation(value = "查询余额接口",notes = "",httpMethod = "GET", response = String.class)
    public R balance(Registered registered){
        return  R.ok();
    }
    @RequestMapping(value = "/test/selectPersonPriceInfo",method = RequestMethod.GET)
    @ApiOperation(value = "以医疗卡号打印个人代扣计价收费明细接口",notes = "",httpMethod = "GET", response = String.class)
    public R selectPersonPriceInfo(String personsNo,String name){
        return R.ok();
    }

}
