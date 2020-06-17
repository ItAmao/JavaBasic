package com.amao.homework.demo03;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数:");
        int firNum = sc.nextInt();
        System.out.println("请输入第二个整数:");
        int secNum = sc.nextInt();
        div(firNum, secNum);
    }

    public static void div(int num1, int num2) {
        try {
            double div = num1 / num2;
            System.out.println("结果为:" + div);
        } catch (Exception e) {
            if (num2 == 0) {
                System.out.println("被除数不能为0");
            }
        }
    }
}
