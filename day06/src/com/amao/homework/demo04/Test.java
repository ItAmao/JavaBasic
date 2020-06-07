package com.amao.homework.demo04;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串:");
        String str = scanner.nextLine();
        int countNum = 0;
        int countWord = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);//分割字符
            if (c >= '0' && c <= '9') {
                countNum++;
            } else if (c >= 'a' && c <= 'z') {
                countWord++;
            } else if (c >= 'A' && c <= 'Z') {
                countWord++;
            }
        }
        System.out.println("字母:" + countWord);
        System.out.println("数字:" + countNum);
    }
}
