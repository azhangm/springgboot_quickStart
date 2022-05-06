package com.dajuancai.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dajuancai.SpringbootMybatisPlusApplication;
import com.dajuancai.domain.Account;
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
    @Test
    void testInsert() {
        Account account = new Account();
        accountDao.insert(account);
    }
    @Test
     void testPage(){
        IPage<Account> page = new Page<>(2,5);
        accountDao.selectPage(page,null);
        // selecti count(*)
        System.out.println(page.getTotal());
        // 当前第几页
        System.out.println("当前是第几页" + page.getCurrent());
        System.out.println(page.getSize());
        System.out.println("一共多少页：" + page.getPages());
        // 显示封装的记录。
        System.out.println(page.getRecords());
    }

    @Test
    /*按条件查询*/
    void testByCondition() {
        Integer id = null;
        LambdaQueryWrapper<Account> lqw = new LambdaQueryWrapper<>();
        /*指定列查询*/
//        lqw.select(Account::getMoney);
        lqw.like(id != null,Account::getId,1);
        String sqlSelect = lqw.getSqlSelect();
        System.out.println(sqlSelect);
        accountDao.selectList(lqw).forEach(System.out::println);
    }
}