package com.mjw.basehttp.interceptor;

import com.alibaba.dubbo.rpc.RpcContext;
import com.alibaba.dubbo.rpc.protocol.rest.RpcContextFilter;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;

/**
 * @Description
 * @Author MinJunWen
 * @Data 2020/3/27 15:02
 * @Version 1.0.0
 **/
@Component
public class LoggerInterceptor extends HandlerInterceptorAdapter {


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {

        String loggerId = UUID.randomUUID().toString();

        RpcContext.getContext().setAttachment("loggerId",loggerId);

        MDC.put("loggerId",loggerId);

        return true;
    }


}
