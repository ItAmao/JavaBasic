package com.amao.demo08_装饰设计模式;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/6/30 19:06
 */
public class Student implements Person {

    @Override
    public void sleep() {
        System.out.println("美滋滋的睡觉");
    }

    @Override
    public void eat() {
        System.out.println("美滋滋的吃晚饭");
    }
}
