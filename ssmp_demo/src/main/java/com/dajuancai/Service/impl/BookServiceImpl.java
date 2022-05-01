package com.dajuancai.Service.impl;

import com.dajuancai.Service.BookService;
import com.dajuancai.domain.Book;
import com.dajuancai.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {


    @Autowired
    private BookMapper bookMapper;

    @Override
    public Boolean save(Book book) {
        int insert = bookMapper.insert(book);
        return insert > 0;
    }

    @Override
    public Boolean update(Book book) {
        int update = bookMapper.update(book, null);
        return update > 0;
    }

    @Override
    public Boolean delete(Integer id) {
        int i = bookMapper.deleteById(id);
        return i > 0;
    }

    @Override
    public Book getById(Integer id) {
        return bookMapper.selectById(id);
    }
}
