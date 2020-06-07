package com.amao.demo02_String类的特点;

/**
 * 演示String的特点
 */
public class TestStringDemo02 {
    public static void main(String[] args) {
        //1.String的不可变性
        String s1 = "hello";
        s1 += "world";
        System.out.println(s1);//helloworld
        //2.String常量的共享性
        String s2 = "abc";
        String s3 = "abc";
        System.out.println(s2 == s3);//比较地址值
    }
}
