package com.zhongshan.mapper.security_mapper;


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
    @Test
    public void test01(){
        List<String> strings = permissionMapper.selectAllPermissionValue();
        strings.forEach(System.out::println);
    }
    @Test
    public void test02(){
        System.out.println(tokenManager.createToken("jtl"));
        tokenManager.removeToken(tokenManager.createToken("jtl"));
    }
}