package com.yilei.tryshop.apiservice;

import com.yilei.LoginService;
import com.yilei.Users;
import org.apache.dubbo.config.annotation.Service;

@Service(protocol = "dubbo")
public class LoginServiceImpl implements LoginService {
    @Override
    public String Login(Users users) {
        return "hello world";
    }
}
