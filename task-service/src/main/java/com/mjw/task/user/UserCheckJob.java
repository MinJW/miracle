package com.mjw.task.user;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author MinJunWen
 * @Data 2019/7/4 16:28
 * @Version 1.0.0
 **/
@Component
public class UserCheckJob {

    @Scheduled(cron = "${com.mjw.task.usercheck.cron}")
    public void run(){
        System.out.println("userCheckJob...");
    }

}
