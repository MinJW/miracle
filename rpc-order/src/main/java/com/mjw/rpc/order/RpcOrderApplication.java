package com.mjw.rpc.order;

import com.mjw.baserpc.BaseRpcApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Title
 * @Description rpc-order启动类
 * @author MinJunWen
 * @date 2019/3/27 10:33
 */
@SpringBootApplication
public class RpcOrderApplication extends BaseRpcApplication {

    public static void main(String[] args) {
        startRpc(RpcOrderApplication.class,args);
    }

    @Override
    protected String getApplicationName() {
        return "rpc-order";
    }

}
