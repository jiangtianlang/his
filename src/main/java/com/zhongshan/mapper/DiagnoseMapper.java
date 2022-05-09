package com.zhongshan.mapper;

import com.zhongshan.entity.Diagnose;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
* @author 13427
* @description 针对表【diagnose】的数据库操作Mapper
* @createDate 2022-04-27 18:13:36
* @Entity com.zhongshan.entity.Diagnose
*/
public interface DiagnoseMapper extends BaseMapper<Diagnose> {

    List<Diagnose> queryAll();

    List<Diagnose> queryBy(Diagnose diagnose);
}




