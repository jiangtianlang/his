package com.zhongshan.mapper;

import com.zhongshan.entity.Firstpage;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author 13427
* @description 针对表【firstpage】的数据库操作Mapper
* @createDate 2022-04-27 18:13:38
* @Entity com.zhongshan.entity.Firstpage
*/
public interface FirstpageMapper extends BaseMapper<Firstpage> {

    List<Firstpage> queryByNum(Firstpage firstpage);

    List<Firstpage> query();

    List<Firstpage> findCount(String fgNum);

    List<Firstpage> findCountAll(String fgNum, Integer fgTimes);

    Integer findCounta(String fgNum);

    List<Firstpage> queryC(String chNum, Integer chTimes);

    int updatel(Firstpage firstpage);
}




