package com.zhongshan.mapper.security_mapper;

import cn.hutool.core.util.IdcardUtil;
import com.zhongshan.entity.CaseHistory;
import com.zhongshan.mapper.CaseHistoryMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Year;

/**
 * @author jtl
 * @date 2022年05月03日 21:21:36
 */

public class MyTest {
//    @Resource
//    CaseHistoryMapper caseHistoryMapper;
//    @Test
//    public void test(){
//        System.out.println("20220001".substring(0,4).equals(Year.now().toString()));
//    }
//    @Test
//    public void test2() throws ParseException {
//        System.out.println(IdcardUtil.getBirthByIdCard("511303199912153083"));
//        System.out.println(new SimpleDateFormat("yyyyMMdd").parse("19991215"));
//    }

    @Test
    public void test3() throws ParseException {
        System.out.println(String.valueOf((int)(Math.random()*1000000000)));
    }

}
