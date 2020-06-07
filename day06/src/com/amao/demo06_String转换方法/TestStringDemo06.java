package com.amao.demo06_String转换方法;

/**
 * String转换方法
 */
public class TestStringDemo06 {
    public static void main(String[] args) {
        //1.转成字符数组
        String s1 = "java";
        char[] chs = s1.toCharArray();
        System.out.println(chs[0]);
        System.out.println(chs[1]);
        System.out.println(chs[2]);
        System.out.println(chs[3]);
        //2.转成字节数组
        String s2 = "abcd";
        byte[] bs = s2.getBytes();
        System.out.println(bs[0]);
        System.out.println(bs[1]);
        System.out.println(bs[2]);
        System.out.println(bs[3]);
        //3.转成纯小写或者纯大写
        String s3 = "HelloWorld";
        s3 = s3.toLowerCase();
        System.out.println(s3);

        s3 = s3.toUpperCase();
        System.out.println(s3);
        //4.替换字符串(敏感词过滤)
        String s4 = "javahellojavaworldjava";
        s4 = s4.replace("java","????");
        System.out.println(s4);
    }
}
