package com.mjw.task.common;

import com.mjw.task.TaskServiceApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description
 * @Author MinJunWen
 * @Data 2019/7/6 16:03
 * @Version 1.0.0
 **/
@SpringBootApplication
public class ParentApplication {

    public static void start(Class clazz,String[] args) {
        SpringApplication.run(TaskServiceApplication.class, args);
    }

}
