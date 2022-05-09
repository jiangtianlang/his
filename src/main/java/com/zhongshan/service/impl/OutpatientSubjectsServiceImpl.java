package com.zhongshan.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongshan.entity.OutpatientSubjects;
import com.zhongshan.entity.inpatient.Subject;
import com.zhongshan.service.OutpatientSubjectsService;
import com.zhongshan.mapper.OutpatientSubjectsMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
* @author 13427
* @description 针对表【outpatient_subjects】的数据库操作Service实现
* @createDate 2022-05-08 20:08:13
*/
@Service
public class OutpatientSubjectsServiceImpl extends ServiceImpl<OutpatientSubjectsMapper, OutpatientSubjects>
    implements OutpatientSubjectsService{
    @Resource
    private OutpatientSubjectsMapper outpatientSubjectsMapper;
    @Override
    public boolean addSubject(OutpatientSubjects outpatientSubjects) {
        int rows=outpatientSubjectsMapper.insert(outpatientSubjects);
        return rows>0?true:false;
    }

    @Override
    public boolean updateSubject(OutpatientSubjects outpatientSubjects) {
        int rows=outpatientSubjectsMapper.updateById(outpatientSubjects);
        return rows>0?true:false;
    }

    @Override
    public List<OutpatientSubjects> selectAllSubject() {
        List<OutpatientSubjects> list=outpatientSubjectsMapper.selectList(null);
        return list;
    }

    @Override
    public List<OutpatientSubjects> selectSubject(String subjectName) {
        QueryWrapper<OutpatientSubjects> queryWrapper=new QueryWrapper<>();
        queryWrapper.like("subject_name ",subjectName);
        List<OutpatientSubjects> list=outpatientSubjectsMapper.selectList(queryWrapper);
        return list;
    }
}




