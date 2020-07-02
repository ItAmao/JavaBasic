package com.amao.demo01_ThreadPool;

import java.util.concurrent.*;

public class Test02 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //1.获取线程池对象
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        //2.提交任务
//        int i = 3;
//        while (i <= 3) {
//            executorService.submit(new Runnable() {
//                @Override
//                public void run() {
//                    System.out.println(Thread.currentThread().getName() + "执行了");
//                }
//            });
//            i--;
//        }
        System.out.println("开始提交任务");
        //2.提交任务
        //submit方法提交任务后,立即返回Future
        Future<Integer> future = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws InterruptedException {
                int sum = 0;
                for (int i = 0; i <= 100; i++) {
                    Thread.sleep(30);
                    sum += i;
                }
                return sum;
            }
        });
        System.out.println("任务提交完毕");
        //获取结果并打印
        //调用get方法时,如果任务没有执行完毕,该方法会阻塞,直到线程任务执行完毕才能获取的结果
        System.out.println("开始获取结果");
        Integer result = future.get();
        System.out.println("结果是:" + result);

        //如果说线程池不想用了,可以关闭线程池
        executorService.shutdown();
    }
}
