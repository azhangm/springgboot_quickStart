package com.example.springboot_ssmp.control.util;

/**
 * @Description : TODO
 * @author: zm
 * @date: 2022年05月06日17:04
 */

import lombok.Data;

@Data
public class Result {
    private boolean flag;
    private Object data;

    public Result() {
    }

    public Result(boolean flag) {
        this.flag = flag;
    }

    public Result(boolean flag, Object data) {
        this.flag = flag;
        this.data = data;
    }
}
