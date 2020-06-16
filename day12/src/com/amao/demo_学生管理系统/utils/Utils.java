package com.amao.demo_学生管理系统.utils;

import com.amao.demo_学生管理系统.superclass.Person;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Utils {
    public static int stuId;
    public static int teaId;

    static {
        stuId = 0;
        teaId = 0;
    }

    public static int birthdayToAge(String birthday) {
        //根据出生日期计算年龄
        SimpleDateFormat sdf = new SimpleDateFormat(birthday);
        int age = 23;
        return age;
    }

    /**
     * 打印Person的方法
     *
     * @param person
     */
    public static void printPerson(Person person) {
        System.out.println("*******************************************************");
        System.out.println("编号\t\t姓名\t\t性别\t\t生日\t\t\t年龄\t\t描述");
        System.out.println(person);
        System.out.println("*******************************************************");
    }

    /**
     * 打印集合 泛型上限
     *
     * @param arr
     */
    public static void printArratList(ArrayList<? extends Person> arr) {
        System.out.println("*******************************************************");
        System.out.println("编号\t\t姓名\t\t性别\t\t生日\t\t\t年龄\t\t描述");
        for (Person person : arr) {
            System.out.println(person);
        }
        System.out.println("*******************************************************");
    }
}
