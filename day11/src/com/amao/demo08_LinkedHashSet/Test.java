package com.amao.demo08_LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs1 = new LinkedHashSet<>();
        lhs1.add("阿毛");
        lhs1.add("1毛");
        lhs1.add("2毛");
        System.out.println(lhs1);
        LinkedHashSet<Integer> lhs2 = new LinkedHashSet<>();
        lhs2.add(9);
        lhs2.add(5);
        lhs2.add(2);
        lhs2.add(7);
        lhs2.add(7);
        System.out.println(lhs2);//有序,不可重复,无索引
    }
}
