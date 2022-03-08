package com.atguigu.condition;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author by zxk
 * @date 2022/3/8.
 */
public class MyImportSelector implements ImportSelector {

    // 返回值，就是要导入到容器中的组件全类名
    // AnnotationMetadata：当前标注@Import注解的类的所有类信息
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
//        importingClassMetadata.get
        return new String[]{"com.atguigu.bean.Blue", "com.atguigu.bean.Yellow"};
    }
}
