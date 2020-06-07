package com.amao.homework.demo13;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入java文件");
        String txt = scanner.nextLine();
        char c = txt.charAt(0);
        System.out.println("文件第一个字母:" + c);
        int index = txt.indexOf(".");
        //System.out.println(index);
        String Intercept = txt.substring(index);
        System.out.println("文件的后缀名:" + Intercept);

        String replace = txt.replace(txt, "Test.java");
        System.out.println(replace);

    }
}
