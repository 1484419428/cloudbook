package com.suixingpay.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @program: cloud-book
 * @description:
 * @author: zheng_y
 * @create: 2019-03-13 11:58
 **/
@RestController
public class UserController {
    @GetMapping("/user")
    public String userRest(){
        RestTemplate restTemplate = new RestTemplate();
       // User user = restTemplate.getForObject("http://localhost:8080/user",User.class); 修改dev代码然后提交到远程
        
        //切换到dev分支修改代码然后合并到master

        return restTemplate.getForObject("http://localhost:8080/user",String.class);   //虚拟网址
    }
}