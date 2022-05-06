package com.example.springboot_ssmp.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.springboot_ssmp.domain.Book;

import java.util.List;

public interface BookService extends IService<Book> {
    boolean modify(Book book);
    /**
    * @param1 : 当前页面
     * @param2: 页面显示个数
    * */
     IPage<Book> selectPage(int currentPage, int pages);
}
