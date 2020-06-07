package com.amao.demo10_StringBuilder添加操作;

/**
 * StringBuilder的append和reverse
 */
public class TestStringBuilderDemo02 {
    public static void main(String[] args) {
        //1.创建一个StringBuilder
        StringBuilder sb1 = new StringBuilder();
        //2.添加数据
        sb1.append(100);
        sb1.append(3.14);
        sb1.append("java");
        sb1.append('A');
        sb1.append(true);
        System.out.println(sb1);
        //3.支持链式编程
        sb1.append(100).append(3.14).append("java").append('A').append(true);
        System.out.println(sb1);
        //4.反转内容
        sb1.reverse();
        System.out.println(sb1);
    }
}
