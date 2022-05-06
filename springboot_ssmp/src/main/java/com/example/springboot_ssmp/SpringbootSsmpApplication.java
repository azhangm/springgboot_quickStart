package com.example.springboot_ssmp;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.springboot_ssmp.mapper")
public class SpringbootSsmpApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootSsmpApplication.class, args);
    }

}
