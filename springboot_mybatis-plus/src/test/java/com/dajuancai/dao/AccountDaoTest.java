package com.dajuancai.dao;

import com.dajuancai.SpringbootMybatisPlusApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(classes = SpringbootMybatisPlusApplication.class)
class AccountDaoTest {
   @Autowired
   private AccountDao accountDao;

    @Test
    void test(){
    accountDao.selectList(null).forEach(System.out::println);
}
}