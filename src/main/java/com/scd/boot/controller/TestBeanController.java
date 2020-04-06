package com.scd.boot.controller;

import com.scd.boot.bean.ApplicationBean;
import com.scd.boot.factory.SqlSession;
import com.scd.boot.factory.SqlSessionSingletonFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.ApplicationObjectSupport;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.ContextLoader;

/**
 * @author James
 */
@RestController
public class TestBeanController {

    @Value("${bean.factory.type:single}")
    private String type;

    @Autowired
    private ApplicationBean applicationBean;

    @RequestMapping(value = "/test/bean", method = RequestMethod.GET)
    public String testSingleBean() {
        SqlSession sqlSession = applicationBean.getBean(SqlSession.class);
        if ("single".equals(type)) {
            return "single_" + sqlSession.getId();
        } else if ("prototype".equals(type)) {
            return "prototype_" + sqlSession.getId();
        } else {
            return "unknown type";
        }
    }
}
