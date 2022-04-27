package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.entity.CaseHistory;
import com.zhongshan.service.CaseHistoryService;
import com.zhongshan.mapper.CaseHistoryMapper;
import org.springframework.stereotype.Service;

/**
* @author 13427
* @description 针对表【case_history】的数据库操作Service实现
* @createDate 2022-04-27 18:13:36
*/
@Service
public class CaseHistoryServiceImpl extends ServiceImpl<CaseHistoryMapper, CaseHistory>
        implements CaseHistoryService{

}




