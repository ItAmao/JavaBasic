package com.amao.demo07_String分割和去空格方法;

/**
 * String分割和去空格方法
 */
public class TestStringDemo07 {
    public static void main(String[] args) {
        //1.分割方法
        String s1 = "1234-5678-9012-3456";
        String[] strs = s1.split("-");
        System.out.println(strs.length);
        System.out.println(strs[0]);
        System.out.println(strs[1]);
        System.out.println(strs[2]);
        System.out.println(strs[3]);
        //2.去空格
        String s2 = "  java  hello  world  ";
        System.out.println("-->"+s2+"<---");
        s2 = s2.trim();
        System.out.println("-->"+s2+"<---");
    }
}
