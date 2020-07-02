package com.amao.demo09_Exchanger;

import java.util.concurrent.Exchanger;

public class ThreadA extends Thread {
    private Exchanger<String> exchanger;
    public ThreadA(Exchanger<String> exchanger){
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        try {
            //线程A给线程B发信息
            System.out.println("线程A给线程B发信息...");
            String exchange = exchanger.exchange("AAAAAAAAAAAA");
            System.out.println("同时获取到线程B的回信:"+exchange);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
