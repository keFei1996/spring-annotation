package com.atguigu.config;

import org.springframework.core.io.Resource;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * @author by zxk
 * @date 2022/3/2.
 */
public class MyTypeFilter implements TypeFilter {

    /**
     *
     * @param metadataReader 读取到当前正在扫描的类的信息
     * @param metadataReaderFactory 可以获取到其他任何类信息
     * @return
     * @throws IOException
     */
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        // 获取当前类注解的信息
        metadataReader.getAnnotationMetadata();
        // 获取当前正在扫描的类的类信息
        metadataReader.getClassMetadata();
        // 获取当前类资源(类的路径)
        Resource resource = metadataReader.getResource();


        return false;
    }
}
