package com.example.bootmybatis;

import com.example.bootmybatis.mapper.AccountMapper;
import com.example.bootmybatis.pojo.Account;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class BootmybatisApplicationTests {


   @Autowired
   private AccountMapper accountMapper;


    @Test
    void contextLoads() {
        Account a = accountMapper.findAll();
        System.out.println(a);
    }

}
