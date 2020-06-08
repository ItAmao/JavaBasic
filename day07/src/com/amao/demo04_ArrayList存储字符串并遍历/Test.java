package com.amao.demo04_ArrayList存储字符串并遍历;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //需求:创建一个存储字符串的集合,存储3个字符串元素
        //1.创建一个存储字符串的集合
        ArrayList<String> arr = new ArrayList();
        arr.add("阿毛");
        arr.add("learn");
        arr.add("Java");
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
        System.out.println("--------------------");
        ArrayList arr1 = new ArrayList();
        arr1.add("阿毛");
        arr1.add(18);
        arr1.add(176.56);
        for (int i = 0; i < arr1.size(); i++) {
            System.out.println(arr1.get(i));
        }
    }
}
