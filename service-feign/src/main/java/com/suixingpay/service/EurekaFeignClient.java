package com.suixingpay.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-client",configuration = FeignConfig.class)
public interface EurekaFeignClient {
    @RequestMapping(value = "/userLogin")
    String userLoginFromClient(@RequestParam(value = "name") String name);
}
