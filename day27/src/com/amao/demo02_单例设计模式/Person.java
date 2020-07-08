package com.amao.demo02_单例设计模式;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/7/7 09:05
 */

public class Person {
    private Person() {
    }

    //创建一个对象
    //更安全
    private  static Person p = new Person();

    //定义一个公共的方法
    public static Person getInstance() {
        return p;
    }
}
