package com.amao.homework.demo01;

/*
    工人类
 */
public class Worker {
    private String name;//姓名
    private int year;//工龄

    //无参构造器
    public Worker() {
    }

    //有参构造器
    public Worker(String name, int year) {
        this.name = name;
        this.year = year;
    }

    //set/get方法
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }
}
