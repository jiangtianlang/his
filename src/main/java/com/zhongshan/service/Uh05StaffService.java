package com.zhongshan.service;

import com.zhongshan.entity.Uh05Staff;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zhongshan.utils.result.R;

/**
* @author 13427
* @description 针对表【uh05_staff】的数据库操作Service
* @createDate 2022-04-27 18:13:39
*/
public interface Uh05StaffService extends IService<Uh05Staff> {

    R insertStaff(Uh05Staff uh05Staff);

    R updateStaff(Uh05Staff uh05Staff);

    R deleteStaff(Uh05Staff uh05Staff);

    R queryStaff(Uh05Staff uh05Staff);
}
