package com.amao.homework.demo03;

import java.util.Random;
import java.util.Scanner;

public class RandomVerificationCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = add().length();
        String code = add();
        String verificationCode = random(code, length);
        System.out.println("生成的验证码为:" + verificationCode);
        boolean flag = true;
        while (flag) {
            System.out.println("请输入验证码:");
            String match = scanner.nextLine();
            boolean res = match(verificationCode, match);
            if (res == false) {
                System.out.println("输入错误,请重新输入...");
                continue;
            } else {
                System.out.println("输入正确");
                flag = false;
            }
        }
    }

    //判断验证码
    public static boolean match(String verificationCode, String match) {
        if (verificationCode.equals(match)) {
            return true;
        }
        return false;
    }

    //把所有的情况添加进去
    public static String add() {
        StringBuilder res = new StringBuilder();
        //添加小写
        for (char i = 'a'; i <= 'z'; i++) {
            res.append(i);
        }
        //添加大写
        for (char j = 'A'; j <= 'Z'; j++) {
            res.append(j);
        }
        //添加0-9
        for (int k = 0; k <= 9; k++) {
            res.append(k);
        }
        return res.toString();//返回字符串
    }

    //随机获取
    public static String random(String code, int length) {
        Random random = new Random();
        String randomString = "";//初始化
        for (int i = 0; i < 4; i++) {
            int index = random.nextInt(length);
            randomString += code.charAt(index);
        }
        return randomString;
    }
}
