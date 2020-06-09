package com.amao.homework.demo6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws ParseException {
        //请编写程序，从控制台接收一个“日期”，格式：yyyy-MM-dd，程序将其转换为：xxxx年xx月xx日的格式输出到控制台。
        Scanner sc = new Scanner(System.in);
        System.out.println("从控制台接收一个“日期”，格式：yyyy-MM-dd:");
        String str = sc.nextLine();
        Date time = new SimpleDateFormat("yyyy-MM-dd").parse(str);
        String date = new SimpleDateFormat("yyyy年MM月dd日").format(time);
        System.out.println(date);
    }
}
