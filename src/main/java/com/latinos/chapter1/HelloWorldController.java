package com.latinos.chapter1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: latinos-bub
 * @date: 2020/3/5 15:40
 * @description:
 * @className: HelloWorldController
 */
@RestController
@RequestMapping("/hello")
public class HelloWorldController {


    @GetMapping
    public String hello(){

        return "hello world";
    }
}
