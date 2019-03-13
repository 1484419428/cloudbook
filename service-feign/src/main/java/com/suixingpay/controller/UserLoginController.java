package com.suixingpay.controller;

import com.suixingpay.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: cloud-book
 * @description:
 * @author: zheng_y
 * @create: 2019-03-12 14:25
 **/
@RestController
public class UserLoginController {
    @Autowired
    private UserLoginService userLoginService;
    @GetMapping(value = "/userLogin")
    public String userLogin(@RequestParam(required = false,defaultValue = "suixingpay") String name){
        return userLoginService.userLogin(name);
    }
}