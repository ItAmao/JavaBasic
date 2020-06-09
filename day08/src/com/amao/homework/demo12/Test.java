package com.amao.homework.demo12;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //请定义一个集合：ArrayList<Integer>，并循环向集合中添加1千万个数字，请计算这个循环运行的时间，并打印。
        long startTime = System.currentTimeMillis() / 1000;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10000000; i++) {
            arrayList.add(i);
        }
        long endTime = System.currentTimeMillis() / 1000;
        System.out.println(endTime - startTime + "秒");
    }

}
