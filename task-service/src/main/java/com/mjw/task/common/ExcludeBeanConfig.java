package com.mjw.task.common;

import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.util.CollectionUtils;
import org.springframework.util.DefaultPropertiesPersister;
import org.springframework.util.PropertiesPersister;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

/**
 * @Description 不加载的Bean过滤器
 * @Author MinJunWen
 * @Data 2019/7/4 16:51
 * @Version 1.0.0
 **/
public class ExcludeBeanConfig{

    private static final String DEFAULT_ENCODING = "UTF-8";

    private static PropertiesPersister propertiesPersister;

    private static ResourceLoader resourceLoader;

    private static List<String> classList;

    static {
        classList = new ArrayList<>();
        propertiesPersister = new DefaultPropertiesPersister();
        resourceLoader = new DefaultResourceLoader();

        Properties properties = null;
        try{
            properties = loadProperties("classpath:application.properties");
        }catch (Exception e){
            throw new RuntimeException("APPLICATION CONF NOT EXIST...");
        }

        Object pro = properties.get("exclude.bean.classList");
        if(null != pro){
            classList = Arrays.asList(String.valueOf(pro).split(","));
        }
    }

    public static boolean contanisClass(String clazzName){
        if(StringUtils.isEmpty(clazzName)){
            return false;
        }

        if(CollectionUtils.isEmpty(classList)){
            return false;
        }

        for(String clazz : classList){
            if(clazzName.equals(clazz)){
                return true;
            }
        }

        return false;
    }




    public static Properties loadProperties(String... resourcesPaths)
            throws IOException {
        Properties props = new Properties();

        for (String location : resourcesPaths) {

            InputStream is = null;
            try {
                Resource resource = resourceLoader.getResource(location);
                is = resource.getInputStream();
                propertiesPersister.load(props, new InputStreamReader(is,
                        DEFAULT_ENCODING));
            } catch (IOException ex) {
                System.out.println("Could not load properties from classpath:"
                        + location + ": " + ex.getMessage());
            } finally {
                if (is != null) {
                    is.close();
                }
            }
        }
        return props;
    }

}
