package com.dajuancai;

import com.dajuancai.dao.AccountDao;
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
        List list = accountDao.selectList(null);

    }
    @Test
    void contextLoads() {
    }

}
