package com.amao.demo_学生管理系统1.dao;

import com.amao.demo_学生管理系统1.model.Person;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 * 工具类Utils类
 * 自定义的专门给我们自己项目使用的工具类
 * 1,静态变量:
 * 学员的id值 (添加学员信息时,编号由此ID加1生成)
 * 老师的id值 (添加学员信息时,编号由此ID加1生成)
 * 2.静态方法:
 * 根据用户的出生日期计算年龄
 * 打印一个Person对象的方法
 * 打印一个ArrayList集合的方法
 */
public class Utils {
    public static int stuId;
    public static int teaId;

    static {
        stuId = 1;
        teaId = 1;
    }

    /**
     * 根据用户传来的出生日期,返回年龄
     *
     * @param birthday
     * @return age
     */
    public static int birthdayToAge(String birthday) {
        //1.先把字符串birthday格式改成 yyyy-MM-dd格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //初始化
        Date birthDate = null;
        try {
            birthDate = sdf.parse(birthday);
        } catch (ParseException e) {
            e.printStackTrace();
            return -1;
        }
        //2.获取当前系统的时间
        Calendar cal = Calendar.getInstance();
        cal.setTime(birthDate);
        //判断传入的出生日期合法性
        //出生日期晚于当前时间，无法计算
        if (cal.before(birthDate)) {
            return -1;
        }
        //获取属性
        //获取当前的年份
        int nowYear = cal.get(Calendar.YEAR);
        //获取当前的月份:Calendar的月份值是0-11
        int nowMonth = cal.get(Calendar.MONTH) + 1;
        //获取当前的天数
        int dayOfMonthNow = cal.get(Calendar.DAY_OF_MONTH);
        //将日期设置为出生日期
        cal.setTime(birthDate);
        //获取出生日期的年份
        int birYear = cal.get(Calendar.YEAR);
        //获取出生日期的月份
        int birMonth = cal.get(Calendar.MONTH);
        //获取出生日期的天数
        int birDayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
        //当前年份与出生年份相减，初步计算年龄
        int age = nowYear - birYear;
        //当前月份与出生日期的月份相比，如果月份小于出生月份，则年龄减1，表示不满多少周岁
        if (nowMonth <= birMonth) {
            //如果月份相等
            if (nowMonth == birMonth) {
                //在比较日期，如果当前日，小于出生日，也减1，表示不满多少周岁
                if (dayOfMonthNow < birDayOfMonth) {
                    age--;
                }
                //如果月份不等的话,说明当前月份小于出生月份 age需要--
            } else {
                age--;
            }
        }
        return age;
    }

    /**
     * 打印Person对象
     * 作用:获取一条信息
     */
    public static void printPerson(Person person) {
        System.out.println("*******************************************************");
        System.out.println("编号\t\t姓名\t\t性别\t\t生日\t\t\t年龄\t\t描述");
        System.out.println(person);
        System.out.println("*******************************************************");
    }

    /**
     * 打印ArrayList的方法
     */
    public static void printPersonArrayList(ArrayList personList) {
        System.out.println("*******************************************************");
        System.out.println("编号\t\t姓名\t\t性别\t\t生日\t\t\t年龄\t\t描述");
        for (int i = 0; i < personList.size(); i++) {
            Object p = personList.get(i);
            System.out.println(personList.get(i));
        }
        System.out.println("*******************************************************");
    }
}
