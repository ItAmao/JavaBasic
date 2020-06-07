package com.amao.demo04_String判断方法;

/*
    String 判断方法源码
 */
public class Test {
    public static void main(String[] args) {
        //比较内容
        String as1 = "ItAmao";
        String as2 = "ItAmao";
        boolean as3 = as1.equals(as2);
        System.out.println(as3);//true
        //比较忽视大小写
        String bs1 = "itamao";
        String bs2 = "ItAmao";
        boolean bs3 = bs1.equalsIgnoreCase(bs2);
        System.out.println(bs3); //true
        //判断当前字符串是否包含指定内容
        String cs1 = "ItAmao";
        boolean cs2 = cs1.contains("Amao");//true 必须区分大小写
        System.out.println(cs2);
        //判断当前字符串是否以指定字符串开头
        String ds1 = "ItAmao";
        boolean ds2 = ds1.startsWith("i");//必须区分大小写
        System.out.println(ds2);
        //判断当前字符串是否以指定字符串结尾
        String es1="ItAmao";
        boolean es2=es1.endsWith("O"); //必须区分大小写
        System.out.println(es2);

    }
}
