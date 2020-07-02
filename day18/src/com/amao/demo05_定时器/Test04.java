package com.amao.demo05_定时器;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * public void schedule(TimerTask task,Date time,long period0;
 * 在指定的时间开始,对指定的任务执行重复固定的延迟
 */
public class Test04 {
    public static void main(String[] args) {
        //1.创建定时器
        Timer timer = new Timer();
        //2,创建时间对象
        Calendar time1 = Calendar.getInstance();
        time1.add(Calendar.SECOND, 5);
        Date time2 = time1.getTime();
        //2.布置任务 隔5秒后 ,每2秒执行
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("时间到了,下课...");
            }
        }, time2, 2000);
    }
}
