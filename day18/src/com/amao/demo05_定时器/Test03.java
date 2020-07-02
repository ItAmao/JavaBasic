package com.amao.demo05_定时器;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * public void schedule(TimerTask task,long millis,long period);
 * 在指定的延迟之后开始,重新执行固定延迟执行的指定任务
 */
public class Test03 {
    public static void main(String[] args) {
        //1.创建定时器
        Timer timer = new Timer();
        //2.布置任务 意思就2秒之后,每隔5秒执行 时间到了下课
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("时间到了,下课...");
            }
        }, 2000, 5000);
    }
}
