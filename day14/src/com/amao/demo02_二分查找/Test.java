package com.amao.demo02_二分查找;

import javax.xml.stream.FactoryConfigurationError;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4, 6, 5, 8, 7, 10, 9, 11, 11, 1, 2, 3};
        arr = bubble(arr);
        for (int i : arr) {
            System.out.print(i + "  ");
        }
        System.out.println("");
        //System.out.println(arr.length);
        //二分查找,找到的是索引值
        System.out.println(binarySearch1(arr, 1));
        System.out.println("");
        System.out.println(binarySearch2(arr, 11, 0, arr.length - 1));
    }


    /**
     * 二分查找:递归版本
     */
    public static int binarySearch2(int[] arr, int num, int left, int right) {
        if (num == arr[left]) {
            return left;
        }
        if (num == arr[right]) {
            return right;
        }
        while (left < right) {
            int mid = (left + right) / 2;
            if (num == arr[mid]) {
                return mid;
            } else if (num > arr[mid]) {
                return binarySearch2(arr, num, mid + 1, right);
            } else {
                return binarySearch2(arr, num, left, mid - 1);
            }
        }
        return -1;
    }

    /**
     * 二分查找:普通版本
     */
    public static int binarySearch1(int[] arr, int num) {
        int left = 0;
        int right = arr.length - 1;
        //int mid = l + (r - l) / 2;//二分算法
        while (left <= right) {
            int middle = (left + right) / 2;
            if (arr[middle] == num) {
                return middle;
            } else if (num > arr[middle]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }

    /**
     * 先用冒泡把数组排序
     */
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
