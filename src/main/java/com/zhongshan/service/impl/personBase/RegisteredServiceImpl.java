package com.zhongshan.service.impl.personBase;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.zhongshan.entity.PersonBase;
import com.zhongshan.entity.Registered;

import com.zhongshan.mapper.personBase_mapper.RegisteredMapper;
import com.zhongshan.service.personBase.RegisteredService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Random;

@Service
public class RegisteredServiceImpl extends ServiceImpl<RegisteredMapper, Registered>  implements RegisteredService {
    @Resource
    private RegisteredMapper registeredMapper;
    @Override
    public boolean addOutSchoolPatient(Registered registered) {
        int flag = new Random().nextInt(999999);
        if (flag < 100000)
        {
            flag += 100000;
        }
        String s = Integer.toString(flag);
        System.out.println(flag);
        registered.setPersonsNo(s);
        QueryWrapper<Registered> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("persons_no",s);
        registered.setPeopleType("校外人员");
        int rows=registeredMapper.insert(registered);
        return rows>0?true:false;
    }

    @Override
    public List<Registered> selectAll() {
        QueryWrapper<Registered> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("isDelete",0);
       List<Registered> list=registeredMapper.selectList(queryWrapper);
        return list;
    }
    @Override
    public boolean addInSchoolPatient(Registered registered) {
        registered.setPeopleType("校内人员");
        int rows=registeredMapper.insert(registered);
        return rows>0?true:false;
    }

    @Override
    public List<Registered> selectAllOutSchoolPatient() {
        QueryWrapper<Registered> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("people_type","校外人员");
        queryWrapper.eq("isDelete",0);
        List<Registered> list=registeredMapper.selectList(queryWrapper);
        return list;
    }

    @Override
    public List<Registered> selectOutSchoolPatient(String name) {
        QueryWrapper<Registered> queryWrapper=new QueryWrapper<>();
        if(name!=null){
            queryWrapper.eq("name",name);
        }
        queryWrapper.eq("people_type","校外人员");
        queryWrapper.eq("isDelete",0);
        List<Registered> list=registeredMapper.selectList(queryWrapper);
        return list;
    }

    @Override
    public List<Registered> selectAllInSchoolPatient() {
        QueryWrapper<Registered> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("people_type","校内人员");
        queryWrapper.eq("isDelete",0);
        List<Registered> list=registeredMapper.selectList(queryWrapper);
        return list;
    }

    @Override
    public List<Registered> selectInSchoolPatient(String persons_no) {
        QueryWrapper<Registered> queryWrapper=new QueryWrapper<>();
        if(persons_no!=null){
            queryWrapper.eq("persons_no",persons_no);
        }
        queryWrapper.eq("people_type","校内人员");
        queryWrapper.eq("isDelete",0);
        List<Registered> list=registeredMapper.selectList(queryWrapper);
        return list;
    }

    @Override
    public List<Registered> selectByPersonsNo(String personsNo) {
        QueryWrapper<Registered> queryWrapper=new QueryWrapper<>();
        queryWrapper.like("persons_no",personsNo);
        queryWrapper.eq("isDelete",0);
        List<Registered> list=registeredMapper.selectList(queryWrapper);
        return list;
    }

    @Override
    public boolean updataOutSchoolPatient(Registered registered) {
        int rows=registeredMapper.updateById(registered);
        return rows>0?true:false;
    }

    @Override
    public List<Registered> selectInSchoolPatientByName(String name) {
        QueryWrapper<Registered> queryWrapper=new QueryWrapper<>();
        queryWrapper.like("name",name);
        queryWrapper.eq("isDelete",0);
        List<Registered> list=registeredMapper.selectList(queryWrapper);
        return list;
    }


}
