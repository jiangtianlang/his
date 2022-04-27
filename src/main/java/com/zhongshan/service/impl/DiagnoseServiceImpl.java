package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.mapper.DiagnoseMapper;
import com.zhongshan.entity.Diagnose;
import com.zhongshan.service.DiagnoseService;
import org.springframework.stereotype.Service;

/**
 * (Diagnose)表服务实现类
 *
 * @author jtl
 * @since 2022-04-27 16:27:25
 */
@Service("diagnoseService")
public class DiagnoseServiceImpl extends ServiceImpl<DiagnoseMapper, Diagnose> implements DiagnoseService {

}
