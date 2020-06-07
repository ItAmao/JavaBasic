package com.amao.demo07_String分割和去空格方法;

public class Test {
    public static void main(String[] args) {
        //把当前字符串按照指定的分割符进行分割,返回字符串数组
        String a1 = "It-Amao-learn-Java";
        String[] a2 = a1.split("-");
        for (int i = 0; i < a2.length; i++) {
            System.out.print(a2[i] + ", ");
        }
        System.out.println("");
        //删除当前字符串两端两端两端的空格
        String b1 = " ItAmao learn java  ";
        String b2 = b1.trim();
        System.out.println(b2);

    }
}
