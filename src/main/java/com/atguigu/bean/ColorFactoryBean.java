package com.atguigu.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author by zxk
 * @date 2022/3/8.
 */
// 创建一个spring定义的FactoryBean
public class ColorFactoryBean implements FactoryBean<Color> {
    // 返回一个Color对象，这个对象会添加到容器中
    @Override
    public Color getObject() throws Exception {
        System.out.println("ColorFactoryBean...");
        return new Color();
    }

    @Override
    public Class<?> getObjectType() {
        return Color.class;
    }

    // true： 这个Bean是单实例，在容器中保存一份
    // false: 这个Bean是多实例
    @Override
    public boolean isSingleton() {
        return false;
    }
}
