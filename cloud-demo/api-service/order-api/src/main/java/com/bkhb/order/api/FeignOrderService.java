package com.bkhb.order.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("order1-service")
public interface FeignOrderService {
    @GetMapping("/order/{id}")
    public String getOrderById(@PathVariable("id") Long id);
}
