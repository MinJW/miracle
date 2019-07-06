package com.mjw.task.user;

import com.mjw.task.common.ExcludeBean;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author MinJunWen
 * @Data 2019/7/4 16:28
 * @Version 1.0.0
 **/
@Component
public class UserCancelJob {

    @Scheduled(cron = "${com.mjw.task.usercancel.cron}")
    public void run(){
        System.out.println("UserCancelJob...");
    }
}
