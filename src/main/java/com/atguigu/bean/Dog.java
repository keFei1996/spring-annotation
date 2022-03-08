package com.atguigu.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author by zxk
 * @date 2022/3/8.
 */
@Component
public class Dog {
    public Dog() {
        System.out.println("dog constructor...");
    }

    // 对象创建并赋值之后调用
    @PostConstruct
    public void init() {
        System.out.println("Dog...constructor...");
    }

    // 容器移除对象之前
    @PreDestroy
    public void detory() {
        System.out.println("Dog...detory...");
    }
}
