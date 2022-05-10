package com.zhongshan.mapper.personBase_mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zhongshan.entity.PersonBase;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhongshan.entity.vo.PersonInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author 13427
* @description 针对表【person_base】的数据库操作Mapper
* @createDate 2022-04-27 18:13:38
* @Entity com.zhongshan.entity.PersonBase
*/
public interface PersonBaseMapper extends BaseMapper<PersonBase> {
    List<PersonBase> findComprehensiveQuery(String schoolName);

    String query(String chSignatureChargeDoctor);

}



