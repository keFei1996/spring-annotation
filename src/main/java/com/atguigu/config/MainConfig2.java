package com.atguigu.config;

import com.atguigu.bean.Color;
import com.atguigu.bean.Person;
import com.atguigu.bean.Red;
import com.atguigu.condition.LinuxCondition;
import com.atguigu.condition.WindowsCondition;
import org.springframework.context.annotation.*;

/**
 * @author by zxk
 * @date 2022/3/3.
 */
@Configuration
@Import({Color.class, Red.class})
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
//    @Lazy
    @Bean("person")
    public Person person() {
        System.out.println("给容器中添加Person...");
        return new Person("张三", 25);
    }

    @Conditional({WindowsCondition.class})
    @Bean("bill")
    public Person person01() {
        return new Person("Bill Gates", 62);
    }

    @Conditional({LinuxCondition.class})
    @Bean("linus")
    public Person person02() {
        return new Person("linus", 48);
    }

    /**
     * 给容器中注册组件：
     *  1、包扫描+组件标注注解(@Controller/@Resosityory)
     *  2. @Bean[导入的第三方包里面的组件]
     *  3. @Import[快速给容器中导入一个组件]:容器会自动注册这个组件,id默认是全类名
     */
}
