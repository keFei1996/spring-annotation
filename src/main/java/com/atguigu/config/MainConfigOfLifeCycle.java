package com.atguigu.config;

import com.atguigu.bean.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author by zxk
 * @date 2022/3/2.
 * 容器管理bean的生命周期
 *      bean创建---初始化--摧毁的过程
 * 1)指定初始化和销毁方法
 *      通过@Bean指定init-method和destroy-method
 * 2).通过让Bean实现InitializingBean（定义初始化逻辑）
 * 3).可以使用JSR250;
 *          @PostConstruct: 在bean创建完成并且属性赋值完成
 * @BeanPostProcessor
 */
@ComponentScan("com.atguigu.bean")
@Configuration
public class MainConfigOfLifeCycle {

    // @Scope("prototype")
    @Bean(initMethod = "init", destroyMethod = "detory")
    public Car car() {
        return new Car();
    }

}
