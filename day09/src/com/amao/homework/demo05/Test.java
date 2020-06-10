package com.amao.homework.demo05;

import java.util.Scanner;

/**
 * @description:
 * @params:
 * @return:
 * @author: ItAmao
 * @time: 2020/6/10 17:42
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student stu = new Student();
        System.out.println("请输入学生姓名:");
        String name = sc.next();
        stu.setName(name);
        System.out.println("请输入学生年龄:");
        int age = sc.nextInt();
        stu.setAge(age);
        System.out.println("请输入学生身高:");
        double height = sc.nextDouble();
        stu.setHeight(height);
        System.out.println("请输入是否结婚:");
        boolean isMarry = sc.nextBoolean();
        stu.setMarry(isMarry);
        System.out.println("请输入性别:");
        String str = sc.next();
        char gender = str.charAt(0);
        stu.setGender(gender);
        System.out.println(stu);
    }
}
