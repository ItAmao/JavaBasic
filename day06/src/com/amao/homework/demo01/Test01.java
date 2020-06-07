package com.amao.homework.demo01;

import java.util.Scanner;

/*
    测试类
 */
public class Test01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Worker worker = new Worker();
        System.out.println("请录入工人姓名:");
        String name=scanner.nextLine();
        worker.setName(name);
        System.out.println("请录入工人工龄:");
        int year=scanner.nextInt();
        worker.setYear(year);
        System.out.println("该工人对象的属性信息如下:");
        System.out.println("姓名:"+worker.getName());
        System.out.println("工龄:"+worker.getYear());

    }
}
