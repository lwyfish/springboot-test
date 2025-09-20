package com.demo.util;

import cn.hutool.extra.spring.SpringUtil;
import com.demo.service.DemoService;
import lombok.experimental.UtilityClass;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * util
 *
 * @author lwy
 * @date 2025/09/20 11:05
 **/
@UtilityClass
public class DemoUtils {
    @Resource
    private DemoService demoService;

    private DemoService demoService2 = SpringUtil.getBean(DemoService.class);

    public static void test() {
        try {
            demoService2.test();
        } catch (Exception e) {

        }
    }

    public void test2() {
        demoService.test();
    }
}
