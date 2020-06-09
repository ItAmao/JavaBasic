package com.amao.homework.demo3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws ParseException {
        //请编写程序，从控制台接收一个“生日”，格式：yyyy-MM-dd，程序要能够计算并打印他来到世界xx天。
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的生日(格式：yyyy-MM-dd):");
        String birthday = sc.nextLine();    //从控制台获取生日
        //getTime可以获取到 毫秒值
        long time = new SimpleDateFormat("yyyy-MM-dd").parse(birthday).getTime();
        System.out.println("您已经来到这个世界:" + ((System.currentTimeMillis() - time) / 1000 / 60 / 60 / 24) + "天");
    }
}
