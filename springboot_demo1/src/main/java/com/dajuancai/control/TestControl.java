package com.dajuancai.control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControl {
    @RequestMapping("/test")
    public String test(){
        return "hello Spring boot";
    }
}
