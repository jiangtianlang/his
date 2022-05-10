package com.zhongshan.controller.outpatient;

import com.zhongshan.entity.MedicalCard;
import com.zhongshan.service.personBase.MedicalCardService;
import com.zhongshan.utils.result.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Api(value = "医疗卡号管理test",tags = "（门诊子系统）医疗卡号管理接口API")
public class MedicalCardController {
    @Resource
    private MedicalCardService medicalCardService;
    @RequestMapping(value = "/test/updateState",method = RequestMethod.GET)
    @ApiOperation(value = "医疗卡号挂失接口",notes = "",httpMethod = "GET", response = String.class)
    public R updateState(String personsNo){

        boolean b=medicalCardService.updateState(personsNo);
        if(b){
            return R.ok().message("挂失成功");
        }else{
            return R.error().message("挂失失败");
        }
 }
    @RequestMapping(value = "/test/selectMedicalCard",method = RequestMethod.GET)
    @ApiOperation(value = "根据卡号查询医疗卡号挂失接口",notes = "",httpMethod = "GET", response = String.class)
    public R selectMedicalCard(String personsNo){
        if(personsNo==null){
            List<MedicalCard> list=medicalCardService.selectAllMedicalCard();
            return R.ok().data("data",list).message("查询成功");
        }else{
            List<MedicalCard> list=medicalCardService.selectmedicalCard(personsNo);
            if(list.size()==0){
                return R.ok().data("data",list).message("没有数据");
            }else{
                return R.ok().data("data",list).message("查询成功");
            }
        }
    }
    @RequestMapping(value = "/test/addmedicalCard",method = RequestMethod.GET)
    @ApiOperation(value = "根据卡号查询医疗卡号挂失接口",notes = "",httpMethod = "GET", response = String.class)
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
