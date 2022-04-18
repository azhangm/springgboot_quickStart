package com.dajuancai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
* spting boot 启动类 通常放在 二级 包中 ：  比如
* springboot 项目 在做包扫描 时 ， 会扫描启动类 所在的包 及其 子包下的所有内容
* */

@SpringBootApplication
public class SpringDemo1Application {
    public static void main(String[] args) {
        // 样板代码
        SpringApplication.run(SpringDemo1Application.class,args);
    }
}
