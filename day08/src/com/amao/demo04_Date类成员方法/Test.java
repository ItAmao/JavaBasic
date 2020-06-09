package com.amao.demo04_Date类成员方法;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        //1.创建Date对象
        Date now = new Date();
        long time = now.getTime();
        System.out.println("现在距离标准时间:" + (time / 1000 / 60 / 60 / 24) + "天");
        System.out.println("----------------");
        //修改距离标准时间的毫秒值
        now.setTime(10000L);
        System.out.println(now);
    }
}
