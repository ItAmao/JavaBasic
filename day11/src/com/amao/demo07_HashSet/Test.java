package com.amao.demo07_HashSet;

import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        HashSet<Integer> hs1 = new HashSet<>();
        hs1.add(1);
        hs1.add(1);
        System.out.println(hs1); //[1]说明元素不可重复
        HashSet<Integer> hs2 = new HashSet<>();
        hs2.add(1);
        hs2.add(2);
        hs2.add(3);
        hs2.add(4);
        System.out.println(hs2);//[1, 2, 3, 4]
        HashSet<Integer> hs3 = new HashSet<>();
        hs3.add(10);
        hs3.add(13);
        hs3.add(11);
        hs3.add(14);
        System.out.println(hs3);//[10, 11, 13, 14]
//        HashSet<String> hs3 = new HashSet<>();
//        hs3.add("阿毛");
//        hs3.add("1毛");
//        hs3.add("2毛");
//        hs3.add("3毛");
//        System.out.println(hs3);//[3毛, 2毛, 1毛, 阿毛]

    }
}
