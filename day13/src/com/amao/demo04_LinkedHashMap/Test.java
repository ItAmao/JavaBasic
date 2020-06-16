package com.amao.demo04_LinkedHashMap;

import java.util.LinkedHashMap;

public class Test {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
        lhm.put(1, "阿毛");
        lhm.put(2, "1毛");
        lhm.put(3, "2毛");
        lhm.put(4, "3毛");
        lhm.put(5, "4毛");
        //有序的
        System.out.println(lhm);
    }
}
