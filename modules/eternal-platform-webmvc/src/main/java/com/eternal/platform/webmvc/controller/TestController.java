package com.eternal.platform.webmvc.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @Value("${spring.application.name}")
    private String name;

    @GetMapping(value = "/test")
    public String test() {
        System.out.println(name);
        return name;
    }
}
