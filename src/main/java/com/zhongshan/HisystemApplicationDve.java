package com.zhongshan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@MapperScan("com.zhongshan.mapper")
public class HisystemApplicationDve {

    public static void main(String[] args) {
        SpringApplication.run(HisystemApplicationDve.class, args);
    }

}
