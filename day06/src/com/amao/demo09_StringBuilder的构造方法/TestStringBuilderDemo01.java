package com.amao.demo09_StringBuilder的构造方法;

/**
 * StringBuilder的构造方法
 */
public class TestStringBuilderDemo01 {
    public static void main(String[] args) {
        //1.无参构造
        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1);
        //2.有参构造
        StringBuilder sb2 = new StringBuilder("ILOVEJAVA");
        System.out.println(sb2);
    }
}
