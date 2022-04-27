package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.entity.Paraments;
import com.zhongshan.service.ParamentsService;
import com.zhongshan.mapper.ParamentsMapper;
import org.springframework.stereotype.Service;

/**
* @author 13427
* @description 针对表【paraments】的数据库操作Service实现
* @createDate 2022-04-27 18:13:38
*/
@Service
public class ParamentsServiceImpl extends ServiceImpl<ParamentsMapper, Paraments>
    implements ParamentsService{

}




