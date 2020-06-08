package com.amao.demo_homework.Test01;

import java.util.ArrayList;

/*
现有如下字符串元素：["aaa", "bbb", "aaa", "aaa", "ccc", "bbb"]，
请将所有的元素按顺序存入ArrayList集合中，并遍历集合查看存储结果。
 */
public class Test01 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        String[] str = {"aaa", "bbb", "aaa", "aaa", "ccc", "bbb"};
        sort(str, arr);
    }

    public static void sort(String[] str, ArrayList<String> arr) {
        for (int i = 0; i < str.length; i++) {
            //System.out.println(str[i]);
            arr.add(str[i]);
        }
        for (String string : arr) {
            System.out.print(string + ",");
        }
    }
}
