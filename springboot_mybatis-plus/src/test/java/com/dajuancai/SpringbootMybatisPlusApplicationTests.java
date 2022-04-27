package com.dajuancai;

import com.dajuancai.dao.AccountDao;
import com.dajuancai.domain.Account;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootMybatisPlusApplicationTests {
    @Autowired
    private AccountDao accountDao;

    @Test
    void test(){
        List<Account> list = accountDao.selectList(null);
        for (Account o : list) {
            System.out.println(o);
        }

    }
    @Test
    void contextLoads() {
    }

}
