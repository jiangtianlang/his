package com.zhongshan.service;

import com.zhongshan.entity.Uh05HealthStaff;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zhongshan.utils.result.R;

/**
* @author 13427
* @description 针对表【uh05_health_staff】的数据库操作Service
* @createDate 2022-04-27 18:13:39
*/
public interface Uh05HealthStaffService extends IService<Uh05HealthStaff> {

    R insertHealthStaff(Uh05HealthStaff uh05HealthStaff);

    R selectHealthStaff(Uh05HealthStaff uh05HealthStaff);

    R deleteHealthStaff(Uh05HealthStaff uh05HealthStaff);
}
