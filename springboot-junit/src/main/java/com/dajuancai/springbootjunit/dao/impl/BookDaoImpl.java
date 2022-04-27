package com.dajuancai.springbootjunit.dao.impl;

import com.dajuancai.springbootjunit.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository  // 写在数据层上
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("bookDao is running...");
    }
}
