package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.mapper.HospitalLevelMapper;
import com.zhongshan.entity.HospitalLevel;
import com.zhongshan.service.HospitalLevelService;
import org.springframework.stereotype.Service;

/**
 * (HospitalLevel)表服务实现类
 *
 * @author jtl
 * @since 2022-04-27 16:27:26
 */
@Service("hospitalLevelService")
public class HospitalLevelServiceImpl extends ServiceImpl<HospitalLevelMapper, HospitalLevel> implements HospitalLevelService {

}
