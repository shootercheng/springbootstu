package com.scd.boot.controller;

import com.scd.boot.service.impl.NotAutoServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chengdu
 * @date 2019/11/24
 */
@RestController
public class TestAutoController {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestAutoController.class);

    @Autowired
    private NotAutoServiceImpl notAutoService;

    @RequestMapping(value = "/test/auto", method = RequestMethod.GET)
    public String getAuto() {
        String info = notAutoService.showInfo();
        LOGGER.info("info {}", info);
        return "success";
    }
}
