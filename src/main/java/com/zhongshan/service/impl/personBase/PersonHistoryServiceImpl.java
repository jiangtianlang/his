package com.zhongshan.service.impl.personBase;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.entity.PersonHistory;
import com.zhongshan.service.personBase.PersonHistoryService;
import com.zhongshan.mapper.PersonHistoryMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
* @author 13427
* @description 针对表【person_history】的数据库操作Service实现
* @createDate 2022-04-27 18:13:38
*/
@Service
public class PersonHistoryServiceImpl extends ServiceImpl<PersonHistoryMapper, PersonHistory>
    implements PersonHistoryService{
    @Resource
    private PersonHistoryMapper personHistoryMapper;
    @Override
    public Boolean add(PersonHistory personHistory) {
        int rows=personHistoryMapper.insert(personHistory);
        return rows>0?true:false;
    }

    @Override
    public boolean updateMany(PersonHistory personHistory) {
         int  rows = personHistoryMapper.updateById(personHistory);
        return rows>0?true:false;
    }

    @Override
    public PersonHistory select(String personNo) {
       PersonHistory personHistory= personHistoryMapper.selectById(personNo);
        return personHistory;
    }

    @Override
    public PersonHistory findPersonHistory(String personNo) {
        PersonHistory personHistory= personHistoryMapper.selectById(personNo);
        return personHistory;
    }
}




