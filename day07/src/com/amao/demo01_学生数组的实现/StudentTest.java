package com.amao.demo01_学生数组的实现;

import com.amao.demo05_ArrayList存储学生对象并遍历.Student;

public class StudentTest {
    public static void main(String[] args) {
        //定义一个学生数组
        Student[] students = new Student[3];//3个元素,默认值为null

        //保存3个学生对象

        students[0] = new Student("阿毛", 18);//匿名对象
        students[1] = new Student("一毛", 19);
        students[2] = new Student("二毛", 20);

        //遍历数组 并打印 值
        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i].getName() + ": ");
            System.out.print(students[i].getAge() + ",  ");
        }
    }
}
