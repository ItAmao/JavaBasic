package com.amao.homework.demo04;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String[] arr = {"星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期日" };
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入1-7的数字:");
        int num = sc.nextInt();
        weeks(arr, num);

    }

    public static void weeks(String[] week, int num) {
        try {
            String weeks = week[num - 1];
            System.out.println(weeks);
        } catch (Exception e) {
            if (num <= 0 || num > 7) {
                System.out.println("输入错误,请输入1-7的整数");
            }
        }
    }
}
