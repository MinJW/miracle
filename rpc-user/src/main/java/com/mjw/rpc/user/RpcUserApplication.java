package com.mjw.rpc.user;

import com.mjw.baserpc.BaseRpcApplication;

/**
 * @Title
 * @Description rpc-user启动类
 * @author MinJunWen
 * @date 2019/3/27 10:33
 */
public class RpcUserApplication extends BaseRpcApplication {

    public static void main(String[] args) {
        startRpc(RpcUserApplication.class,args);
    }

    @Override
    protected String getApplicationName() {
        return "rpc-user";
    }

}
