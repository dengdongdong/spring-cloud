package cn.itcast.bean;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * Author: asus
 * Date: 2023/11/23 18:10
 */
public class UserImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        // 获取配置类名称
        return new String[]{UserConfiguration.class.getName()};
    }
}
