package com.example.springboot_ssmp;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.springboot_ssmp.domain.Book;
import com.example.springboot_ssmp.mapper.BookMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class SpringbootSsmpApplicationTests {
    @Resource
    private BookMapper mapper;
    @Test
    void contextLoads() {
        mapper.selectList(null).forEach(System.out::println);
    }
    @Test
    void testPage(){
        /*配置分页拦截器*/
        IPage<Book> page = new Page<Book>(2,5);
        mapper.selectPage(page,null);
    }

}
