package com.mjw.rpc.user.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.mjw.test.TestService;

/**
 * @Description
 * @Author MinJunWen
 * @Data 2019/3/21 15:44
 * @Version 1.0.0
 **/
@Service(version = "1.0.0")
public class TestServiceImpl implements TestService {

    @Override
    public String sayHello(String name) {
        return "hello " + name;
    }

}
