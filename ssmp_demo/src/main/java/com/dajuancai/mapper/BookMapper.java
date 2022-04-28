package com.dajuancai.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dajuancai.domain.Book;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookMapper extends BaseMapper<Book> {
}
