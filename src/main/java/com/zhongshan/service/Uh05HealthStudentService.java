package com.zhongshan.service;

import com.zhongshan.entity.Uh05HealthStudent;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zhongshan.entity.Uh05Student;
import com.zhongshan.utils.result.R;

/**
* @author 13427
* @description 针对表【uh05_health_student】的数据库操作Service
* @createDate 2022-04-27 18:13:39
*/
public interface Uh05HealthStudentService extends IService<Uh05HealthStudent> {

    R insertStudentsMedical(Uh05HealthStudent uh05HealthStudent);

    R deleteStudentsMedical(Uh05HealthStudent uh05HealthStudent);

    R updateStudentsMedical(Uh05HealthStudent uh05HealthStudent);

    R queryStudentsMedical(Uh05HealthStudent uh05HealthStudent);
}
