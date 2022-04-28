package com.zhongshan.mapper.security_mapper;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
public class PermissionMapperTest {
    @Resource
    PermissionMapper permissionMapper;
    @Test
    public void test01(){
        List<String> strings = permissionMapper.selectAllPermissionValue();
        strings.forEach(System.out::println);
    }
}