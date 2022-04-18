package com.dajuancai.Control;

import com.dajuancai.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class HelloControl {
    @RequestMapping("/boot")
    public String hello(){
        return "你好 spring boot!!!!";
    }
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private Person person;
    @RequestMapping("/person")
    String get1(){
        return person.toString();
    }
    @RequestMapping("/JDBC")
    String get(){
        return jdbcTemplate.toString();
    }

}
