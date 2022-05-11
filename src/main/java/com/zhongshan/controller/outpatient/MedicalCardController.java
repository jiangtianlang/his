package com.zhongshan.controller.outpatient;

import com.zhongshan.entity.MedicalCard;
import com.zhongshan.service.personBase.MedicalCardService;
import com.zhongshan.utils.result.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RestController
@Api(value = "医疗卡号管理test",tags = "（门诊子系统）医疗卡号管理接口API")
public class MedicalCardController {
    @Resource
    private MedicalCardService medicalCardService;
    @RequestMapping(value = "/updateState",method = RequestMethod.GET)
    @ApiOperation(value = "医疗卡号挂失接口",notes = "",httpMethod = "GET", response = String.class)
    public R updateState(String personsNo){

        boolean b=medicalCardService.updateState(personsNo);
        if(b){
            return R.ok().message("挂失成功");
        }else{
            return R.error().message("挂失失败");
        }
 }
    @RequestMapping(value = "/selectMedicalCard",method = RequestMethod.GET)
    @ApiOperation(value = "根据卡号或者姓名查询医疗卡号接口",notes = "",httpMethod = "GET", response = String.class)
    public R selectMedicalCard(String personsNo){
        if(personsNo==null){
            List<MedicalCard> list=medicalCardService.selectAllMedicalCard();
            return R.ok().data("data",list).message("查询成功");
        }else{
            boolean flag=false;
            Pattern p=Pattern.compile(".*\\d+.*");
            Matcher m=p.matcher(personsNo);
            if (m.matches()) {
                //带有数字(id查询)
                List<MedicalCard> list=medicalCardService.selectMedicalCardById(personsNo);
                return R.ok().data("data",list).message("查询成功");
            }else{
                //不带有数字（名字查询）
                List<MedicalCard> list=medicalCardService.selectMedicalCardByName(personsNo);
                return R.ok().data("data",list).message("查询成功");
            }
        }
    }
    @RequestMapping(value = "/addmedicalCard",method = RequestMethod.GET)
    @ApiOperation(value = "新增医疗卡号接口",notes = "",httpMethod = "GET", response = String.class)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "personsNo",value = "医疗卡号",paramType = "query",dataType = "String",required = true),
            @ApiImplicitParam(name = "name",value = "姓名",paramType = "query",dataType = "String",required = true),
            @ApiImplicitParam(name = "phone",value = "电话",paramType = "query",dataType = "String",required = true),
            @ApiImplicitParam(name = "age",value = "年龄",paramType = "query",dataType = "String",required = true),
            @ApiImplicitParam(name = "sex",value = "性别",paramType = "query",dataType = "String",required = true),
            @ApiImplicitParam(name = "address",value = "地址",paramType = "query",dataType = "String",required = true)
    })
    public R addmedicalCard(MedicalCard medicalCard) {
        List<MedicalCard> list = medicalCardService.selectmedicalCard(medicalCard.getPersonsNo());
        if (list.size() != 0) {
            return R.error().message("该卡号已存在，请重新输入卡号");
        } else {
            boolean b = medicalCardService.addMedicalCard(medicalCard);
            if(b){
                return R.ok().message("添加成功");
            }else{
                return R.error().message("添加失败");
            }
        }
    }
}
