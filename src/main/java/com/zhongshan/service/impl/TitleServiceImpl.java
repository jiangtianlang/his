package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.entity.Title;
import com.zhongshan.service.TitleService;
import com.zhongshan.mapper.TitleMapper;
import org.springframework.stereotype.Service;

/**
* @author 13427
* @description 针对表【title】的数据库操作Service实现
* @createDate 2022-04-27 18:13:38
*/
@Service
public class TitleServiceImpl extends ServiceImpl<TitleMapper, Title>
    implements TitleService{

}




