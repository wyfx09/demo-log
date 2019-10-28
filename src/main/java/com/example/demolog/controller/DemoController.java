package com.example.demolog.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 本示例描述了，lombok 的@Slf4j注解，可以方便的使用日志记录的方法
 */
@RestController
@Slf4j
public class DemoController {

    @GetMapping("get")
    public String get(){
        log.info("get:"+System.currentTimeMillis());
        return this.getClass().getSimpleName();
    }

}
