package com.scd.boot.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author chengdu
 * @date 2019/11/24
 */
public class AutoBeanA {
    private static final Logger LOGGER = LoggerFactory.getLogger(AutoBeanA.class);
    @Value("${bean.propertie}")
    private String beanapro;

    public String showInfo() {
        LOGGER.info("bean a info {}", beanapro);
        return "class autobean a";
    }
}
