package com.scd.chapter.service.impl;

import com.scd.chapter.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @author chengdu
 * @date 2020/1/5
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello() {
        return "hello";
    }
}
