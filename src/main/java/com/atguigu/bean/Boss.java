package com.atguigu.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author by zxk
 * @date 2022/3/9.
 */
@Component
public class Boss {

    private Car car;

    @Autowired
    public Boss(Car car) {
        this.car = car;
        System.out.println("Boss...有参构造器");
    }

    public Car getCar() {
        return car;
    }

//    @Autowired  // 标注在方法上，Spring创建当前对象,就会调用方法
//    public void setCar(Car car) {
//        this.car = car;
//    }

    @Override
    public String toString() {
        return "Boss{" +
                "car=" + car +
                '}';
    }
}
