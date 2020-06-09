package com.amao.demo06_Calendar类;

import java.util.Calendar;


public class CalendarDemo03 {
    public static void main(String[] args) {
        //1.创建一个Calendar的子类对象
        Calendar cc = Calendar.getInstance();
        System.out.println(cc);
        //2.修改字段的值
        cc.set(Calendar.YEAR, 2000);
        cc.set(Calendar.MONTH, 6);
        cc.set(Calendar.DAY_OF_MONTH, 9);
        //3.获取字段的值
        int year = cc.get(Calendar.YEAR);
        System.out.println(year);

        int month = cc.get(Calendar.MONTH);
        System.out.println(month);

        int day = cc.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);

        int week = cc.get(Calendar.DAY_OF_WEEK);
        String w = weekToChinese(week);
        System.out.println(w);
        //我们的星期和外国人的星期不一样
        //中国 1 2 3 4 5 6 7
        //外国 2 3 4 5 6 7 1

    }

    //把外国人的星期几 变成中国人的星期几,并且返回中文字符串
    public static String weekToChinese(int week) {
        String[] weeks = {"星期天", "星期1", "星期2", "星期3", "星期4", "星期5", "星期六"};
        String w = weeks[week - 1];
        return w;
    }
}
