package com.amao.homework;

import org.junit.Test;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/7/2 17:47
 */
public class Demo02 {
    @Test
    public void testMax() {
        int[] arr = {1, 3, 5, 4, 2, 5, 7, 9, 8};
        System.out.println(getMax(arr));
    }

    private int getMax(int[] arr) {
        //复习冒泡排序
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[arr.length - 1];
    }
}
