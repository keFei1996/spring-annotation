package com.atguigu.config;

import com.atguigu.bean.Person;
import com.atguigu.service.BookService;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * @author by zxk
 * @date 2022/3/2.
 */
@Configuration
//@ComponentScan(value = "com.atguigu", includeFilters = {
//        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class})
//
//}, useDefaultFilters = false)
@ComponentScans(
        value = {
                @ComponentScan(value = "com.atguigu", includeFilters = {
                        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class}),
                        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {BookService.class})

                }, useDefaultFilters = false)
        }
)
// @ComponentScan value:指定要扫描的包
// excludeFilters = Filter[]: 指定扫描的时候按照什么规则排除哪些组件
// includeFilters = Filter[]: 指定扫描的时候只需要包含哪些组件
// FilterType.ANNOTATION 按照注解
// FilterType.ANNOTATION 按照给定的类型
// FilterType.REGEX 使用正则指定
// FilterType.CUSTOM 使用自定义规则
public class MainConfig {

    // 给容器中注册一个Bean;类型为返回值的类型,id默认是用方法名作为id
    @Bean("person")
    public Person person01() {
        return new Person("lisi", 20);
    }
}
