package com.zhongshan.service.inpatient.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.entity.inpatient.Ward;
import com.zhongshan.service.inpatient.WardService;
import com.zhongshan.mapper.inpatient.WardMapper;
import org.springframework.stereotype.Service;

/**
* @author 13427
* @description 针对表【ward】的数据库操作Service实现
* @createDate 2022-04-27 18:13:39
*/
@Service
public class WardServiceImpl extends ServiceImpl<WardMapper, Ward>
    implements WardService{

}




