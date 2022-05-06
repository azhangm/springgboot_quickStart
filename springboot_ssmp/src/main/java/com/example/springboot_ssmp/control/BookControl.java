package com.example.springboot_ssmp.control;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.springboot_ssmp.control.util.Result;
import com.example.springboot_ssmp.domain.Book;
import com.example.springboot_ssmp.service.BookService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.List;

/**
 * @Description : 表现层开发  / books 标准开发的命名规范
 * @author: zm
 * @date: 2022年05月06日9:46
 */
@RestController
@RequestMapping("/books")
public class BookControl {
   @Resource
   private BookService bookService;
    @GetMapping
    public List<Book> selectAll(){
        return bookService.list();
    }
    @GetMapping("{id}")
    public Book selectBy(@PathVariable Integer id ){
        return bookService.getById(id);
    }
    @PostMapping
    public boolean save(@RequestBody Book book){
       return bookService.save(book);
    }
    @PutMapping
    public boolean modify(@RequestBody Book book){
        return bookService.modify(book);
    }
    @GetMapping("{currentPage}/{pages}" )
    public IPage<Book> selectByPage(@PathVariable int currentPage,@PathVariable int pages){
        return bookService.selectPage(currentPage, pages);
    }
}
