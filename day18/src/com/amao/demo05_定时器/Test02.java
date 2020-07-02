package com.amao.demo05_定时器;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * public void schedule(TimerTask task,Date time):在指定的时候安排指定的任务执行
 */
public class Test02 {
    public static void main(String[] args) {
        //1.创建定时器
        Timer timer = new Timer();
        //2.创建时间对象
        //Date time1 = new Date();
        //System.out.println(time1);
        Calendar time2 = Calendar.getInstance();
        //Calendar.SECOND:显示一分钟的秒数,5秒
        time2.add(Calendar.SECOND, 5);
        Date time3 = time2.getTime();
        //2.布置任务

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("时间到了,下课...");
            }
        }, time3);
    }
}
