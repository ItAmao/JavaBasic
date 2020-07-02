package com.amao.demo05_定时器;

import java.util.Timer;
import java.util.TimerTask;

/**
 * public void schedule(TimerTask task,long millis); 在指定的延迟之后安排指定的任务执行
 */
public class Test01 {
    public static void main(String[] args) {
        //1.创建定时器
        Timer timer = new Timer();
        //2.布置任务
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("时间到了,下课...");
            }
        }, 5000);
    }
}
