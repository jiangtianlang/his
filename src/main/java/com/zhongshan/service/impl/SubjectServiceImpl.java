package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.mapper.SubjectMapper;
import com.zhongshan.entity.Subject;
import com.zhongshan.service.SubjectService;
import org.springframework.stereotype.Service;

/**
 * (Subject)表服务实现类
 *
 * @author jtl
 * @since 2022-04-27 16:27:29
 */
@Service("subjectService")
public class SubjectServiceImpl extends ServiceImpl<SubjectMapper, Subject> implements SubjectService {

}
