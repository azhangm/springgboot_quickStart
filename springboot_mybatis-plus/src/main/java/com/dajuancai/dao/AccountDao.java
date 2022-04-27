package com.dajuancai.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dajuancai.domain.Account;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountDao extends BaseMapper<Account> {
}
