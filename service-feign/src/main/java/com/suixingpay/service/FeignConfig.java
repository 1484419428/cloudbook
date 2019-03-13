package com.suixingpay.service;

import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * @program: cloud-book
 * @description:
 * @author: zheng_y
 * @create: 2019-03-12 14:18
 **/
@Configuration
public class FeignConfig {

    @Bean
    public Retryer feignRetryer(){
        return new Retryer.Default(100, SECONDS . toMillis(1) , 5) ;
    }
}