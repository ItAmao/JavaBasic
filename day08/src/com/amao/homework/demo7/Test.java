package com.amao.homework.demo7;

import java.util.Calendar;

public class Test {
    public static void main(String[] args) {
        //请编写程序，使用Calendar类获取日历对象，并分别获取年、月、日、小时、分、秒，并将它们打印到控制台。
        Calendar date = Calendar.getInstance();
        int year = date.get(Calendar.YEAR);
        //月需要转换
        int month = date.get(Calendar.MONTH) % 12 + 1;
        int day = date.get(Calendar.DAY_OF_MONTH);
        int hour = date.get(Calendar.HOUR);
        int minute = date.get(Calendar.MINUTE);
        int second = date.get(Calendar.SECOND);
        System.out.println("现在是: " + year + "年" + month + "月" + day + "日" + hour + "时" + minute + "分" + second + "秒");
    }
}
