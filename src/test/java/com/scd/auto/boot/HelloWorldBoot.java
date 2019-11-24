package com.scd.auto.boot;

import com.scd.auto.bean.TestBean;
import com.scd.auto.config.EnableHelloWord;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author chengdu
 * @date 2019/11/23
 */
@EnableHelloWord
public class HelloWorldBoot {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(HelloWorldBoot.class)
                .web(WebApplicationType.NONE)
                .run(args);
        TestBean testBean = context.getBean("testbean", TestBean.class);
        System.out.println(testBean.getName());
    }
}
