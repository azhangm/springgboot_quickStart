package com.dajuancai.service;

import com.dajuancai.dao.AccountDao;
import com.dajuancai.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    @Autowired
private AccountDao accountDao;
    public void test(){
        List<Account> accounts = accountDao.selectList(null);
        System.out.println(accounts);
    }
}
