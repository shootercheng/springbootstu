package com.scd.boot.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.io.support.SpringFactoriesLoader;
import org.springframework.core.type.AnnotationMetadata;

import java.util.List;

/**
 * @author chengdu
 * @date 2019/11/24
 */
public class AutoBeanImportSelector implements DeferredImportSelector {
    private static final Logger LOGGER = LoggerFactory.getLogger(AutoBeanImportSelector.class);

    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        List<String> configurations = SpringFactoriesLoader.loadFactoryNames(EnableAutoBean.class, this.getClass().getClassLoader());
        if (configurations.size() == 0) {
            LOGGER.info("META-INF/spring.factories not config EnableAutoBean");
        }
        String[] result = new String[configurations.size()];
        configurations.toArray(result);
        return result;
    }
}
