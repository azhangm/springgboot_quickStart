package com.dajuancai.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.*;
@Component // 交给 spring 进行管理
@ConfigurationProperties(prefix = "person")
// prefix 配置文件中 persion.xx 域 当前 person类的属性名一致
// xx person 的属性值 都有set方法
public class Person {
    private int id;
    private String name;
    private List hobby;
    public String[] family;
    private Map map;
    private Pet petl;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getHobby() {
        return hobby;
    }

    public void setHobby(List hobby) {
        this.hobby = hobby;
    }

    public String[] getFamily() {
        return family;
    }

    public void setFamily(String[] family) {
        this.family = family;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Pet getPet() {
        return petl;
    }

    public void setPet(Pet pet) {
        this.petl = pet;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hobby=" + hobby +
                ", family=" + Arrays.toString(family) +
                ", map=" + map +
                ", pet=" + petl +
                '}';
    }
}
