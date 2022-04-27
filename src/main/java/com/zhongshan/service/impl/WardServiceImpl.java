package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.entity.Ward;
import com.zhongshan.service.WardService;
import com.zhongshan.mapper.WardMapper;
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




