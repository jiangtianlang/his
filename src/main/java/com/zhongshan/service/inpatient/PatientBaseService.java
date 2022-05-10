package com.zhongshan.service.inpatient;

import com.zhongshan.entity.inpatient.PatientBase;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zhongshan.utils.result.R;
import com.zhongshan.utils.result.ResultData;

/**
* @author 13427
* @description 针对表【patient_base】的数据库操作Service
* @createDate 2022-04-27 18:13:38
*/
public interface PatientBaseService extends IService<PatientBase> {
     ResultData savePatientBase(PatientBase patientBase);

    ResultData outHospital(String patientNo);

    R getIsDelete();
}
