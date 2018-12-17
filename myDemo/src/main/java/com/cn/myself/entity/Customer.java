package com.cn.myself.entity;

import java.io.Serializable;

/**
 * Created by xiaolin.zhang on 2017/3/1.
 * 顾客
 */
public class Customer implements Serializable{
    private int age;
    private String name;
    public Customer() {
    }

    public Customer(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        String str="12345";
    }
}
