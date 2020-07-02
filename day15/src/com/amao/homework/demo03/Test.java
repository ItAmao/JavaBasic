package com.amao.homework.demo03;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description: 请使用继承Thread类的方式定义一个线程类，在run()方法中循环10次，每1秒循环1次，
 * 每次循环按“yyyy-MM-dd HH:mm:ss”的格式打印当前系统时间。
 * <p>
 * 请定义测试类，并定义main()方法，启动此线程，观察控制台打印。
 * @params:
 * @return:
 * @author: ItAmao
 * @time: 2020/6/18 19:40
 */
public class Test {
    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(sdf.format(new Date()));
                }
            }
        }.start();
    }
}
