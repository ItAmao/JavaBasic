package com.amao.homework.demo09;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入邮箱地址:");
        String eamil = scanner.nextLine();
        boolean bool = isLegitimate(eamil);
        if (bool == true) {
            System.out.println("合法");
        } else {
            System.out.println("不合法的Email地址");
        }
    }

    public static boolean isLegitimate(String eamil) {
        int index1 = eamil.indexOf("@");
        int index2 = eamil.indexOf(".");
        if (index1 != -1 && index2 != -1) {
            return true;
        }
        return false;
    }
}
