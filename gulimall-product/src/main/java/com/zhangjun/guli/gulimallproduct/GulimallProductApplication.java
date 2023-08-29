package com.zhangjun.guli.gulimallproduct;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * mybatis逻辑删除配置
 *  1、在application.yml中配置mybatis-plus全局逻辑删除配置（3.1.0版本以上省略）
 *  2、在config配置类中注入逻辑删除组件（3.1.0版本以上省略）
 *  3、在实体类的属性中配置逻辑删除注解：@TableLogic(value = "1",delval="0")
 */
@SpringBootApplication
@MapperScan(value = "com.zhangjun.guli.gulimallproduct.dao")
@ComponentScan(basePackages = {"com.zhangjun.guli"})
@EnableDiscoveryClient
@EnableFeignClients
public class GulimallProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class,args);
    }
}
