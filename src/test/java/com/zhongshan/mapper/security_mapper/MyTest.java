package com.zhongshan.mapper.security_mapper;

import org.junit.jupiter.api.Test;

import java.time.Year;

/**
 * @author jtl
 * @date 2022年05月03日 21:21:36
 */

public class MyTest {
    @Test
    public void test(){
        System.out.println("20220001".substring(0,4).equals(Year.now().toString()));
    }
}
