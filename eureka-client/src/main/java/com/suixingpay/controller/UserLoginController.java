package com.suixingpay.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: cloud-book
 * @description:
 * @author: zheng_y
 * @create: 2019-03-12 13:45
 **/
@RestController
public class UserLoginController {
    @Value("${server.port}")
    public String port;
    @GetMapping("/userLogin")
    public String login(@RequestParam String name){
        return "hi:"+name+",this is login and port:"+port;


    }
}