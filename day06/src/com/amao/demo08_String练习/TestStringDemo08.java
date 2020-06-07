package com.amao.demo08_String练习;

import java.util.Scanner;

public class TestStringDemo08 {
    public static void main(String[] args) {
        //需求:键盘录入一个字符串，统计字符串中大小写字母及数字字符个数
        //分析:
        //a.录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str = sc.next();
        //b.遍历字符串,取出每个字符
        int big = 0;
        int small = 0;
        int number = 0;
        int other =0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            //c.判断ch是大写,还是小写,还是数字
            if (ch >= 'A' && ch <= 'Z') {
                big++;
            } else if (ch >= 'a' && ch <= 'z') {
                small++;
            } else if (ch >= '0' && ch <= '9') {
                number++;
            }else{
                other++;
            }
        }
        //c.打印结果
        System.out.println(big);
        System.out.println(small);
        System.out.println(number);
        System.out.println(other);
    }
}
