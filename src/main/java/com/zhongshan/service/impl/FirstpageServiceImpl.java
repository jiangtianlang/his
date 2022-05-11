package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.entity.CaseHistory;
import com.zhongshan.entity.Firstpage;
import com.zhongshan.mapper.CaseHistoryMapper;
import com.zhongshan.mapper.personBase_mapper.PersonBaseMapper;
import com.zhongshan.service.FirstpageService;
import com.zhongshan.mapper.FirstpageMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;

/**
* @author 13427
* @description 针对表【firstpage】的数据库操作Service实现
* @createDate 2022-04-27 18:13:38
*/
@Service
public class FirstpageServiceImpl extends ServiceImpl<FirstpageMapper, Firstpage>
    implements FirstpageService{
    @Resource
    FirstpageMapper firstpageMapper;
    @Resource
    CaseHistoryMapper caseHistoryMapper;
    @Resource
    PersonBaseMapper personBaseMapper;
    @Override
    public int insert(Firstpage firstpage) {
        if (firstpageMapper.findCounta(firstpage.getFgNum())==firstpage.getFgTimes()){
            int row =firstpageMapper.updateById(firstpage);
            return row;
        }
        int row =firstpageMapper.insert(firstpage);
        return row;
    }

    @Override
    public List<Firstpage> queryByNum(Firstpage firstpage) {
        List<Firstpage> list=firstpageMapper.queryByNum(firstpage);
        return list;
    }

    @Override
    public List<Firstpage> queryAll() {
        List<Firstpage> list=firstpageMapper.query();
        return list;
    }

    @Override
    @Transactional(rollbackFor = {Exception.class})
    public int updateBy(Firstpage firstpage) {
        int row=firstpageMapper.updateById(firstpage);
        if(firstpage.getFgSignatureDirectorDoctor()!=null){
            if (personBaseMapper.query(firstpage.getFgSignatureDirectorDoctor()).size()==0||!personBaseMapper.query(firstpage.getFgSignatureDirectorDoctor()).get(0).getTitleNo().equals("主任医师")){
            return -1;}
        }
        if(firstpage.getFgSignatureChargeDoctor()!=null){
            if (personBaseMapper.query(firstpage.getFgSignatureChargeDoctor()).size()==0||!personBaseMapper.query(firstpage.getFgSignatureChargeDoctor()).get(0).getTitleNo().equals("主治医师")){
                return -2;}
        }
        if(firstpage.getFgSignatureHouseDoctor()!=null){
            if (personBaseMapper.query(firstpage.getFgSignatureHouseDoctor()).size()==0||!personBaseMapper.query(firstpage.getFgSignatureHouseDoctor()).get(0).getTitleNo().equals("住院医师")){
                return -3;}
        }
        if(firstpage.getFgSignatureIntern()!=null){
            if (personBaseMapper.query(firstpage.getFgSignatureIntern()).size()==0||!personBaseMapper.query(firstpage.getFgSignatureIntern()).get(0).getTitleNo().equals("实习医师")){
                return -4;}
        }
        if (caseHistoryMapper.queryC(firstpage.getFgNum(),firstpage.getFgTimes()).size()>0){
            CaseHistory caseHistory=new CaseHistory(firstpage.getFgTimes(),firstpage.getFgNum(),firstpage.getFgSignatureDirectorDoctor(),firstpage.getFgSignatureChargeDoctor(),firstpage.getFgSignatureHouseDoctor(),firstpage.getFgSignatureIntern());
                caseHistoryMapper.updatea(caseHistory);
        }
        return row;
    }

    @Override
    public List<Firstpage> findCount(String fgNum) {
        List<Firstpage> list=firstpageMapper.findCount(fgNum);
        return list;
    }

    @Override
    public List<Firstpage> findCountall(String fgNum, Integer fgTimes) {
        List<Firstpage> list=firstpageMapper.findCountAll(fgNum,fgTimes);
        return list;
    }
}




