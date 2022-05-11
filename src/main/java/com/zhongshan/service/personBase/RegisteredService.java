package com.zhongshan.service.personBase;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhongshan.entity.PublicExpense;
import com.zhongshan.entity.Registered;

import java.util.List;

public interface RegisteredService extends IService<Registered> {
    boolean addOutSchoolPatient(Registered registered);

    List<Registered> selectAll();
    boolean addInSchoolPatient(Registered registered);

    List<Registered> selectAllOutSchoolPatient();

    List<Registered> selectOutSchoolPatient(String name);

    List<Registered> selectAllInSchoolPatient();

    List<Registered> selectInSchoolPatient(String persons_no);

    List<Registered> selectByPersonsNo(String name);

    boolean updataOutSchoolPatient(Registered registered);

    List<Registered> selectInSchoolPatientByName(String name);

    List<Registered> selectPatientById( );
}
