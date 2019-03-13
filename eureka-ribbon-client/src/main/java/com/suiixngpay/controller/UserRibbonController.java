package com.suiixngpay.controller;

import com.suiixngpay.service.UserRibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: cloud-book
 * @description:
 * @author: zheng_y
 * @create: 2019-03-12 15:03
 **/
@RestController
public class UserRibbonController {
    @Autowired
    UserRibbonService userRibbonService;
    @GetMapping("/userLogin")
     public String userLogin(@RequestParam(required = false,defaultValue = "suixingpay") String name){
        return userRibbonService.userLogin(name);
    }
}