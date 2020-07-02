package com.amao.homework.demo06;

/**
 * @description: 请使用“匿名Thread”子类的方式实现线程，线程中计算1--100所有数字的累加和，并打印计算结果。
 * @params:
 * @return:
 * @author: ItAmao
 * @time: 2020/6/18 20:02
 */
public class Test {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                for (int i = 1; i <= 100; i++) {
                    sum += i;
                }
                System.out.println(sum);
            }
        }).start();
    }
}
