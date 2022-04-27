package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.mapper.PersonBaseMapper;
import com.zhongshan.entity.PersonBase;
import com.zhongshan.service.PersonBaseService;
import org.springframework.stereotype.Service;

/**
 * (PersonBase)表服务实现类
 *
 * @author jtl
 * @since 2022-04-27 16:27:26
 */
@Service("personBaseService")
public class PersonBaseServiceImpl extends ServiceImpl<PersonBaseMapper, PersonBase> implements PersonBaseService {

}
