package com.zhongshan.service.personBase;

import com.zhongshan.entity.PersonBase;
import com.zhongshan.entity.PersonHistory;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author 13427
* @description 针对表【person_history】的数据库操作Service
* @createDate 2022-04-27 18:13:38
*/
public interface PersonHistoryService extends IService<PersonHistory> {
     Boolean add(PersonHistory personHistory);

    boolean updateMany(PersonHistory personHistory);

    PersonHistory select(String personNo);

    PersonHistory findPersonHistory(String personNo);

    List<PersonHistory> selectAllPersonHistory();
}
