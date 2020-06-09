package com.amao.demo06_Calendar类;

import java.util.Calendar;

/*
java.util.GregorianCalendar
[time=1591673643446,areFieldsSet=true,
areAllFieldsSet=true,lenient=true,
zone=sun.util.calendar.ZoneInfo[id="Asia/Shanghai",
offset=28800000,dstSavings=0,useDaylight=false,transitions=29,lastRule=null],
firstDayOfWeek=1
,minimalDaysInFirstWeek=1,ERA=1,
YEAR=2020,
MONTH=5,
WEEK_OF_YEAR=24,
WEEK_OF_MONTH=2,
DAY_OF_MONTH=9,
DAY_OF_YEAR=161,
DAY_OF_WEEK=3,
DAY_OF_WEEK_IN_MONTH=2,
AM_PM=0,
HOUR=11,
HOUR_OF_DAY=11,
MINUTE=34,
SECOND=3,
MILLISECOND=446,
ZONE_OFFSET=28800000,DST_OFFSET=0]

 */
public class Test {
    public static void main(String[] args) {

        //1.创建一个Calendar类子类对象
        Calendar cc = Calendar.getInstance();
        //System.out.println(cc);
        //2获取字段的值
//        int year = cc.get(1);//1是年的编号
//        int month = cc.get(2);//2是月的编号
//        int day = cc.get(3);//
        int year = cc.get(Calendar.YEAR);
        int month = cc.get(Calendar.MONTH);
        int day = cc.get(Calendar.DAY_OF_MONTH);
        int week = cc.get(Calendar.DAY_OF_WEEK);
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
        System.out.println(week);


    }
}
