package com.guichang.springboot01helloword.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * create by author Ma Guichang
 * create date 2019/1/27 16:59
 */

@RestController
public class HelloController {

    @Value("${person.lastName}")
    private String name;

    @RequestMapping("/hello")
    public String hello(){

        return "hello SpringBoot start A"+name;

    }
}
