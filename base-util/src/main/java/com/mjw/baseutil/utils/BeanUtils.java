package com.mjw.baseutil.utils;

/**
 * @Description
 * @Author MinJunWen
 * @Data 2019/3/28 11:14
 * @Version 1.0.0
 **/
public class BeanUtils {

    public static void copyProperties(Object source, Object target){
        if(null == source){
            target = null;
        }else {
            org.springframework.beans.BeanUtils.copyProperties(source,target);
        }
    }

}
