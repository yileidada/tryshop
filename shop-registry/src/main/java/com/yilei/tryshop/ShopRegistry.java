package com.yilei.tryshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ShopRegistry {

    public static void main(String[] args) {
        SpringApplication.run(ShopRegistry.class, args);
    }
}
