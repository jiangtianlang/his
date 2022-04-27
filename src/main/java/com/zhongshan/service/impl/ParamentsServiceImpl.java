package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.dao.ParamentsDao;
import com.zhongshan.entity.Paraments;
import com.zhongshan.service.ParamentsService;
import org.springframework.stereotype.Service;

/**
 * (Paraments)表服务实现类
 *
 * @author jtl
 * @since 2022-04-27 16:27:26
 */
@Service("paramentsService")
public class ParamentsServiceImpl extends ServiceImpl<ParamentsDao, Paraments> implements ParamentsService {

}
