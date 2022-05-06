package com.dajuancai.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dajuancai.dao.AccountDao;
import com.dajuancai.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AccountService extends  IService<Account> {
}
