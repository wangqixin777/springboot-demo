package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("hello")
    @ResponseBody
    public String hello() {
        return "hello.dongjing";
    }

    public static void s() {
        System.out.println(":");
        System.out.println("小飞机");
        System.out.println("master");
    }
}
