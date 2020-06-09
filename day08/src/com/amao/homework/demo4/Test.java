package com.amao.homework.demo4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws ParseException {
        //请编写程序，从控制台分别接收两个“生日”，格式：yyyy年MM月dd日，程序要能够计算并打印：第一个生日大于/小于第二个生日。
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个生日(格式：yyyy年MM月dd日):");
        String birthday1 = sc.nextLine();
        System.out.println("请输入第二个生日(格式：yyyy年MM月dd日):");
        String birthday2 = sc.nextLine();
        compareBirthday(birthday1, birthday2);
    }

    public static void compareBirthday(String birthday1, String birthday2) throws ParseException {
        long time1 = new SimpleDateFormat("yyyy年MM月dd日").parse(birthday1).getTime();
        long time2 = new SimpleDateFormat("yyyy年MM月dd日").parse(birthday2).getTime();
        if (time1 < time2) {
            System.out.println("第一个生日比第二个生日大");
        } else {
            System.out.println("第一个生日比第二个生日小");
        }
    }
}
