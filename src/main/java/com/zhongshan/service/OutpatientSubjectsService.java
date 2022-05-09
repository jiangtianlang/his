package com.zhongshan.service;

import com.zhongshan.entity.OutpatientSubjects;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zhongshan.entity.inpatient.Subject;

import java.util.List;

/**
* @author 13427
* @description 针对表【outpatient_subjects】的数据库操作Service
* @createDate 2022-05-08 20:08:13
*/
public interface OutpatientSubjectsService extends IService<OutpatientSubjects> {

    boolean addSubject(OutpatientSubjects outpatientSubjects);

    boolean updateSubject(OutpatientSubjects outpatientSubjects);

    List<OutpatientSubjects> selectAllSubject();

    List<OutpatientSubjects> selectSubject(String subjectName);
}
