package com.scd.auto.config;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author chengdu
 * @date 2019/11/23
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import(HelloWorldImportSelector.class)
public @interface EnableHelloWord {
}
