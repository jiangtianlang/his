package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.entity.PersonBase;
import com.zhongshan.service.PersonBaseService;
import com.zhongshan.mapper.PersonBaseMapper;
import org.springframework.stereotype.Service;

/**
* @author 13427
* @description 针对表【person_base】的数据库操作Service实现
* @createDate 2022-04-27 18:13:38
*/
@Service
public class PersonBaseServiceImpl extends ServiceImpl<PersonBaseMapper, PersonBase>
    implements PersonBaseService{

}




