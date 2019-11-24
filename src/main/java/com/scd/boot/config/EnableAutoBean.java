package com.scd.boot.config;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author chengdu
 * @date 2019/11/24
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import(AutoBeanImportSelector.class)
public @interface EnableAutoBean {
}
