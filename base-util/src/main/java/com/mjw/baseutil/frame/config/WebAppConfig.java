package com.mjw.baseutil.frame.config;

import com.mjw.baseutil.frame.interceptor.LogInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Description
 * @Author MinJunWen
 * @Data 2019/3/29 15:56
 * @Version 1.0.0
 **/
public class WebAppConfig implements WebMvcConfigurer {


    /**注册拦截器*/
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LogInterceptor()).addPathPatterns("/**");
    }


}
