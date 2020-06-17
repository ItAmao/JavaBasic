package com.amao.homework.demo02;

public class Test {
    public static void main(String[] args) {
        int[] arr = {431, 54, 25, 25, 26, 45, 2, 4, 65, 3, 64, 6, 46, 7, 54};
        bubble(arr);
        System.out.println(binarySelect(arr, 200));
    }

    /**
     * 二分查找
     */
    public static int binarySelect(int[] arr, int num) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (num == arr[mid]) {
                return mid;
            } else if (num > arr[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    /**
     * 冒泡排序
     */
    public static void bubble(int[] arr) {
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
        System.out.println("冒泡排序后的元素:");
        for (int i : arr) {
            System.out.print(i + "  ");
        }
        System.out.println("");
        System.out.println("================================");
    }
}
