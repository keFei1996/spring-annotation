package com.atguigu.config;

import com.atguigu.bean.Yellow;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.util.StringValueResolver;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 * Profile:
 *      Spring为我们提供的可以根据当前环境，动态的激活和切换一系列组件的功能
 *
 *
 * @author by zxk
 * @date 2022/3/9.
 */
@PropertySource("classpath:/dbconfig.properties")
@Configuration
public class MainConfigOfProfile implements EmbeddedValueResolverAware {

    @Value("${db.user}")
    private String user;

    private StringValueResolver valueResolver;

    @Bean
    public Yellow yellow() {
        return new Yellow();
    }

    @Profile("dev")
    @Bean("devDataSource")
    public DataSource dataSource(@Value("${db.password}") String pwd) throws Exception {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser(user);
        dataSource.setPassword(pwd);
        dataSource.setJdbcUrl("jdbc:mysql://101.35.126.172:3306/testMyBatisPlus");
        dataSource.setDriverClass("com.mysql.jdbc.Driver");

        return dataSource;
    }

    @Profile("test")
    @Bean("testDataSource")
    public DataSource dataSourceTest(@Value("${db.password}") String pwd) throws Exception {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser(user);
        dataSource.setPassword(pwd);
        dataSource.setJdbcUrl("jdbc:mysql://101.35.126.172:3306/test");
        dataSource.setDriverClass("com.mysql.jdbc.Driver");

        return dataSource;
    }

    @Profile("prod")
    @Bean("prodDataSource")
    public DataSource dataSourceProd(@Value("${db.password}") String pwd) throws Exception {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser(user);
        dataSource.setPassword(pwd);
        dataSource.setJdbcUrl("jdbc:mysql://101.35.126.172:3306/gulimall_pms");
        dataSource.setDriverClass("com.mysql.jdbc.Driver");

        return dataSource;
    }

    @Override
    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        this.valueResolver = resolver;
    }
}
