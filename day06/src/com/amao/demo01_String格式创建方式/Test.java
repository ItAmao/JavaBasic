package com.amao.demo01_String格式创建方式;

/*
    演示String各种创建方式
 */
public class Test {
    public static void main(String[] args) {
        //1.无参构造
        String s1 = new String();
        System.out.println(s1);
        //2.有参构造
        String s2 = new String("hello");
        System.out.println(s2);

        char[] chs = {'j', 'a', 'v', 'a'};
        String s3 = new String(chs);
        System.out.println(s3);

        byte[] bs = {97, 98, 97, 98};
        String s4 = new String(bs);
        System.out.println(s4);

        String s5 = new String(bs, 1, 2);
        System.out.println(s5);

        //3.直接赋值,也是一个字符串对象
        String s6 = "world";
        System.out.println(s6);
    }
}
