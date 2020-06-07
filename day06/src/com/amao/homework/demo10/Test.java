package com.amao.homework.demo10;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入java文件名字:");
        String name = scanner.nextLine();

        boolean isEnd = name.endsWith(".java");
        if (isEnd == true) {
            System.out.println("是.java结尾");
        } else {
            System.out.println("不是.java结尾");
        }
        int index = name.indexOf(".");
        System.out.println(".符号的索引位置" + index);
    }
}
