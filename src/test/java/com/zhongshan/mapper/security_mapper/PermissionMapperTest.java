package com.zhongshan.mapper.security_mapper;


import com.zhongshan.entity.inpatient.PatientBase;
import com.zhongshan.mapper.PatientBaseMapper;
import com.zhongshan.security.TokenManager;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
public class PermissionMapperTest {
    @Resource
    PermissionMapper permissionMapper;
    @Resource
    TokenManager tokenManager;
    @Resource
    private PatientBaseMapper patientBaseMapper;

    @Test
    public void test01(){
        List<String> strings = permissionMapper.selectAllPermissionValue();
        strings.forEach(System.out::println);
    }
//    @Test
//    public void test02(){
//        System.out.println(tokenManager.createToken(user.getCurrentUserInfo().getUsername(), "jtl"));
//        tokenManager.removeToken(tokenManager.createToken(user.getCurrentUserInfo().getUsername(), "jtl"));
//    }
    @Test
    public void testQueryWrapper(){
        PatientBase patientBase = new PatientBase();
        patientBase.setBedNo("1");
        System.out.println("20220001".substring(0,4));
    }
    @Test
    public void testQueryWrapper2(){

        String maxId = patientBaseMapper.queryMaxId();

        System.out.println(maxId);
    }
}