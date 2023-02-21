package com.bkhb.user;

import com.bkhb.order.api.FeignOrderService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author bkhb
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(clients = {FeignOrderService.class})
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}
