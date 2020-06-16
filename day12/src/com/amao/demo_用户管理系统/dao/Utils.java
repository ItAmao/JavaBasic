package com.amao.demo_用户管理系统.dao;

import com.amao.demo_用户管理系统.model.User;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Utils {
    public static int userId;

    static {
        userId = 1;
    }

    public static int birthdayToAge(String birthday) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //需要定义外边,方便调用
        Date birthDate = null;
        try {
            birthDate = sdf.parse(birthday);
        } catch (ParseException e) {
            e.printStackTrace();
            return -1;
        }
        //获取当前日期
        Calendar cal = Calendar.getInstance();

        //获取当前系统时间的Calendar，并将其设置为"生日"的Calendar
        Calendar birthCal = Calendar.getInstance();
        birthCal.setTime(birthDate);
        //如果用户的出生日期大于当前日期返回-1
        if (cal.before(birthDate)) {
            return -1;
        }
        //获取当前年份
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
        //将日期设置为出生日期
        cal.setTime(birthDate);
        int birYear = cal.get(Calendar.YEAR);
        int birMonth = cal.get(Calendar.MONTH);
        int birDayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
        //先用当前年减去出生年 获取年龄
        int age = year - birYear;
        //然后判断月份和天数
        if (birMonth <= month) {
            if (birMonth == month) {
                if (birDayOfMonth < dayOfMonth) {
                    age--;
                }
            } else {
                age--;
            }
        }
        return age;
    }

    /**
     * 打印一条用户信息
     */
    public static void printUser(User user) {
        System.out.println("*******************************************************");
        System.out.println(user);
        System.out.println("*******************************************************");
    }

    /**
     * 打印全部信息
     */
    public static void printAllUser(ArrayList<User> list) {
        if (list.isEmpty()) {
            System.out.println("没有学生信息");
            return;
        }
        for (User user : list) {
            System.out.println(user);
        }
    }

    /**
     * 根据Id查询学生
     */
    public static void printUser(ArrayList<User> list, Scanner sc) {
        System.out.println("请输入你要查询的学生id");
        int selId = sc.nextInt();
        int a = 0;
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            if (user.getId() == selId) {
                a++;
                System.out.println("查询结果如下:");
                printUser(user);
            }
        }
        if (a == 0) {
            System.out.println("查无此人");
            return;
        }
    }
}
