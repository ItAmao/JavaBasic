package com.amao.demo01_ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test01 {
    public static void main(String[] args) {
        //1.获取线程池对象
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        //2.提交任务
        int i = 3;
        while (i <= 3) {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + "执行了");
                }
            });
            i--;
        }
    }
}
