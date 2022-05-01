package com.dajuancai.domain;

import lombok.Data;

import java.util.Scanner;

@Data
public class Account {

    private int id;
    private Integer money;

    public Account(int id,Scanner sc) {
        this.id = id;
        switch (id) {
            case 0:
                money = sc.nextInt();
                System.out.println(money);
                break;
            default:
                System.out.println("fun");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Account(sc.nextInt(),sc);
    }
}
