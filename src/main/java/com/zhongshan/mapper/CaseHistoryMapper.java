package com.zhongshan.mapper;

import com.zhongshan.entity.CaseHistory;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
* @author 13427
* @description 针对表【case_history】的数据库操作Mapper
* @createDate 2022-04-27 18:13:36
* @Entity com.zhongshan.entity.CaseHistory
*/
public interface CaseHistoryMapper extends BaseMapper<CaseHistory> {

    List<CaseHistory> queryAll();

    List<CaseHistory> query(String chNum, Integer chTimes);

    List<CaseHistory> queryC(String fgNum, Integer fgTimes);

    int updatea(CaseHistory caseHistory);
}




