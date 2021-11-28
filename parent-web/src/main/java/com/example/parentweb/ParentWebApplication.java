package com.example.parentweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.example.parentdao.mapper")
@ComponentScan("com.example")
public class ParentWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(ParentWebApplication.class, args);
    }

}
