package com.amao.homework.demo05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/**
 * @description: ArrayList有以下元素: "a","f","b","c","a","d"，请用任意方式完成集合元素去重。去除集合中重复的元素。
 * @params:
 * @return:
 * @author: ItAmao
 * @time: 2020/6/16 17:23
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        Collections.addAll(arr, "a", "f", "b", "c", "a", "d");
        LinkedHashSet<String> lhs = new LinkedHashSet();
        for (String s : arr) {
            lhs.add(s);
        }
        System.out.println(lhs);
    }
}
