package com.mjw.task;

import com.mjw.task.common.ExcludeBeanFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.scheduling.annotation.EnableScheduling;

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
public class TaskServiceApplication{// extends ParentApplication

    public static void main(String[] args) {
        SpringApplication.run(TaskServiceApplication.class, args);
        //start(TaskServiceApplication.class,args);
    }



}
