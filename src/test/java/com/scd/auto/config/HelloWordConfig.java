package com.scd.auto.config;

import com.scd.auto.bean.TestBean;
import org.springframework.context.annotation.Bean;

/**
 * @author chengdu
 * @date 2019/11/23
 */
public class HelloWordConfig {

    @Bean(name = "testbean")
    public TestBean createTestBean() {
        return new TestBean();
    }
}
