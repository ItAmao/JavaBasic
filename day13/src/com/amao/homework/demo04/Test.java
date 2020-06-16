package com.amao.homework.demo04;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @description: 请按以下要求顺序编写程序：
 * <p>
 * l  定义测试类，定义main()方法；
 * <p>
 * l  定义以下数组：
 * <p>
 * int[] arr = {1,2,432,32,54,32,3,7,657,563,25,43,6,463,52};
 * <p>
 * l  用Arrays类打印此数组的所有元素；
 * <p>
 * l  用“冒泡排序”对数组元素“升序”排序；打印排序后的数组。
 * @params:
 * @return:
 * @author: ItAmao
 * @time: 2020/6/16 17:19
 */
public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 2, 432, 32, 54, 32, 3, 7, 657, 563, 25, 43, 6, 463, 52};
        System.out.println(Arrays.toString(arr));
        System.out.println("------------------------------------------");
        System.out.println(Arrays.toString(bubble(arr)));
    }

    public static int[] bubble(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
