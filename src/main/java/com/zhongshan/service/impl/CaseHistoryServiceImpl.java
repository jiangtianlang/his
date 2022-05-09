package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.entity.CaseHistory;
import com.zhongshan.service.CaseHistoryService;
import com.zhongshan.mapper.CaseHistoryMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
* @author 13427
* @description 针对表【case_history】的数据库操作Service实现
* @createDate 2022-04-27 18:13:36
*/
@Service
public class CaseHistoryServiceImpl extends ServiceImpl<CaseHistoryMapper, CaseHistory>
        implements CaseHistoryService{
@Resource
CaseHistoryMapper caseHistoryMapper;
    @Override
    public CaseHistory findByChNum(String chNum) {
      return  caseHistoryMapper.selectById(chNum);

    }

    @Override
    public List<CaseHistory> queryAll() {
        List<CaseHistory> list=caseHistoryMapper.queryAll();
        return list;
    }

    @Override
    public int insert(CaseHistory caseHistory) {
        int row=caseHistoryMapper.insert(caseHistory);
        return row;
    }

    @Override
    public int updateBy(CaseHistory caseHistory) {
        int row =caseHistoryMapper.updateById(caseHistory);
        return row;
    }
}




