package com.mjw.baseutil.frame.config;

import com.mjw.baseutil.frame.constants.ConfigConstants;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

/**
 * @Description 项目端口配置
 * @Author MinJunWen
 * @Data 2019/3/22 11:08
 * @Version 1.0.0
 **/

@Configuration
@ConfigurationProperties(prefix = ConfigConstants.prefix.PREFIX_SERVER_POST)
public class ServerPortConfig {

    private Map<String,String> http;
    private Map<String,String> rpc;

    public Map<String, String> getHttp() {
        return http;
    }

    public void setHttp(Map<String, String> http) {
        this.http = http;
    }

    public Map<String, String> getRpc() {
        return rpc;
    }

    public void setRpc(Map<String, String> rpc) {
        this.rpc = rpc;
    }
}
