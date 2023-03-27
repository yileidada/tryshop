package com.yilei.tryshop;

import com.yilei.LoginService;
import com.yilei.Users;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class ShopGateway {
    public static void main(String[] args) {
        SpringApplication.run(ShopGateway.class, args);
    }

    @Reference
    LoginService loginService;

    @GetMapping()
    public String login(){
        Users users = new Users();
        users.setUsername("yilei");
        users.setPassword("password");
        return loginService.Login(users);
    }
}
