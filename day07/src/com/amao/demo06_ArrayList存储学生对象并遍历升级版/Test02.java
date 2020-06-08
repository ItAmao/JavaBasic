package com.amao.demo06_ArrayList存储学生对象并遍历升级版;

import java.util.ArrayList;
import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        //需求:创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合。
        //学生的姓名和年龄来自于键盘录入
        //1.创建一个存储学生对象的集合
        ArrayList<Student> students = new ArrayList<Student>();
        //2.存储3个学生对象,学生的姓名和年龄来自于键盘录入
        addStudent(students);
        //3.在控制台遍历该集合。
        printStudents(students);
    }

    //打印集合
    public static void printStudents(ArrayList<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.println(s.getName() + "..." + s.getAge());
        }
    }

    //添加学生
    public static void addStudent(ArrayList<Student> students) {
        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入姓名:");
            String name = sc.next();//next() nextLine();
            System.out.println("请输入年龄:");
            int age = sc.nextInt();
            //创建对象
            Student s = new Student(name, age);
            //添加到集合中
            students.add(s);
        }
    }
}
