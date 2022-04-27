package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.mapper.CaseHistoryMapper;
import com.zhongshan.entity.CaseHistory;
import com.zhongshan.service.CaseHistoryService;
import org.springframework.stereotype.Service;

/**
 * (CaseHistory)表服务实现类
 *
 * @author jtl
 * @since 2022-04-27 16:27:24
 */
@Service("caseHistoryService")
public class CaseHistoryServiceImpl extends ServiceImpl<CaseHistoryMapper, CaseHistory> implements CaseHistoryService {

}
