package com.amao.demo05_Arrays类;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        //1.排序
        int[] arr = {6, 4, 7, 9, 4, 3, 5, 7, 8, 2, 3, 4, 5, 6, 7, 8, 9};
        //升序排列
        Arrays.sort(arr);
        //2.打印
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        System.out.println("==================");
        //使用toString方法
        System.out.println(Arrays.toString(arr));

    }
}
