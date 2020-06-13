package com.amao.homework.demo01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @description: 请定义一个可以存储“整数”的集合，并存储一些数据。
 * ​              请按以下要求顺序编程实现：
 * Ø  对集合中的数据打乱顺序；
 * Ø  打印集合
 * Ø  对集合中的数据进行升序排序
 * Ø  打印集合
 * Ø  对集合中的数据进行降序排序(要实现排序，不可以倒序遍历实现)
 * Ø  打印集合
 * @params:
 * @return:
 * @author: ItAmao
 * @time: 2020/6/13 17:06
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i <=100; i++) {
            arr.add(i);
        }
        System.out.println("初始元素为:" + arr);
        //对集合中的数据打乱顺序；
        Collections.shuffle(arr);
        System.out.println("打乱后的元素:" + arr);
        //对集合中的数据进行升序排序
        Collections.sort(arr);
        System.out.println("升序排序" + arr);
        //对集合中的数据进行降序排序(要实现排序，不可以倒序遍历实现)
        Collections.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println("降序排序"+arr);
    }

}
