package com.amao.demo08_String练习;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //需求:键盘录入一个字符串,统计字符串大小写字母即数字字符个数
        int big = 0;
        int small = 0;
        int num = 0;
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                big++;
            } else if (c >= 'a' && c <= 'z') {
                small++;
            } else if (c >= '0' && c <= '9') {
                num++;
            }
        }
        System.out.println("大写字母个数:" + big);
        System.out.println("小写字母个数:" + small);
        System.out.println("数字字符个数:" + num);
    }
}
