package com.zhongshan.controller.outpatient;

import com.zhongshan.entity.MedicalCard;
import com.zhongshan.entity.Registered;
import com.zhongshan.service.personBase.MedicalCardService;
import com.zhongshan.service.personBase.RegisteredService;
import com.zhongshan.utils.result.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Api(value = "登记病人test",tags = "（门诊子系统）登记病人据接口API")
public class RegisteredController {
    @Resource
    private RegisteredService registeredService;
    @Resource
    private MedicalCardService medicalCardService;
    @RequestMapping(value = "/addOutSchoolPatient",method = RequestMethod.GET)
    @ApiOperation(value = "校外人员挂号接口",notes = "",httpMethod = "GET", response = String.class)
    public R addOutSchoolPatient(Registered registered){
        boolean b=registeredService.addOutSchoolPatient(registered);
        if(b){
            MedicalCard medicalCard=new MedicalCard();
            medicalCard.setPersonsNo(registered.getPersonsNo());
            medicalCard.setName(registered.getName());
            medicalCard.setPhone(registered.getPhone());
            medicalCard.setAge(registered.getAge());
            medicalCard.setSex(registered.getSex());
            medicalCardService.addMedicalCard(medicalCard);
            return R.ok().message("挂号成功，您的医疗卡号为："+registered.getPersonsNo());
        }else{
        return R.error().message("挂号失败");
        }
    }
    @RequestMapping(value = "/selectOutSchoolPatient",method = RequestMethod.GET)
    @ApiOperation(value = "姓名查询校外人员挂号接口",notes = "",httpMethod = "GET", response = String.class)
    public R selectOutSchoolPatient(String name){
        if(name==null){
            List<Registered> list=registeredService.selectAllOutSchoolPatient();
            return R.ok().data("data",list).message("查询成功");
        }else{
            List<Registered> list=registeredService.selectOutSchoolPatient(name);
            return R.ok().data("data",list).message("查询成功");
        }
    }
    @RequestMapping(value = "/updataOutSchoolPatient",method = RequestMethod.GET)
    @ApiOperation(value = "修改校外人员挂号接口",notes = "",httpMethod = "GET", response = String.class)
    public  R updataOutSchoolPatient(Registered registered){
        boolean b=registeredService.updataOutSchoolPatient(registered);
        if(b){
            return R.ok().message("修改成功");
        }
        return R.ok().message("修改失败");
    }
    @RequestMapping(value = "/deleteOutSchoolPatient",method = RequestMethod.GET)
    @ApiOperation(value = "删除校外人员挂号接口",notes = "",httpMethod = "GET", response = String.class)
    public R deleteOutSchoolPatient(String personsNo){
        return   this.registeredService.removeById(personsNo)?R.ok().message("删除成功"):R.ok().message("删除失败");
    }
    @RequestMapping(value = "/addInSchoolPatient",method = RequestMethod.GET)
    @ApiOperation(value = "校内人员挂号接口",notes = "",httpMethod = "GET", response = String.class)
    public R addInSchoolPatient(Registered registered){
        boolean b=registeredService.addInSchoolPatient(registered);
        if(b){
            return R.ok().message("挂号成功");
        }else{
            return R.error().message("挂号失败");
        }
    }
    @RequestMapping(value = "/selectInSchoolPatient",method = RequestMethod.GET)
    @ApiOperation(value = "卡号查询校内人员挂号接口",notes = "",httpMethod = "GET", response = String.class)
    public R selectInSchoolPatientById(String personsNo){
//        if(personsNo==null){
//            List<Registered> list=registeredService.selectAllInSchoolPatient();
//            return R.ok().data("data",list).message("查询成功");
//        }else{
            List<Registered> list=registeredService.selectInSchoolPatient(personsNo);
            return R.ok().data("data",list).message("查询成功");


    }
    @RequestMapping(value = "/selectInSchoolPatientByName",method = RequestMethod.GET)
    @ApiOperation(value = "姓名查询校内人员挂号接口",notes = "",httpMethod = "GET", response = String.class)
    public R selectInSchoolPatientByName(String name){
        if(name==null){
            List<Registered> list=registeredService.selectAllInSchoolPatient();
            return R.ok().data("data",list).message("查询成功");
        }else{
            List<Registered> list=registeredService.selectInSchoolPatientByName(name);
                return R.ok().data("data",list).message("查询成功");
        }
    }
    @RequestMapping(value = "/deleteInSchoolPatient",method = RequestMethod.GET)
    @ApiOperation(value = "删除校内人员挂号接口",notes = "",httpMethod = "GET", response = String.class)
    public R deleteInSchoolPatient(String personsNo){

        return this.registeredService.removeById(personsNo)?R.ok().message("删除成功"):R.ok().message("删除失败");
    }
    @RequestMapping(value = "/selectByName",method = RequestMethod.GET)
    @ApiOperation(value = "查询所有挂号人员接口",notes = "",httpMethod = "GET", response = String.class)
    public  R selectByName(String name){
        if(name==null){
            List<Registered> list=registeredService.selectAll();
            return R.ok().data("data",list).message("查询成功");
        }else{
            List<Registered> list=registeredService.selectByPersonsNo(name);
            return R.ok().data("data",list).message("查询成功");
        }
    }

    }








