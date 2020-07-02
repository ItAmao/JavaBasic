package com.amao.demo04_CopyOnWriteArraySet;

import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class MyThread extends Thread {
    //public static HashSet<Integer> hs = new HashSet<>();
    public static CopyOnWriteArraySet<Integer> hs = new CopyOnWriteArraySet<>();

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            hs.add(i);
        }
        System.out.println("添加完毕！");
    }
}
