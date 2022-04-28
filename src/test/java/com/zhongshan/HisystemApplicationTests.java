package com.zhongshan;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.ReactiveRedisOperations;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class HisystemApplicationTests {
    @Resource
    private RedisTemplate redisTemplate;

    @Test
    void contextLoads() {
    }
    @Test
    void test02() {
        List<String> permissionValueList = (List<String>)redisTemplate.opsForValue().get("admin");
        permissionValueList.forEach(System.out::println);
    }
}
