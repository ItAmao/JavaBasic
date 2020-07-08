package com.amao.demo02_单例设计模式;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/7/7 09:17
 */
public class Student {

    public Student() {
    }


    //定义一个内部的对象
    private static Student s;


    //提供一个公共的方法
    public static Student getInstance() {
        //如果是第一次获取对象,就创建这个对象
        if (s == null) {
            s = new Student();
        }
        return s;
    }
}
