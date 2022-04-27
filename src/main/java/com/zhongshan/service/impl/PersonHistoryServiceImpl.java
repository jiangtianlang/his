package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.entity.PersonHistory;
import com.zhongshan.service.PersonHistoryService;
import com.zhongshan.mapper.PersonHistoryMapper;
import org.springframework.stereotype.Service;

/**
* @author 13427
* @description 针对表【person_history】的数据库操作Service实现
* @createDate 2022-04-27 18:13:38
*/
@Service
public class PersonHistoryServiceImpl extends ServiceImpl<PersonHistoryMapper, PersonHistory>
    implements PersonHistoryService{

}




