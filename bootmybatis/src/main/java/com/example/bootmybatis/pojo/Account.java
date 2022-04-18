package com.example.bootmybatis.pojo;

public class Account {
    private double money;
    private String name;
    private int id;

    public Account() {

    }

    public Account(double money, String name, int id) {
        this.money = money;
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Account{" +
                "money=" + money +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
