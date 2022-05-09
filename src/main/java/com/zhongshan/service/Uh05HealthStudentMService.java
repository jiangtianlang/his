package com.zhongshan.service;

import com.zhongshan.entity.Uh05HealthStudentM;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zhongshan.utils.result.R;

/**
* @author 13427
* @description 针对表【uh05_health_student_m】的数据库操作Service
* @createDate 2022-04-27 18:13:39
*/
public interface Uh05HealthStudentMService extends IService<Uh05HealthStudentM> {

    R insertStudentsMedicalGao(Uh05HealthStudentM uh05HealthStudentM);

    R deleteStudentsMedicalGao(Uh05HealthStudentM uh05HealthStudentM);

    R updateStudentsMedicalGao(Uh05HealthStudentM uh05HealthStudentM);

    R queryStudentsMedicalGao(Uh05HealthStudentM uh05HealthStudentM);
}
