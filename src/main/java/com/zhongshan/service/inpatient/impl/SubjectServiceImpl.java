package com.zhongshan.service.inpatient.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.entity.inpatient.Subject;
import com.zhongshan.service.inpatient.SubjectService;
import com.zhongshan.mapper.inpatient.SubjectMapper;
import org.springframework.stereotype.Service;

/**
* @author 13427
* @description 针对表【subject】的数据库操作Service实现
* @createDate 2022-04-27 18:13:38
*/
@Service
public class SubjectServiceImpl extends ServiceImpl<SubjectMapper, Subject>
    implements SubjectService{

}




