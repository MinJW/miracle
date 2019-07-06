package com.mjw.task;

import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;
import org.junit.Test;

import java.util.*;

/**
 * @Description
 * @Author MinJunWen
 * @Data 2019/7/6 11:13
 * @Version 1.0.0
 **/
public class MyTest {

    @Test
    public void fun(){
        int[] intArr = {1,2,3,4};
        Arrays.asList(intArr);
        System.out.println(Arrays.asList(intArr).size());
        System.out.println(Arrays.asList(intArr).get(0).getClass());

        Integer[] integerArr = {1,2,3,4};
        System.out.println(Arrays.asList(integerArr).size());
        System.out.println(Arrays.asList(integerArr).get(0).getClass());
    }

}
