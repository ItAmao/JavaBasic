package com.amao.homework.demo8;

import java.util.Calendar;

public class Test {
    public static void main(String[] args) {
        //请编程，计算并打印“1949年10月1日”那天是星期几？
        judgeWeek(1949, 10, 1);
        judgeWeek(2020, 6, 9);
    }

    public static void judgeWeek(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        int months = month % 12 - 1;
        calendar.set(Calendar.MONTH, months);
        calendar.set(Calendar.DAY_OF_MONTH, day);
        int week = (calendar.get(Calendar.DAY_OF_WEEK) - 1);
        String[] weeks = {"星期天", "星期1", "星期2", "星期3", "星期4", "星期5", "星期六"};
        System.out.println(year + "年" + month + "月" + day + "日是:" + weeks[week]);
    }
}
