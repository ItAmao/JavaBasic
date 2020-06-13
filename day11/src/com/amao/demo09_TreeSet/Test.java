package com.amao.demo09_TreeSet;


import java.util.TreeMap;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        TreeSet<Integer> ts1 = new TreeSet<>();
        ts1.add(9);
        ts1.add(5);
        ts1.add(2);
        ts1.add(7);
        ts1.add(7);
        //[2, 5, 7, 9]  无序,无索引,不可重复
        System.out.println(ts1);

    }
}
