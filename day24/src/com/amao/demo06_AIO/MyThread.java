package com.amao.demo06_AIO;

import java.util.ArrayList;
import java.util.Random;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/7/3 21:14
 */
public class MyThread implements Runnable {
    private ArrayList<String> arrayList;
    public MyThread() {
    }
    public MyThread(ArrayList<String> arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            synchronized (this) {
                notify();
                if (!arrayList.isEmpty()) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    int i = random.nextInt(arrayList.size());
                    System.out.println(Thread.currentThread().getName() + "抢到了" + arrayList.get(i));
                    arrayList.remove(i);
                    try {
                        //使得调用如下wait方法的线程进入阻塞状态
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    break;
                }
            }
        }
    }
}