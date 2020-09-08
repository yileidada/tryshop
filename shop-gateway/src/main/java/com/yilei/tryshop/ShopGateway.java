package com.yilei.tryshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy  //代表为 一个 ZUUL网关服务器
public class ShopGateway {
    public static void main(String[] args) {
        SpringApplication.run(ShopGateway.class, args);
    }
}
