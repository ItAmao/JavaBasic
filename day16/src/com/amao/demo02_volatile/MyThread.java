package com.amao.demo02_volatile;

public class MyThread extends Thread {
    public volatile static int a = 0;
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            a++;//a.获取a的值 b.增加1 c.更新a的值
        }
        System.out.println("修改完毕！");
    }
}