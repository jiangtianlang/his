package com.zhongshan.service;

import com.zhongshan.entity.Contagion;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zhongshan.utils.result.R;

/**
* @author 13427
* @description 针对表【contagion】的数据库操作Service
* @createDate 2022-05-09 08:45:25
*/
public interface ContagionService extends IService<Contagion> {

    R registrationOfContagion(Contagion contagion);
}
