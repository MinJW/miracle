package com.mjw.http.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.mjw.test.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author MinJunWen
 * @Data 2019/3/21 15:41
 * @Version 1.0.0
 **/
@RestController
public class TestController {

    @Reference(version = "1.0.0")
    private TestService testService;

    @GetMapping("/test")
    public String test(){
        return testService.sayHello("test");
    }

}
