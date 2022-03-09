package com.atguigu.test;

import com.atguigu.config.MainConfigOfPropertyValues;
import org.junit.Test;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author by zxk
 * @date 2022/3/9.
 */
public class IOCTest_PropertyValue {
    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfPropertyValues.class);

    @Test
    public void test01() {
        printBeans(applicationContext);
        System.out.println("========");

        Object person = applicationContext.getBean("person");
        System.out.println(person);

        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        String property = environment.getProperty("person.nickName");
        System.out.println(property);
        applicationContext.close();
    }

    private void printBeans(AnnotationConfigApplicationContext applicationContext) {
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }
    }

}
