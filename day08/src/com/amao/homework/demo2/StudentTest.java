package com.amao.homework.demo2;

public class StudentTest {
    public static void main(String[] args) {
        Student stu1 = new Student("阿毛", "男", 18);
        Student stu2 = new Student("阿毛", "男", 18);
        System.out.println(stu1.equals(stu2));//true:调用重写equals方法,比较的是值
        System.out.println(stu1 == stu2);//false
        stu1 = stu2;
        System.out.println(stu1==stu2);//true
    }
}
