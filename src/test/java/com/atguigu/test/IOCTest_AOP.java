package com.atguigu.test;

import com.atguigu.aop.MathCalculator;
import com.atguigu.config.MainConfigOfAOP;
import com.atguigu.config.MainConfigOfProfile;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

/**
 * @author by zxk
 * @date 2022/3/9.
 */
public class IOCTest_AOP {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfAOP.class);

        // 不要自己创建对象
//        MathCalculator mathCalculator = new MathCalculator();
//        mathCalculator.div(1, 1);
        MathCalculator mathCalculator = applicationContext.getBean(MathCalculator.class);
        mathCalculator.div(1, 1);


        applicationContext.close();
    }
}
