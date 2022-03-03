package com.atguigu.config;

import com.atguigu.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

/**
 * @author by zxk
 * @date 2022/3/3.
 */
@Configuration
public class MainConfig2 {

    /**
     * prototype 多实例的
     * singleton 单实例的
     * @return
     *
     * 懒加载：
     *      单实例bean：默认在容器启动的时候创建对象
     */
//    @Scope("prototype")
    @Lazy
    @Bean("person")
    public Person person() {
        System.out.println("给容器中添加Person...");
        return new Person("张三", 25);
    }

    @Bean("bill")
    public Person person01() {
        return new Person("Bill Gates", 62);
    }

    @Bean("linus")
    public Person person02() {
        return new Person("linus", 48);
    }
}
