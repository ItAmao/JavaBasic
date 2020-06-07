package com.amao.demo03_String两种创建方式的区别;

/**
 * String两种创建方式的区别
 */
public class TestStringDemo03 {
    public static void main(String[] args) {
        //1.通过new创建的
        String s1 = new String("java");
        //2.通过直接赋值
        String s2 = "java";
        System.out.println(s1);//java
        System.out.println(s2);//java

        System.out.println(s1 == s2);//false
    }
}
