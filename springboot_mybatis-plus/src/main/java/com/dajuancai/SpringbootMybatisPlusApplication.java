package com.dajuancai;

import com.dajuancai.dao.AccountDao;
import com.dajuancai.domain.Account;
import com.sun.security.jgss.GSSUtil;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dajuancai.dao")
public class SpringbootMybatisPlusApplication {
    public static void main(String[] args) {

        SpringApplication.run(SpringbootMybatisPlusApplication.class, args);

        }
    }

