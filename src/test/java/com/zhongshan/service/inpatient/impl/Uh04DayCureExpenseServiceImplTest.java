package com.zhongshan.service.inpatient.impl;

import com.zhongshan.service.inpatient.Uh04DayCureExpenseService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class Uh04DayCureExpenseServiceImplTest {
    @Resource
    Uh04DayCureExpenseService uh04DayCureExpenseService;
    @Test
    public void test01(){
        uh04DayCureExpenseService.scheduledTask();
    }
}