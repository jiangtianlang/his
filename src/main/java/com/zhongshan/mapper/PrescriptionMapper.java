package com.zhongshan.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zhongshan.entity.Prescription;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhongshan.entity.vo.PrescriptionVo;
import com.zhongshan.entity.vo.PrescriptionsVo;

import java.util.List;

/**
* @author 13427
* @description 针对表【prescription】的数据库操作Mapper
* @createDate 2022-04-27 18:13:38
* @Entity com.zhongshan.entity.Prescription
*/
public interface PrescriptionMapper extends BaseMapper<Prescription> {

    List<PrescriptionsVo> selectGetPrice(QueryWrapper<PrescriptionVo> queryWrapper);
}




