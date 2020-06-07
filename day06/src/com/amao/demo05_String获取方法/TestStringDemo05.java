package com.amao.demo05_String获取方法;

/**
 * String获取方法
 */
public class TestStringDemo05 {
    public static void main(String[] args) {
        //1.获取长度
        String s1 = "hello中world";
        System.out.println(s1.length());

        //2.连接字符串
        String s2 = "hello";
        s2 = s2.concat("world");
        System.out.println(s2);

        //3.取出某个字符串
        String s3 = "java";
        char c = s3.charAt(2);
        System.out.println(c);

        //4.查找
        String s4 = "javahellojavaworldjava";
        int index1 = s4.indexOf("java");
        System.out.println(index1);

        int index2 = s4.lastIndexOf("java");
        System.out.println(index2);

        //5.截取
        String s5 = "hellojavaworld";
        s5 = s5.substring(5);
        System.out.println(s5);

        String s6 = "hellojavaworld";
        s6 = s6.substring(5,9);//含头不含尾
        System.out.println(s6);
    }
}
