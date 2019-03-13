package com.suiixngpay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: cloud-book
 * @description:
 * @author: zheng_y
 * @create: 2019-03-12 14:57
 **/
@SpringBootApplication
@EnableEurekaClient
public class UserRibbonApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserRibbonApplication.class,args);
    }
}