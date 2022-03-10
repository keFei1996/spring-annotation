package com.atguigu.config;

import com.atguigu.aop.LogAspects;
import com.atguigu.aop.MathCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * AOP原理：【看给容器中注册了什么组件，这个组件什么时候工作，这个组件】
 *      @EnableAspectJAutoProxy
 *      @Import(AspectJAutoProxyRegistrar.class) 给容器中导入 AspectJAutoProxyRegistrar
 *              利用AspectJAutoProxyRegistrar自定义给容器注册bean
 *      给容器中注册一个AnnotationAwareAspectJAutoProxyCreator
 * 2.AnnotationAwareAspectJAutoProxyCreator
 *      AnnotationAwareAspectJAutoProxyCreator
 *        -> AspectJAwareAdvisorAutoProxyCreator
 *          -> AbstractAdvisorAutoProxyCreator
 *            -> AbstractAutoProxyCreator
 *                  implements SmartInstantiationAwareBeanPostProcessor, BeanFactoryAware
 *               关注后置处理器(在bean初始化完成前后做事情)
 *
 * AspectJAwareAdvisorAutoProxyCreator
 *
 * 流程：
 *    2.注册配置类，调用refresh()
 *    3.registerBeanPostProcessors(beanFactory);
 *
 * BeanPostProcess
 *
 * InstantiationAwareBeanPostProcessor
 *
 * @author by zxk
 * @date 2022/3/9.
 */
@EnableAspectJAutoProxy
@Configuration
public class MainConfigOfAOP {
    @Bean
    public MathCalculator calculator() {
        return new MathCalculator();
    }

    @Bean
    public LogAspects logAspects() {
        return new LogAspects();
    }
}
