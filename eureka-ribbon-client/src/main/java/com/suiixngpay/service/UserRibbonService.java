package com.suiixngpay.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @program: cloud-book
 * @description:
 * @author: zheng_y
 * @create: 2019-03-12 15:00
 **/
@Service
public class UserRibbonService {
    @Autowired
    RestTemplate restTemplate;
    public String userLogin(String name){
        return restTemplate.getForObject("http://eureka-client/userLogin?name="+name,String.class);
    }
}