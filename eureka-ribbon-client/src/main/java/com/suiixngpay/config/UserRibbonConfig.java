package com.suiixngpay.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @program: cloud-book
 * @description:
 * @author: zheng_y
 * @create: 2019-03-13 10:17
 **/
@Configuration
public class UserRibbonConfig {
    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return  new RestTemplate();
    }
}