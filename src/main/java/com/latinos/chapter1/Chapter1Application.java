package com.latinos.chapter1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 当采用mybatis配置后，我们还需要如下的注解来将mapper的路径暴露给spring让它来扫描管理
@MapperScan("com.latinos.chapter1.repository")
@SpringBootApplication
public class Chapter1Application {

    public static void main(String[] args) {
        SpringApplication.run(Chapter1Application.class, args);
    }

}
