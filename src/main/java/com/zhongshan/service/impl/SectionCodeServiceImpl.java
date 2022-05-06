package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.entity.SectionCode;
import com.zhongshan.service.personBase.SectionCodeService;
import com.zhongshan.mapper.SectionCodeMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
* @author 13427
* @description 针对表【section_code】的数据库操作Service实现
* @createDate 2022-04-27 18:13:38
*/
@Service
public class SectionCodeServiceImpl extends ServiceImpl<SectionCodeMapper, SectionCode>
    implements SectionCodeService{
    @Resource
    private SectionCodeMapper sectionCodeMapper;
    @Override
    public List<SectionCode> findAll() {
        List<SectionCode> list=sectionCodeMapper.selectList(null);
        return list;
    }

    @Override
    public List<SectionCode> findSectionCodeById(String sectionNo) {
        List<SectionCode> list=new ArrayList<>();
        SectionCode sectionCode=sectionCodeMapper.selectById(sectionNo);
        list.add(sectionCode);
        return list;
    }
}




