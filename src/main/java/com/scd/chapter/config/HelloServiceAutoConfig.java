package com.scd.chapter.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author chengdu
 * @date 2020/1/5
 */
@Configuration
@ComponentScan(value = {"com.scd.chapter.service"})
public class HelloServiceAutoConfig {
}
