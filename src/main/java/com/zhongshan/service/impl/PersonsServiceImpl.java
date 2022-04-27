package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.entity.Persons;
import com.zhongshan.service.PersonsService;
import com.zhongshan.mapper.PersonsMapper;
import org.springframework.stereotype.Service;

/**
* @author 13427
* @description 针对表【persons】的数据库操作Service实现
* @createDate 2022-04-27 18:13:38
*/
@Service
public class PersonsServiceImpl extends ServiceImpl<PersonsMapper, Persons>
    implements PersonsService{

}




