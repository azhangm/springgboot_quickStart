package com.example.bootmybatis.mapper;

import com.example.bootmybatis.pojo.Account;
import org.apache.ibatis.annotations.Select;

public interface AccountMapper {
    Account findAll();
}
