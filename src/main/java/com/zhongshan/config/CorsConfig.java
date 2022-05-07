package com.zhongshan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * @author: Clay
 * @date: 2022/1/25 21:46
 * @description：CorsConfig 跨域配置类
 * @email: clay@hchyun.com
 */
//@Configuration
public class CorsConfig {

    public CorsConfig() {
    }

    @Bean
    public CorsFilter corsFilter(){
        //1. 添加cors配置信息
        CorsConfiguration config = new CorsConfiguration();
        config.addAllowedOrigin("**");
//        config.addAllowedOrigin("http://localhost:8888");
//        config.addAllowedOrigin("http://shop.z.mytwins.top");
//        config.addAllowedOrigin("http://center.z.mytwins.top");
//        config.addAllowedOrigin("http://shop.z.mytwins.top:8888");
//        config.addAllowedOrigin("http://center.z.mytwins.top:8888");


        //设置是否发送cookie信息
        config.setAllowCredentials(true);

        //设置放行的请求类型
        config.addAllowedMethod("*");

        //设置允许的header-
        config.addAllowedHeader("*");

        //2. 为url添加路径映射
        UrlBasedCorsConfigurationSource corsSource = new UrlBasedCorsConfigurationSource();
        corsSource.registerCorsConfiguration("/**",config);

        //3. 返回重新定义好的corsSource
        return new CorsFilter(corsSource);
    }
}
