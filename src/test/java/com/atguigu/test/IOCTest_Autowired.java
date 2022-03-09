package com.atguigu.test;

import com.atguigu.bean.Boss;
import com.atguigu.bean.Car;
import com.atguigu.bean.Color;
import com.atguigu.config.MainConfigOfAutowired;
import com.atguigu.config.MainConfigOfPropertyValues;
import com.atguigu.service.BookService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author by zxk
 * @date 2022/3/9.
 */
public class IOCTest_Autowired {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfAutowired.class);

//        BookService bookService = applicationContext.getBean(BookService.class);
//        System.out.println(bookService);

        Boss boss = applicationContext.getBean(Boss.class);
        System.out.println(boss);

        Car car = applicationContext.getBean(Car.class);
        System.out.println(car);

        Color color = applicationContext.getBean(Color.class);
        System.out.println(color);


        applicationContext.close();
    }
}
