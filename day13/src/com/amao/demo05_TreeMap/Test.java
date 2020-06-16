package com.amao.demo05_TreeMap;

import java.util.Comparator;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(1, "阿毛");
        tm.put(3, "3毛");
        tm.put(2, "2毛");
        tm.put(4, "4毛");
        tm.put(5, "5毛");
        tm.put(7, "7毛");
        tm.put(6, "6毛");
        //升序
        System.out.println(tm);
        //降序
        TreeMap<Integer, String> tm1 = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        tm1.put(1, "阿毛");
        tm1.put(3, "3毛");
        tm1.put(2, "2毛");
        tm1.put(4, "4毛");
        tm1.put(5, "5毛");
        tm1.put(7, "7毛");
        tm1.put(6, "6毛");
        System.out.println(tm1);
    }
}
