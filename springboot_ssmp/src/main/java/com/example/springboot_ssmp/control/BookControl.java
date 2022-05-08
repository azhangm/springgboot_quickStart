package com.example.springboot_ssmp.control;

import com.example.springboot_ssmp.control.util.Result;
import com.example.springboot_ssmp.domain.Book;
import com.example.springboot_ssmp.service.BookService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Description : 表现层开发  / books 标准开发的命名规范
 * @author: zm
 * @date: 2022年05月06日9:46
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/books")
public class BookControl {
   @Resource
   private BookService bookService;
    @GetMapping
    public Result selectAll(){
        return new Result(true,bookService.list());
    }
    @GetMapping("{id}")
    public Result selectBy(@PathVariable Integer id ){
        return new Result(true,bookService.getById(id));
    }
    @PostMapping
    public Result save(@RequestBody Book book){
       return new Result(bookService.save(book));
    }
    @PutMapping
    public Result modify(@RequestBody Book book){
        return new Result(bookService.modify(book));
    }
    @GetMapping("{currentPage}/{pages}" )
    public Result selectByPage(@PathVariable int currentPage,@PathVariable int pages){
        return new Result(true,bookService.selectPage(currentPage,pages));
    }
}
