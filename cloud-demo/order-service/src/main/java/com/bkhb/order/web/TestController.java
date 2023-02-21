package com.bkhb.order.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/order")
public class TestController {


    @GetMapping("/{id}")
    public String getOrderById(@PathVariable("id") Long id){
        return id.toString()+" 订单为：123456";
    }
}
