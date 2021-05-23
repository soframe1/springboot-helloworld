package com.dd.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author zhaojing
 * @Date 2020/12/29 23:43
 * @Version 1.0
 */
@RestController
public class TestController {
    
    @RequestMapping("/hello")
    public String hello(){
        return "hello world!!!";
    }
}
