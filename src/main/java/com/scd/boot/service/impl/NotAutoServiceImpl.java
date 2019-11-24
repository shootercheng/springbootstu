package com.scd.boot.service.impl;

import com.scd.boot.bean.AutoBeanA;
import com.scd.boot.bean.AutoBeanB;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author chengdu
 * @date 2019/11/24
 */
@Service
public class NotAutoServiceImpl {
    private static Logger LOGGER = LoggerFactory.getLogger(NotAutoServiceImpl.class);

    @Autowired
    private AutoBeanA autoBeana;

    @Autowired
    private AutoBeanB autoBeanb;

    public String showInfo() {
        LOGGER.info("auto bean a {}", autoBeana.showInfo());
        LOGGER.info("auto bean b {}", autoBeanb.showInfo());
        return "not auto info";
    }
}
