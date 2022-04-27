package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.dao.SectionCodeDao;
import com.zhongshan.entity.SectionCode;
import com.zhongshan.service.SectionCodeService;
import org.springframework.stereotype.Service;

/**
 * (SectionCode)表服务实现类
 *
 * @author jtl
 * @since 2022-04-27 16:27:28
 */
@Service("sectionCodeService")
public class SectionCodeServiceImpl extends ServiceImpl<SectionCodeDao, SectionCode> implements SectionCodeService {

}
