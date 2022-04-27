package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.mapper.PersonsMapper;
import com.zhongshan.entity.Persons;
import com.zhongshan.service.PersonsService;
import org.springframework.stereotype.Service;

/**
 * (Persons)表服务实现类
 *
 * @author jtl
 * @since 2022-04-27 16:27:26
 */
@Service("personsService")
public class PersonsServiceImpl extends ServiceImpl<PersonsMapper, Persons> implements PersonsService {

}
