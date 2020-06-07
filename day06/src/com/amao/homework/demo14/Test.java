package com.amao.homework.demo14;

import java.util.Scanner;

/*
    测试
 */
public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生信息:");
        String information = scanner.nextLine();
        String[] str = information.split(",");
//        for (int i = 0; i < str.length; i++) {
//            System.out.println(str[i]);
//        }
        String name = str[0];
        int age = Integer.parseInt(str[1]);
        String gender = str[2];
        Student student = new Student(name, age, gender);
        System.out.print(student.getName() + "," + student.getAge() + "," + student.getGender());
    }
}
