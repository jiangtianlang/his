package com.zhongshan.service.inpatient;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zhongshan.entity.inpatient.Ward;
import com.zhongshan.entity.inpatient.WardUse;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zhongshan.utils.result.R;
import com.zhongshan.utils.result.ResultData;

/**
* @author 13427
* @description 针对表【ward_use】的数据库操作Service
* @createDate 2022-05-05 21:56:24
*/
public interface WardUseService extends IService<WardUse> {
    //床位登记表中所有项目及床位统计值（总床位数目，空床数目，实际使用率）。
    ResultData totalWardUse(QueryWrapper<Ward> wrapper);
}
