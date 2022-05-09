package com.zhongshan.controller.inpatient;

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

/**
 * @author jtl
 * @date 2022年05月07日 19:04:02
 */
@Api(tags = "(住院管理)出院管理接口")
@RestController
@RequestMapping("test/charts")
public class OutHospitalController {

    @Resource
    private PatientBaseService patientBaseService;

    @ApiOperation(value = "出院")
    @PostMapping
    public ResultData outHospital(String patientNo) {
        return patientBaseService.outHospital(patientNo);
    }
}
