package com.amao.demo02_反射;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/7/5 10:48
 */
public class Worker extends Person{
    @Override
    public void work() {
        System.out.println("陈东宇搬砖");
    }

    @Override
    public void eat() {
        System.out.println("陈东宇不吃饭");
    }
}
