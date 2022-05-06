package com.example.springboot_ssmp.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @Description : TODO
 * @author: zm
 * @date: 2022年05月06日8:14
 */
@Data
public class Book {
    /*
    * 复习知识点
    * @TableId(opens new window)
    描述：主键注解
    使用位置：实体类主键字段
    * */
    @TableId
    private int id ;
    private String type;
    private String name;
    private String description;
}
