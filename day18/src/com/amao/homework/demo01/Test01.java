package com.amao.homework.demo01;

import java.util.concurrent.*;

/**
 * @description: 请按以下步骤编写程序：
 * 	定义一个线程类，实现Callable接口。此线程可以计算1--100的所有数字的累加和。
 * 	定义测试类，和main()方法，使用线程池启动线程，并获取计算结果，并将结果打印到控制台。
 * @params:
 * @return:
 * @author: ItAmao
 * @time: 2020/6/23 20:00
 */
public class Test01 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //1.创建线程池对象。
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        //3.提交Runnable接口子类对象
        Future<Integer> future = executorService.submit(new Task());
        System.out.println(future.get());

    }
}

//2.创建Runnable接口子类对象
class Task implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }
}