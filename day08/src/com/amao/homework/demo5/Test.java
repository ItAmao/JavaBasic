package com.amao.homework.demo5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        //请在控制台以“xxxx年xx月xx日 xx时xx分xx秒”的格式打印当前系统时间。
        Date date = new Date();
        String time = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒").format(date);
        System.out.println("现在时间是:"+time);
    }
}
