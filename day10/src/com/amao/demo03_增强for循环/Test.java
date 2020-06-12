package com.amao.demo03_增强for循环;

import java.util.ArrayList;

/**
 * @description: 增强for循环
 * @params:
 * @return:
 * @author: ItAmao
 * @time: 2020/6/12 10:47
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("-----数组的2种循环-----");
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4};
        //1.for循环遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        //2.forEach
        for (int nums : arr) {
            System.out.print(nums + " ");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("-----集合的2种循环-----");
        ArrayList<String> arr2 = new ArrayList<>();
        arr2.add("1毛");
        arr2.add("2毛");
        arr2.add("3毛");
        arr2.add("4毛");
        arr2.add("5毛");
        System.out.println(arr2.toString());
        //1.for循环遍历
        for (String name : arr2) {
            System.out.print(name + ",");
        }
    }
}
