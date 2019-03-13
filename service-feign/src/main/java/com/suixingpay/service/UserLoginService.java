package com.suixingpay.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @program: cloud-book
 * @description:
 * @author: zheng_y
 * @create: 2019-03-12 14:23
 **/
@Service
public class UserLoginService {
    @Autowired
    private EurekaFeignClient eurekaFeignClient;
     public String userLogin(String name){
        return  eurekaFeignClient.userLoginFromClient(name);
    }
}