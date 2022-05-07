package com.zhongshan.mapper;

import com.zhongshan.entity.inpatient.WardUse;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhongshan.entity.inpatient.vo.WardUseVo;

import java.util.List;

/**
* @author 13427
* @description 针对表【ward_use】的数据库操作Mapper
* @createDate 2022-05-05 21:56:24
* @Entity com.zhongshan.entity.inpatient.WardUse
*/
public interface WardUseMapper extends BaseMapper<WardUse> {

    List<WardUseVo> totalWardUse();
}




