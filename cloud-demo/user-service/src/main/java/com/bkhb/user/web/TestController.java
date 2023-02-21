package com.bkhb.user.web;

import com.bkhb.order.api.FeignOrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class TestController {

    @Resource
    private FeignOrderService feignOrderService;

    @GetMapping
    public String getUser(){
        return feignOrderService.getOrderById(1L);
    }
}
