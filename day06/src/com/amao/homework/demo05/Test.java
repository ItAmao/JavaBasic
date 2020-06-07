package com.amao.homework.demo05;

public class Test {
    public static void main(String[] args) {
        String str = "上海自来水来自海上";
        String str1 = reverse(str);
        //System.out.println(str1);
        boolean bool = match(str, str1);
        if (bool == true) {
            System.out.println("相等");
        } else {
            System.out.println("不相等");
        }
    }

    //反转
    public static String reverse(String str) {
        StringBuilder res = new StringBuilder(str);
        res.reverse();
        return res.toString();
    }

    public static boolean match(String str, String str1) {
        if (str.equals(str1)) {
            return true;
        }
        return false;
    }

}
