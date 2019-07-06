package com.mjw.task.common;

import com.mjw.task.TaskServiceApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @Description
 * @Author MinJunWen
 * @Data 2019/7/6 16:03
 * @Version 1.0.0
 **/
@SpringBootApplication
@EnableScheduling
@ComponentScan(
        basePackages = "com.mjw",
        excludeFilters = {
                //根据注解过滤不加载的Bean
                //@ComponentScan.Filter(type=FilterType.ANNOTATION, value= {ExcludeBean.class}),
                //根据自定义过滤器过滤不加载的Bean
                @ComponentScan.Filter(type=FilterType.CUSTOM, value= {ExcludeBeanFilter.class})
        }
)
public class ParentApplication {

    public static void start(Class clazz,String[] args) {
        SpringApplication.run(TaskServiceApplication.class, args);
    }

}
