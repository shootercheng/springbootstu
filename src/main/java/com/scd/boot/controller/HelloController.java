package com.scd.boot.controller;

import com.scd.chapter.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chengdu
 * @date 2020/1/5
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
//        return "success";
        return helloService.sayHello();
    }
}
