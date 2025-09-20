package com.demo.controller;

import com.demo.service.DemoService2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @Value("${name}")
    private String name;

    @RequestMapping("/hello")
    public String hello() {
        return "Hello SpringBoot!";
    }

    @RequestMapping("/hello2")
    public String hello2() {
        return name;
    }

    @RequestMapping("/test")
    public void test() {
        DemoService2 demoService2 = new DemoService2();
        demoService2.test();
    }
}
