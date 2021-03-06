package com.dajuancai;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dajuancai.mapper")
public class SpringMybaitisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMybaitisApplication.class, args);
    }

}
