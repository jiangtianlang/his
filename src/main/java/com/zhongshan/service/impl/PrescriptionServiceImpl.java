package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.dao.PrescriptionDao;
import com.zhongshan.entity.Prescription;
import com.zhongshan.service.PrescriptionService;
import org.springframework.stereotype.Service;

/**
 * (Prescription)表服务实现类
 *
 * @author jtl
 * @since 2022-04-27 16:27:26
 */
@Service("prescriptionService")
public class PrescriptionServiceImpl extends ServiceImpl<PrescriptionDao, Prescription> implements PrescriptionService {

}
