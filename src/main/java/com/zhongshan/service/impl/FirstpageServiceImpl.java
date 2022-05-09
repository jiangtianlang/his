package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.entity.CaseHistory;
import com.zhongshan.entity.Firstpage;
import com.zhongshan.mapper.CaseHistoryMapper;
import com.zhongshan.service.FirstpageService;
import com.zhongshan.mapper.FirstpageMapper;
import org.springframework.stereotype.Service;

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
    public int updateBy(Firstpage firstpage) {
        int row=firstpageMapper.updateById(firstpage);
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




