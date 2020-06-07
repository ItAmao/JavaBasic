package com.amao.homework.demo06;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的身份证号码:");
        String idCard = scanner.nextLine();
        boolean isLegitimate = isLegitimate(idCard);
        System.out.println(isLegitimate);
    }

    public static boolean isLegitimate(String idCard) {
        if (idCard.length() > 18 && idCard.length() <= 0) {
            return false;
        }
        if (idCard.startsWith("0")) {
            return false;
        }
        for (int i = 0; i < idCard.length(); i++) {
            char ch = idCard.charAt(i);
            if (i == idCard.length() - 1) {
                if (ch < '0' || ch > '9' && ch != 'X') {
                    return false;
                }
            } else {
                if (ch < '0' || ch > '9') {
                    return false;
                }
            }
        }
        return true;
    }
}
