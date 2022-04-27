package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.mapper.PatientBaseMapper;
import com.zhongshan.entity.PatientBase;
import com.zhongshan.service.PatientBaseService;
import org.springframework.stereotype.Service;

/**
 * (PatientBase)表服务实现类
 *
 * @author jtl
 * @since 2022-04-27 16:27:26
 */
@Service("patientBaseService")
public class PatientBaseServiceImpl extends ServiceImpl<PatientBaseMapper, PatientBase> implements PatientBaseService {

}
