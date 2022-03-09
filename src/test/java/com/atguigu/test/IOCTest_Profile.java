package com.atguigu.test;

import com.atguigu.bean.Boss;
import com.atguigu.bean.Car;
import com.atguigu.bean.Color;
import com.atguigu.config.MainConfigOfAutowired;
import com.atguigu.config.MainConfigOfProfile;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

/**
 * @author by zxk
 * @date 2022/3/9.
 */
public class IOCTest_Profile {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        // 1.创建一个applicationContext
        // 2.设置需要激活的环境
        applicationContext.getEnvironment().setActiveProfiles("dev", "test");

        applicationContext.register(MainConfigOfProfile.class);

        applicationContext.refresh();


        String[] namesForType = applicationContext.getBeanNamesForType(DataSource.class);

        for (String name : namesForType) {
            System.out.println(name);
        }

        applicationContext.close();
    }
}
