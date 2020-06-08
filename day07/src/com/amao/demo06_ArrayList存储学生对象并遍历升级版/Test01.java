package com.amao.demo06_ArrayList存储学生对象并遍历升级版;

import java.util.ArrayList;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        ArrayList<Student> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入姓名:");
            String name = sc.next();//next和nextline区别 前边获取空格之前的,后边获取一行
            System.out.println("请输入年龄:");
            int age = sc.nextInt();
            Student stu = new Student(name, age);
            arr.add(stu);
        }
        for (Student stu : arr) {
            System.out.println(stu.getName() + ":" + stu.getAge());
        }
    }
}
