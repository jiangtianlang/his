package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.entity.CaseHistory;
import com.zhongshan.entity.Firstpage;
import com.zhongshan.entity.PersonBase;
import com.zhongshan.mapper.FirstpageMapper;
import com.zhongshan.mapper.personBase_mapper.PersonBaseMapper;
import com.zhongshan.service.CaseHistoryService;
import com.zhongshan.mapper.CaseHistoryMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
@Resource
    PersonBaseMapper personBaseMapper;
@Resource
    FirstpageMapper firstpageMapper;
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
    @Transactional(
            rollbackFor = {Exception.class}
    )
    public int insert(CaseHistory caseHistory) {
//        if(personBaseMapper.query(caseHistory.getChSignatureChargeDoctor()).equals("主治医生")){
//            return -1;
//        }
//        if(personBaseMapper.query(caseHistory.getChSignatureHouseDoctor()).equals("住院医生")){
//            return -2;
//        }
//        if(personBaseMapper.query(caseHistory.getChSignatureIntern()).equals("实习医生")){
//            return -3;
//        }
//        if (personBaseMapper.query(caseHistory.getChSignatureIntern()).equals("科主任")){
//            return -5;}
        if (caseHistoryMapper.query(caseHistory.getChNum(),caseHistory.getChTimes()).size()>0){
            return -4;
        }
            int row=caseHistoryMapper.insert(caseHistory);
            if (firstpageMapper.queryC(caseHistory.getChNum(),caseHistory.getChTimes()).size()>0){
                Firstpage firstpage=new Firstpage(caseHistory.getChInStatus(),caseHistory.getChOutStatus(),caseHistory.getChSignatureDirectorDoctor(),caseHistory.getChSignatureChargeDoctor(),caseHistory.getChSignatureHouseDoctor(),caseHistory.getChSignatureIntern(),caseHistory.getChNum(),caseHistory.getChTimes());
                firstpageMapper.updatel(firstpage); }
            return row;
        }



    @Override
    public int updateBy(CaseHistory caseHistory) {
        int row =caseHistoryMapper.updateById(caseHistory);
        return row;
    }
}




