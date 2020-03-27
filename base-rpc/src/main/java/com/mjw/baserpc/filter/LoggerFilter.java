package com.mjw.baserpc.filter;

import com.alibaba.dubbo.common.Constants;
import com.alibaba.dubbo.common.extension.Activate;
import com.alibaba.dubbo.rpc.*;
import org.slf4j.MDC;

/**
 * @Description
 * @Author MinJunWen
 * @Data 2020/3/27 15:52
 * @Version 1.0.0
 **/
@Activate(group = {Constants.PROVIDER},order = -999)
public class LoggerFilter implements Filter {

    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        String loggerId = RpcContext.getContext().getAttachment("loggerId");
        MDC.put("loggerId",loggerId);

        return invoker.invoke(invocation);
    }
}
