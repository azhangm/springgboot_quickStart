package com.dajuancai;

import com.dajuancai.mapper.AccountDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = SpringDruidApplication.class)
class SpringDruidApplicationTests {
@Autowired
private AccountDao accountDao;
    @Test
    void contextLoads() {
        System.out.println(accountDao.selectByPrimaryKey(1));
    }

}
