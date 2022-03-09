package com.atguigu.config;

import com.atguigu.bean.Car;
import com.atguigu.bean.Color;
import com.atguigu.dao.BookDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 自动装配；
 *      spring利用依赖注入(DI)，完成对IOC容器中各个组件的依赖关系赋值
 * 1.Autowired
 *
 *
 * @author by zxk
 * @date 2022/3/9.
 *
 * 2 spring还支持使用@Resource和@Inject[java规范]
 */
@Configuration
@ComponentScan({"com.atguigu.service", "com.atguigu.dao", "com.atguigu.controller", "com.atguigu.bean"})
public class MainConfigOfAutowired {

    @Bean("bookDao2")
    public BookDao bookDao() {
        BookDao bookDao = new BookDao();
        bookDao.setLabel("2");
        return bookDao;
    }

    @Bean
    public Color color(Car car) {
        Color color = new Color();
        color.setCar(car);
        return color;
    }
}
