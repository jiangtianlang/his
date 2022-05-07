package com.zhongshan.service.inpatient.impl;

import com.zhongshan.entity.Subject;
import com.zhongshan.service.inpatient.SubjectService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class SubjectServiceImplTest {
    @Resource
    private SubjectService subjectService;

    @Test
    public void test01(){
        ArrayList<Subject> subjects = new ArrayList<>();
        String s ="01-西药费  02-中药费  03-检查费  04-治疗费  05-放射费  06-手术费  07-化验费  08-输血费  09-输氧费  10-床位费  11-接生费  12-其他";
        String[] s1 = s.split("  ");
        for (String s2 : s1) {
            String[] split = s2.split("-");
            Subject subject = new Subject();
            subject.setSubjectNo(Integer.parseInt(split[0]));
            subject.setSubjectName(split[1]);
            subject.setRegisterMoney(5.0);
            subjects.add(subject);
        }
        System.out.println(subjects);
        subjectService.saveBatch(subjects);
    }
}