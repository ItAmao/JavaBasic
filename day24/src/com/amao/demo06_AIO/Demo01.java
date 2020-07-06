package com.amao.demo06_AIO;

import java.util.ArrayList;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/7/3 21:00
 */
public class Demo01 {
    public static void main(String[] args) {
        ArrayList<String> hs = new ArrayList<>();
        hs.add("苹果MacPro电脑");
        hs.add("戴森吸尘器");
        hs.add("华为5G手机");
        hs.add("海尔冰箱");
        hs.add("带薪假期三天");
        MyThread myThread = new MyThread(hs);
        Thread t1 = new Thread(myThread, "技术部");
        Thread t2 = new Thread(myThread, "事业部");
        t1.start();
        t2.start();
    }
}
