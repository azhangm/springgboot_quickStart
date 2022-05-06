package com.example.springboot_ssmp.service.impl;

import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springboot_ssmp.domain.Book;
import com.example.springboot_ssmp.mapper.BookMapper;
import com.example.springboot_ssmp.service.BookService;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description : TODO
 * @author: zm
 * @date: 2022年05月06日8:55
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements BookService {
    @Resource
    private BookMapper bookMapper;
    public boolean modify(Book book){
        LambdaUpdateWrapper<Book> luw = new LambdaUpdateWrapper<>();
        luw.eq(Book::getId,book.getId());
        return  bookMapper.update(book,luw) > 0;
    }

    @Override
    public IPage<Book> selectPage(int currentPage, int pages) {
        IPage<Book> page = new Page<>(currentPage,pages);
      return bookMapper.selectPage(page,null);
    }
}
