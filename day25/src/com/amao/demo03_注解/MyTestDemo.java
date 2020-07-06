package com.amao.demo03_注解;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/7/5 20:46
 */
public class MyTestDemo {
    @MyTest
    public void test01() {
        System.out.println("111111111");
    }

    @MyTest
    public void test02() {
        System.out.println("222222222");
    }

    public void test03() {
        System.out.println("333333333");
    }

    @MyTest
    public void test04() {
        System.out.println("444444444");
    }
}
