package com.zhongshan.config;


import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

/**
 * Swagger2的接口配置
 *
 * @author ruoyi
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    /**
     * 系统基础配置
     */


    /**
     * 是否开启swagger
     */
    //@Value("${swagger.enabled}")
    private boolean enabled = true;

    /**
     * 设置请求的统一前缀
     */
    //@Value("${swagger.pathMapping}")
    //private String pathMapping = "/prod-api";

    /**
     * 创建API
     */
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                // 是否启用Swagger
                .enable(enabled)
                // 用来创建该API的基本信息，展示在文档的页面中（自定义展示的信息）
                .apiInfo(apiInfo())
                // 设置哪些接口暴露给Swagger展示
                .select()
                // 扫描所有有注解的api，用这种方式更灵活
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                // 扫描指定包中的swagger注解
                // .apis(RequestHandlerSelectors.basePackage("com.ruoyi.project.tool.swagger"))
                // 扫描所有 .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .globalOperationParameters(this.getParameterList());// 全局配置;
    }


    /**
     * 添加head参数配置
     */
    private List<Parameter> getParameterList() {
        ParameterBuilder clientIdTicket = new ParameterBuilder();
        List<Parameter> pars = new ArrayList<Parameter>();
        clientIdTicket.name("token").description("token令牌")
                .modelRef(new ModelRef("string"))
                .parameterType("header")
                .required(false).build(); //设置false，表示clientId参数 非必填,可传可不传！
        pars.add(clientIdTicket.build());
        return pars;
    }

    /**
     * 添加摘要信息
     */
    private ApiInfo apiInfo() {
        // 用ApiInfoBuilder进行定制
        return new ApiInfoBuilder()
                // 设置标题
                .title("标题：中山大学校医院后台管理系统_接口文档")
                // 描述
                .description("描述：个人使用")
                // 作者信息
                .contact(new Contact("J283", null, null))
                // 版本
                .termsOfServiceUrl("http://localhost:8888/")
                .version("版本号:1.0.0" )
                .build();
    }
}
