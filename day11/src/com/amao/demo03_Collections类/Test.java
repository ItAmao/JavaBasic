package com.amao.demo03_Collections类;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(14);
        arr.add(44);
        arr.add(13);
        arr.add(24);
        arr.add(46);
        arr.add(57);
        arr.add(25);
        arr.add(47);
        //2.排序
        System.out.println("排序之前: " + arr);
        Collections.sort(arr);
        System.out.println("排序之后: " + arr);
        Collections.shuffle(arr);
        System.out.println("乱序之后:" + arr);
    }
}
