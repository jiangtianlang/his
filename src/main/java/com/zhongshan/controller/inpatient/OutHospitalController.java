package com.zhongshan.controller.inpatient;

import com.zhongshan.entity.inpatient.PatientBase;
import com.zhongshan.entity.inpatient.Uh04CrueInfoExpense;
import com.zhongshan.service.inpatient.PatientBaseService;
import com.zhongshan.service.inpatient.Uh04CrueInfoExpenseService;
import com.zhongshan.utils.result.R;
import com.zhongshan.utils.result.ResultData;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * @author jtl
 * @date 2022年05月07日 19:04:02
 */
@Api(tags = "(住院管理)出院管理接口")
@RestController
@RequestMapping("test/outHospital")
public class OutHospitalController {

    @Resource
    private PatientBaseService patientBaseService;
    @Resource
    private Uh04CrueInfoExpenseService crueInfoExpenseService;

    @ApiOperation(value = "出院")
    @PostMapping
    public ResultData outHospital(String patientNo) {
        return patientBaseService.outHospital(patientNo);
    }


    @ApiOperation(value = "获取病人在院期间的用费用")
    @GetMapping
    public ResultData outPatientOf(String patientNo) {
        List<PatientBase> patientBases = (List<PatientBase>) patientBaseService.getIsDelete().getData().get("data");
        for (PatientBase patientBase : patientBases) {
            if (patientNo.equals(patientBase.getPatientNo())){
                List<Uh04CrueInfoExpense> uh04CrueInfoExpenses = crueInfoExpenseService.queryCrueInfo(patientNo, patientBase.getInDate(), patientBase.getOutDate());
                if (uh04CrueInfoExpenses.size()>0){
                    return ResultData.ok().data("data",uh04CrueInfoExpenses);
                }
            }
        }
        return ResultData.ok().message("暂无数据请检查输入是否有误!");
    }
}
