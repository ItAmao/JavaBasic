package com.amao.homework.demo02;

import java.util.Random;

public class RandomVerificationCode {
    public static void main(String[] args) {
        int length = add().length();
        String code = add();
        System.out.println(random(code, length));
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
