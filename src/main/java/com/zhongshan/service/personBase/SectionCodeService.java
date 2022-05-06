package com.zhongshan.service.personBase;

import com.zhongshan.entity.SectionCode;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author 13427
* @description 针对表【section_code】的数据库操作Service
* @createDate 2022-04-27 18:13:38
*/
public interface SectionCodeService extends IService<SectionCode> {


    List<SectionCode> findAll();

    List<SectionCode> findSectionCodeById(String sectionNo);
}