//    @RequestMapping(value = "/selectPatient",method = RequestMethod.GET)
//    @ApiOperation(value = "查询病人接口",notes = "医疗卡号personsNo",httpMethod = "GET", response = String.class)
//    public R selectPatient(String personsNo){
//        if(personsNo==null){
//            List<Registered> list=registeredService.selectAll();
//            return R.ok().data("data",list).message("查询成功");
//        }else{
//            Registered registered=registeredService.selectPatient(personsNo);
//            return R.ok().data("data",registered).message("查询成功");
//        }
//
//    }
//    @RequestMapping(value = "/updatePatient",method = RequestMethod.GET)
//    @ApiOperation(value = "修改病人接口",notes = "",httpMethod = "GET", response = String.class)
//    public R updatePatient(Registered registered){
//        boolean b=registeredService.updateById(registered);
//        return R.ok().message("修改成功");
//    }
//    @RequestMapping(value = "/dalatePatient",method = RequestMethod.GET)
//    @ApiOperation(value = "删除病人接口",notes = "门诊号careId",httpMethod = "GET", response = String.class)
//    public R dalatePatient(Integer careId){
//        boolean b=registeredService.dalatePatient(careId);
//        if(b){
//            return R.ok().message("删除成功");
//        }
//        return R.error().message("删除失败");
//    }
//    @RequestMapping(value = "/coutPeople",method = RequestMethod.GET)
//    @ApiOperation(value = "查询已挂号人数接口",notes = "",httpMethod = "GET", response = String.class)
//    public R coutPeople(){
//        return R.ok();
//    }
//    @RequestMapping(value = "/getHasPrice",method = RequestMethod.GET)
//    @ApiOperation(value = "已计价人次接口",notes = "",httpMethod = "GET", response = String.class)
//    public R getHasPrice(){
//        return R.ok();
//    }
//    @RequestMapping(value = "/getNoPrice",method = RequestMethod.GET)
//    @ApiOperation(value = "未计价人次接口",notes = "",httpMethod = "GET", response = String.class)
//    public R getNoPrice(){
//        return R.ok();
//    }
//    @RequestMapping(value = "/hasNumberNoPrice",method = RequestMethod.GET)
//    @ApiOperation(value = "查询已挂号但未计价人员费用接口",notes = "",httpMethod = "GET", response = String.class)
//    public R hasNumberNoPrice(){
//        return R.ok();
//    }
//    @RequestMapping(value = "/getPersonsNo",method = RequestMethod.GET)
//    @ApiOperation(value = "制作医疗卡接口",notes = "",httpMethod = "GET", response = String.class)
//    public R getPersonsNo(){
//        return R.ok();
//    }
//    @RequestMapping(value = "/updateSate",method = RequestMethod.GET)
//    @ApiOperation(value = "挂失医疗卡接口",notes = "",httpMethod = "GET", response = String.class)
//    public R updateSate(String personsNo){
//        return R.ok();
//    }
////    @RequestMapping(value = "/oneGetPriceInfo",method = RequestMethod.GET)
////    @ApiOperation(value = "个人代扣计价收费明细接口",notes = "",httpMethod = "GET", response = String.class)
////    public R oneGetPriceInfo(PersonVo personVo){
////        return R.ok();
////    }
//    @RequestMapping(value = "/allNoPrice",method = RequestMethod.GET)
//    @ApiOperation(value = "查询所有欠款人员名单接口",notes = "",httpMethod = "GET", response = String.class)
//    public R allNoPrice(){
//        return R.ok();
//    }
//    @RequestMapping(value = "/balance",method = RequestMethod.GET)
//    @ApiOperation(value = "查询余额接口",notes = "",httpMethod = "GET", response = String.class)
//    public R balance(Registered registered){
//        return  R.ok();
//    }
//    @RequestMapping(value = "/selectPersonPriceInfo",method = RequestMethod.GET)
//    @ApiOperation(value = "以医疗卡号打印个人代扣计价收费明细接口",notes = "",httpMethod = "GET", response = String.class)
//    public R selectPersonPriceInfo(String personsNo,String name){
//        return R.ok();
//    }


