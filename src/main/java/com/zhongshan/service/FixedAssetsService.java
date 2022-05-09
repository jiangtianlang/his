package com.zhongshan.service;

import com.zhongshan.entity.Firstpage;
import com.zhongshan.entity.FixedAssets;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zhongshan.utils.result.R;

/**
* @author 13427
* @description 针对表【fixed_assets】的数据库操作Service
* @createDate 2022-04-27 18:13:38
*/
public interface FixedAssetsService extends IService<FixedAssets> {

    R selectFixed(FixedAssets fixedAssets);

    R selectCaseHealthCare(Firstpage firstpage);
}
