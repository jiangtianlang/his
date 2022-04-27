package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.dao.SymptomTypeDao;
import com.zhongshan.entity.SymptomType;
import com.zhongshan.service.SymptomTypeService;
import org.springframework.stereotype.Service;

/**
 * (SymptomType)表服务实现类
 *
 * @author jtl
 * @since 2022-04-27 16:27:29
 */
@Service("symptomTypeService")
public class SymptomTypeServiceImpl extends ServiceImpl<SymptomTypeDao, SymptomType> implements SymptomTypeService {

}
