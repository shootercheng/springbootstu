package com.scd.test.map;

import org.junit.Test;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author chengdu
 * @date 2019/11/23
 */
public class TestMap {

    private static final Map<String, String> transformedBeanNameCache = new ConcurrentHashMap();

    @Test
    public void testCompute() {
//        String name= "&12345";
        transformedBeanNameCache.putIfAbsent("test","cd");
        transformedBeanNameCache.putIfAbsent("test", "cd1");
        transformedBeanNameCache.computeIfAbsent("name", k -> "chengdu");
        System.out.println(transformedBeanNameCache);
        // formatbean name
        String inputBeanname = "&&&hello";
        String result = transformedBeanNameCache.computeIfAbsent(inputBeanname, (beanName) -> {
            do {
                beanName = beanName.substring("&".length());
            } while(beanName.startsWith("&"));

            return beanName;
        });
        System.out.println(result);
    }
}
