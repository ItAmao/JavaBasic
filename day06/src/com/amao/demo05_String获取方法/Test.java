package com.amao.demo05_String获取方法;

public class Test {
    public static void main(String[] args) {
        //获取字符串中字符的个数
        String a1 = "ItAmao";
        System.out.println(a1.length());//6个元素

        //连接当前字符串和指定字符串,返回连接后的新字符串对象
        String b1 = "ItAmao";
        String b2 = b1.concat("Java");
        System.out.println(b2);//ItAmaoJava

        //获取字符串中指定索引位置的那个字符
        String c1 = "ItAmao";
        char c2 = c1.charAt(3);
        System.out.println(c2);//索引值,从0开始 所以是m

        //从当前字符串中查找指定字符串第一次出现的索引,如果找不到,返回-1
        String d1 = "JavaItAmao";
        int d2 = d1.indexOf("It");
        int d3 = d1.indexOf("B");
        System.out.println(d2);//4
        System.out.println(d3);//-1

        //从当前字符串中查找指定字符串最后一次出现的索引,如果找不到,返回-1
        String e1 = "ItAmaoJavaIt";
        int e2 = e1.lastIndexOf("It");
        int e3 = e1.lastIndexOf("B");
        System.out.println(e2);//10
        System.out.println(e3);//-1

        //从当前字符串的指定索引位置开始截取直到结束,返回截取出来的字符串对象
        String f1 = "ItAmaoLearnJava";
        String f2 = f1.substring(2);
        System.out.println(f2);//AmaoLearnJava

        //从当前字符串的指定索引位置开始截取到指定索引位置结束截取字符串,返回截取出来的字符串对象(含头不含尾)
        String g1 = "ItAmaoLearnJava";
        String g2 = g1.substring(2,15);//含头A
        System.out.println(g2);//AmaoLearnJava


    }
}
