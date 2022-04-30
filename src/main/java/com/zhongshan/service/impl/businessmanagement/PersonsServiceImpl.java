package com.zhongshan.service.impl.businessmanagement;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.entity.Persons;
import com.zhongshan.service.PersonsService;
import com.zhongshan.mapper.PersonsMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
* @author 13427
* @description 针对表【persons】的数据库操作Service实现
* @createDate 2022-04-27 18:13:38
*/
@Service
public class PersonsServiceImpl extends ServiceImpl<PersonsMapper, Persons>
    implements PersonsService{
    @Resource
    private  PersonsMapper personsMapper;
    @Override
    public Page<Persons> selectBusiness(String personName, Integer page, Integer limit) {
        Page<Persons> personsPage=new Page<>(page,limit);
        LambdaQueryWrapper<Persons> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(personName!=null,Persons::getPersonName,personName);
        personsPage=personsMapper.selectPage(personsPage,wrapper);
        return personsPage;
    }
}




