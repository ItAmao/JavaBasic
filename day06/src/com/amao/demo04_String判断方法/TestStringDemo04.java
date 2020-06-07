package com.amao.demo04_String判断方法;

/**
 * String判断方法
 */
public class TestStringDemo04 {
    public static void main(String[] args) {
        //1.比较内容
        String s1 = "HelloWorld";
        String s2 = "helloworld";
        boolean b1 = s1.equals(s2);
        System.out.println(b1);
        //2.比较内容忽略大小写
        boolean b2 = s1.equalsIgnoreCase(s2);
        System.out.println(b2);
        //3.判断包含
        String s3 = "helloJavaworld";
        boolean b3 = s3.contains("java");
        System.out.println(b3);
        //4.判断开头,判断结尾
        String s4 = "javahelloworld";
        boolean b4 = s4.startsWith("ja");
        System.out.println(b4);
        boolean b5 = s4.endsWith("ld");
        System.out.println(b5);
    }
}
