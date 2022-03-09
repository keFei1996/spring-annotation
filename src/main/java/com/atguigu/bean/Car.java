package com.atguigu.bean;

import org.springframework.stereotype.Component;

/**
 * @author by zxk
 * @date 2022/3/2.
 */
@Component
public class Car {
    public Car() {
        System.out.println("car constructor...");
    }

    public void init() {
        System.out.println("car... init...");
    }

    public void detory() {
        System.out.println("car... detory...");
    }
}
