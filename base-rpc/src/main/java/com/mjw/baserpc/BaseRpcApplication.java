package com.mjw.baserpc;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.mjw.baseutil.BaseUtilApplication;
import org.mybatis.spring.annotation.MapperScan;


/**打开 dubbo 注册*/
@EnableDubbo
/**mapper扫描路径*/
@MapperScan(basePackages = "com.mjw.mapper")
/**
 *  rpc父层启动类
 * @author MinJunWen
 * @date 2019/3/27 10:32
 */
public abstract class BaseRpcApplication extends BaseUtilApplication {



}
