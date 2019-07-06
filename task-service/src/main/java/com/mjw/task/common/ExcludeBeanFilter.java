package com.mjw.task.common;

import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * @Description 不加载的Bean过滤器
 * @Author MinJunWen
 * @Data 2019/7/4 16:51
 * @Version 1.0.0
 **/
public class ExcludeBeanFilter implements TypeFilter {
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {

        if (ExcludeBeanConfig.contanisClass(metadataReader.getClassMetadata().getClassName())) {
            System.out.println("不加载:" + metadataReader.getClassMetadata().getClassName());
            return true;
        }

        return false;
    }
}
