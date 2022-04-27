package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.entity.Prescription;
import com.zhongshan.service.PrescriptionService;
import com.zhongshan.mapper.PrescriptionMapper;
import org.springframework.stereotype.Service;

/**
* @author 13427
* @description 针对表【prescription】的数据库操作Service实现
* @createDate 2022-04-27 18:13:38
*/
@Service
public class PrescriptionServiceImpl extends ServiceImpl<PrescriptionMapper, Prescription>
    implements PrescriptionService{

}




