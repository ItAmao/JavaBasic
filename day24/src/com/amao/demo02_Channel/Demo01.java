package com.amao.demo02_Channel;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 * 倒计时
 *
 *  @Author : ItAmao
 *  @Date   : 2020/7/4 10:50
 */
public class Demo01 {
    static String Countdown = "";

    public static void main(String[] args) {
        //开启倒计时
        time2();
        System.out.println("Countdown=" + Countdown);
    }

    /**
     * 倒计时,设定时间戳
     */
    private static void time2() {

        Calendar c = Calendar.getInstance();
        c.set(c.get(Calendar.YEAR), (c.get(Calendar.MONTH) + 1), c.get(Calendar.DAY_OF_MONTH) + 1,
                c.get(Calendar.HOUR_OF_DAY), c.get(Calendar.MINUTE), c.get(Calendar.SECOND));

        long endTime = c.getTimeInMillis();
        Date date = new Date();
        long startTime = date.getTime();
        long midTime = (endTime - startTime) / 1000;
        System.out.println(midTime);
        midTime = 30;
        while (midTime > 0) {
            midTime--;
            long hh = midTime / 60 / 60 / 2 % 60;
            long mm = midTime / 60 % 60;
            long ss = midTime % 60;
            System.out.println("还剩" + hh + "小时" + mm + "分钟" + ss + "秒");
            //System.out.println(hh + "" + mm + "" + ss + "");
            Countdown = hh + "" + mm + "" + ss + "";

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
