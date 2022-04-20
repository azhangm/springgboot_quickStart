package com.dajuancai.domain;

import java.io.Serializable;

/**
 * account
 * @author 
 */
public class Account implements Serializable {
    private Integer id;

    private String name;

    private Double money;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}