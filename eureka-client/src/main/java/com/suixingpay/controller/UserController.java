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
   //修改代码提交到 dev分支看看gitlab更新代码嘛
        return restTemplate.getForObject("http://localhost:8080/user",String.class);   //虚拟网址
    }
}