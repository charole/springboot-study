package com.springboot.study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController2 {
    @GetMapping("test2")
    public String testController2() {
        return "Hello World2!";
    }
}
