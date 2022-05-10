package com.zhongshan.controller.outpatient;

import com.zhongshan.entity.MedicalCard;
import com.zhongshan.entity.Prescription;
import com.zhongshan.entity.Uh03OnStoreC;
import com.zhongshan.entity.Uh03PriceCDbf;
import com.zhongshan.entity.vo.PrescriptionVo;
import com.zhongshan.entity.vo.PrescriptionsVo;
import com.zhongshan.service.PrescriptionService;
import com.zhongshan.service.Uh03OnStoreCService;
import com.zhongshan.service.Uh03PriceCDbfService;
import com.zhongshan.service.personBase.MedicalCardService;
import com.zhongshan.utils.result.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.*;

@RestController
@Api(value = "收费情况test",tags = "（门诊子系统）收费情况据接口API")
public class PrescriptionController {
    @Resource
    private PrescriptionService prescriptionService;
    @RequestMapping(value = "/test/selectGetPrice",method = RequestMethod.GET)
    @ApiOperation(value = "查询计价收费情况接口",notes = "",httpMethod = "GET", response = String.class)
    public R selectGetPrice(PrescriptionVo prescriptionVo){
        List<PrescriptionsVo> list=prescriptionService.selectGetPrice(prescriptionVo);
        return R.ok().data("data",list).message("查询成功");
    }
    @RequestMapping(value = "/test/addGetPrice",method = RequestMethod.GET)
    @ApiOperation(value = "新增计价收费情况接口",notes = "",httpMethod = "GET", response = String.class)
    public R addGetPrice(Prescription prescription){
        return prescriptionService.addGetPrice(prescription);

    }
    @RequestMapping(value = "/test/updateGetPrice",method = RequestMethod.GET)
    @ApiOperation(value = "修改计价收费情况接口",notes = "",httpMethod = "GET", response = String.class)
    public R updateGetPrice(Prescription Prescription){
        boolean b=prescriptionService.updateGetPrice(Prescription);
        if(b){
            return R.ok().message("修改成功");
        }else{
            return R.error().message("修改失败");
        }
    }





//    @RequestMapping(value = "/test/selectByIdQuantity",method = RequestMethod.GET)
//    @ApiOperation(value = "查询药品数量情况接口",notes = "",httpMethod = "GET", response = String.class)
//    public R selectByIdQuantity(Prescription prescription){
//        return R.ok();
//    }
//    @RequestMapping(value = "/test/getPrice",method = RequestMethod.GET)
//    @ApiOperation(value = "收费情况接口",notes = "",httpMethod = "GET", response = String.class)
//    public R getPrice(PrescriptionVo prescriptionVo){
//        return R.ok();
//    }
//    @RequestMapping(value = "/test/selectByMany",method = RequestMethod.GET)
//    @ApiOperation(value = "处方详情接口",notes = "",httpMethod = "GET", response = String.class)
//    public R selectByMany(PrescriptionVo prescriptionVo){
//        return R.ok();
//    }

//    @RequestMapping(value = "/test/selectGetopera",method = RequestMethod.GET)
//    @ApiOperation(value = "计价收费情况接口",notes = "",httpMethod = "GET", response = String.class)
//    public R selectGetopera(Date startTime,Date End){
//        return R.ok();
//    }
//    @RequestMapping(value = "/test/select",method = RequestMethod.GET)
//    @ApiOperation(value = "计价收费情况接口",notes = "",httpMethod = "GET", response = String.class)
//    public R selectGetopera(Date startTime,Date End){
//        return R.ok();
//    }
//    @RequestMapping(value = "/test/subjectMedicalAttention",method = RequestMethod.GET)
//    @ApiOperation(value = "各科室查询看病情况接口",notes = "",httpMethod = "GET", response = String.class)
//    public R subjectMedicalAttention(Date startTime,Date endTime){
//        return  R.ok();
//    }
//    @RequestMapping(value = "/test/operaMedicalAttention",method = RequestMethod.GET)
//    @ApiOperation(value = "操作人员工作情况接口",notes = "",httpMethod = "GET", response = String.class)
//    public R operaMedicalAttention(Date startTime,Date endTime){
//        return R.ok();
//    }
//    @RequestMapping(value = "/test/doctorMedicalAttention",method = RequestMethod.GET)
//    @ApiOperation(value = "医生工作情况接口",notes = "",httpMethod = "GET", response = String.class)
//    public R doctorMedicalAttention(Date startTime,Date endTime){
//        return R.ok();
//    }
//    @RequestMapping(value = "/test/registeredMedicalAttention",method = RequestMethod.GET)
//    @ApiOperation(value = "挂号和计价收费情况接口",notes = "",httpMethod = "GET", response = String.class)
//    public R registeredMedicalAttention(Date startTime,Date endTime){
//        return R.ok();
//    }
}
