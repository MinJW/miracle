package com.mjw.base.util;

import com.mjw.base.util.frame.config.ServerPortConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;

/**
 * @author Min_j
 */
@SpringBootApplication
public abstract class BaseUtilApplication implements WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> {

    @Autowired
    private ServerPortConfig serverPortConfig;

    public static void startHttp(Class<?> clazz,String[] args){
        SpringApplication.run(clazz, args);
    }

    /**
     * @Title
     * @Description 设置启动端口
     * @author MinJunWen
     * @date 2019/3/22 11:29
     */
    @Override
    public void customize(ConfigurableServletWebServerFactory factory) {
        String applicationName = getApplicationName();
        String[] applicationSplit = applicationName.split("-");
        if(applicationSplit.length < 2){
            throw new RuntimeException(" Application Name IS ERROR ,please check your Application Name...");
        }

        int port = 0;
        if(ServerTypeEnum.isHttp(applicationSplit[0])){
            port = Integer.parseInt(serverPortConfig.getHttp().get(applicationSplit[1]));
        }else if(ServerTypeEnum.isRpc(applicationSplit[0])){
            port = Integer.parseInt(serverPortConfig.getRpc().get(applicationSplit[1]));
        }

        factory.setPort(port);
    }

    /**
     * 系统应用名
     *
     * @Title
     * @throw
     * @return
     * @author MinJunWen
     * @date 2019/3/22 11:41
     */
    protected abstract String getApplicationName();

    /**
     * http 服务或RPC 服务类型;
     */
    enum ServerTypeEnum {
        HTTP,RPC;
        static boolean isHttp(String http){
            return HTTP.name().equalsIgnoreCase(http);
        }
        static boolean isRpc(String rpc){
            return RPC.name().equalsIgnoreCase(rpc);
        }
    }













    public static void main(String[] args) {
        /*HashMap<String, Object> properties = new HashMap<>();
        properties.put("server.port", 9000);
        new SpringApplicationBuilder().run(args);*/
        //SpringApplication.run(BaseHttpApplication.class, args);
    }

}
