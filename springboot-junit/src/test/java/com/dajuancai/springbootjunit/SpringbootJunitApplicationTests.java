package com.dajuancai.springbootjunit;

import com.dajuancai.springbootjunit.SpringbootJunitApplication;
import com.dajuancai.springbootjunit.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
//classes = SpringbootJunitApplication.class 指定配置类
class SpringbootJunitApplicationTests {
    @Autowired
    private BookDao dao;
    @Test
    void contextLoads() {
        dao.save();
    }

}
