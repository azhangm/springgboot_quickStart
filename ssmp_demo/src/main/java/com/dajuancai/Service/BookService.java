package com.dajuancai.Service;

import com.dajuancai.domain.Book;

public interface BookService {
    Boolean save(Book book);
    Boolean update(Book book);
    Boolean delete(Integer id);
    Book getById(Integer id);

}
