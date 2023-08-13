package com.zhangjun.guli.gulimallcoupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@MapperScan(value = "com.zhangjun.guli.gulimallcoupon.dao")
@ComponentScan(basePackages = {"com.zhangjun.guli"})
@EnableDiscoveryClient
@EnableFeignClients
public class GulimallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }

}
