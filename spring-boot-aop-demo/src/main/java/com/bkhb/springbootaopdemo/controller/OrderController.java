package com.bkhb.springbootaopdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 订单管理
 *
 * @author bkhb
 * @version 1.0
 * @date 2023/4/8 16:51
 */
@RestController
@RequestMapping("order")
public class OrderController {

    @GetMapping
    public String listOder() {
        System.out.println("返回订单信息");
        return "返回订单信息";
    }

    @PostMapping
    public String addOder() {
        return "添加订单成功";
    }
}
