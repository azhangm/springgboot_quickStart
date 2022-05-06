package com.example.springboot_ssmp.mapper;

import com.example.springboot_ssmp.domain.Book;
import com.example.springboot_ssmp.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;

@SpringBootTest
class BookMapperTest {
    @Resource
    private BookService bookService;
    @Test
    void test(){
        List<Book> list = bookService.list();
        list.forEach(System.out::println);
    }
}