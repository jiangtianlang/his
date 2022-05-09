package com.zhongshan.service;

import com.zhongshan.entity.Death;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zhongshan.utils.result.R;

/**
* @author 13427
* @description 针对表【death】的数据库操作Service
* @createDate 2022-05-09 08:45:25
*/
public interface DeathService extends IService<Death> {

    R registrationOfDeath(Death death);
}
