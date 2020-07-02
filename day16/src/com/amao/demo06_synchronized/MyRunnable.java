package com.amao.demo06_synchronized;

/**
 * 卖票任务
 */
public class MyRunnable implements Runnable {
    /**
     * 票数
     */
    public int count = 100;
    /**
     * 创建一个对象
     */
    //public Object obj = new Object();

    @Override
    public void run() {
        while (true){
            //同步代码块
            synchronized (this) {

                if (count > 0) {

                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + "卖出第" + count + "张票");

                    count--;
                }

            }
        }
    }
}
