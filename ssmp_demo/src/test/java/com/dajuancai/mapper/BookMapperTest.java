package com.dajuancai.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dajuancai.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BookMapperTest {
    @Autowired
    private BookMapper mapper;

    @Test
    void test() {
        for (Book book : mapper.selectList(null)) {
            System.out.println(book);
        }
    }

    @Test
    void testPage() {
        IPage page = new Page(1, 2);
        mapper.selectPage(page, null);
    }

    @Test
    void testBy() {
        /*
         *
         * 动态拼接条件查询
         *
         * */
        String name = "1";
        LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<>();
        lqw.like(null != name, Book::getName, name);
        for (Book book : mapper.selectList(lqw)) {
            System.out.println(book);
        }
    }
}