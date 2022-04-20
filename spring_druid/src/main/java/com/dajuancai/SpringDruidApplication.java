package com.dajuancai;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.dajuancai.mapper")
@SpringBootApplication
public class SpringDruidApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDruidApplication.class, args);
    }

}
