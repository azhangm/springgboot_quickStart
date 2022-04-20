package com.dajuancai;

import com.dajuancai.domain.Account;
import com.dajuancai.mapper.AccountDao;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@MapperScan("com.dajuancai.mapper")
@SpringBootTest
class SpringMybaitisApplicationTests {

@Autowired
private AccountDao accountDao;
    @Test
    void contextLoads() {
        Account account = accountDao.selectByPrimaryKey(1);
        System.out.println(account);
    }

}
