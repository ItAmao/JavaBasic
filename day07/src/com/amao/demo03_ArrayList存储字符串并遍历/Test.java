package com.amao.demo03_ArrayList存储字符串并遍历;


import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //需求:创建一个存储字符串的集合，存储3个字符串元素，使用程序实现在控制台遍历该集合

        ArrayList<String> arr = new ArrayList<>();
        arr.add("阿毛");
        arr.add("二毛");
        arr.add("三毛");
        for (String str : arr) {
            System.out.print(str);
        }
        System.out.println("");
        for(int i=0;i<arr.size();i++){
            String s = arr.get(i);
            System.out.print(s);
        }
    }
}
