package com.scd.boot.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ApplicationObjectSupport;

/**
 * @author James
 */
@Configuration
public class ApplicationBean extends ApplicationObjectSupport {

    public <T> T getBean(Class<T> clazz) {
        return super.getApplicationContext().getBean(clazz);
    }
}
