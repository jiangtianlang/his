package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.dao.PersonHistoryDao;
import com.zhongshan.entity.PersonHistory;
import com.zhongshan.service.PersonHistoryService;
import org.springframework.stereotype.Service;

/**
 * (PersonHistory)表服务实现类
 *
 * @author jtl
 * @since 2022-04-27 16:27:26
 */
@Service("personHistoryService")
public class PersonHistoryServiceImpl extends ServiceImpl<PersonHistoryDao, PersonHistory> implements PersonHistoryService {

}
