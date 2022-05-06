package com.dajuancai.Service.impl;

import com.dajuancai.domain.Book;
import com.dajuancai.mapper.BookMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BookServiceImplTest {

    @Autowired
    private BookServiceImpl bookService;

    @Test
    public void save() {
        Book book1 = new Book(null, "大卷菜学Java", "成为大佬的某一天", "测试springboot 的入门");
        Boolean save = bookService.save(book1);
        System.out.println(save ? "添加成功" : "添加失败");
    }

    @Test
    public void update() {
        Book book = new Book();
        book.setId(6);
        book.setType("我爱大卷菜");
        book.setDescription("想成为大佬的第一天");
        book.setName("大卷菜");
        bookService.update(book);
    }

    @Test
    public Boolean delete(Integer id) {
        return null;
    }

    @Test
    public Book getById(Integer id) {
        return null;
    }
}