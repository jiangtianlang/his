package com.zhongshan.service;

import com.zhongshan.entity.CaseHistory;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author 13427
* @description 针对表【case_history】的数据库操作Service
* @createDate 2022-04-27 18:13:36
*/
public interface CaseHistoryService extends IService<CaseHistory> {

     CaseHistory findByChNum(String chNum) ;

    List<CaseHistory> queryAll();

    int insert(CaseHistory caseHistory);

    int updateBy(CaseHistory caseHistory);
}
