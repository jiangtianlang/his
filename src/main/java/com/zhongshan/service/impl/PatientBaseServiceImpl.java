package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.dao.PatientBaseDao;
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
public class PatientBaseServiceImpl extends ServiceImpl<PatientBaseDao, PatientBase> implements PatientBaseService {

}
