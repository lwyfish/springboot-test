package com.demo.service;

import cn.hutool.extra.spring.SpringUtil;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


/**
 * service，未被spring容器管理
 *
 * @author lwy
 * @date 2025/09/20 11:03
 **/
public class DemoService2 {

    private DemoService demoService = SpringUtil.getBean(DemoService.class);

    public void test() {
        demoService.test();
    }
    
}
