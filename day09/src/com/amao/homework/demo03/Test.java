package com.amao.homework.demo03;

import java.util.Arrays;

/**
 * @description: 有以下数组定义：
 * <p>
 * ​       int[] arr = {1,332,43,25,3324,34,335,4,45,2,43,52,54};
 * <p>
 * ​    要求：
 * <p>
 * Ø 请打印数组所有元素
 * <p>
 * Ø 请对数组元素进行“升序”排序
 * <p>
 * Ø 请对排序后的数组再次打印。
 * @params:
 * @return:
 * @author: ItAmao
 * @time: 2020/6/10 17:32
 */
public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 332, 43, 25, 3324, 34, 335, 4, 45, 2, 43, 52, 54};
        for (int nums : arr) {
            System.out.print(nums + " ");
        }
        System.out.println("");
        Arrays.sort(arr);
        for (int nums1 : arr) {
            System.out.print(nums1 + " ");
        }
    }
}
