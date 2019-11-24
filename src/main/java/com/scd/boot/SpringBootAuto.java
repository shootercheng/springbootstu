package com.scd.boot;

import com.scd.boot.config.EnableAutoBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author chengdu
 * @date 2019/11/23
 */
@SpringBootApplication
@EnableAutoBean
public class SpringBootAuto {
    private static final Logger LOGGER = LoggerFactory.getLogger(SpringBootAuto.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAuto.class);
        LOGGER.info("spring boot auto run success");
    }
}
