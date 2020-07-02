package com.amao.demo09_Exchanger;

import java.util.concurrent.Exchanger;

public class ThreadB extends Thread {
    private Exchanger<String> exchanger;
    public ThreadB(Exchanger<String> exchanger){
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        try {
            //线程B给线程A发信息
            System.out.println("线程B给线程A发信息...");
            String exchange = exchanger.exchange("BBBBBBBBBBBBBBBB");
            System.out.println("同时获取到线程A的回信:"+exchange);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
