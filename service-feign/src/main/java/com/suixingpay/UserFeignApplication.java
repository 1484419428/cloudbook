package com.suixingpay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @program: cloud-book
 * @description:
 * @author: zheng_y
 * @create: 2019-03-12 14:16
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class UserFeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserFeignApplication.class,args);
    }
}