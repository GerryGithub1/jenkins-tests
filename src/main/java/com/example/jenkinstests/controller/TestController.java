package com.example.jenkinstests.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/hello")
    public String xxx() {
        return "Hello Jenkins!!!!";
    }

    @RequestMapping("/hello1")
    public String hello1() {
        return "Hello Jenkins1";
    }
}
