package com.amao.homework.demo01;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 2, 432, 32, 54, 32, 3, 7, 657, 563, 25, 43, 6, 463, 52};
        bubble(arr);
        selectSort(arr);
        printArrays(arr);
    }

    /**
     * Arrays类打印
     */
    public static void printArrays(int[] arr) {
        Arrays.sort(arr);
        System.out.println("Arrays类打印:");
        for (int i : arr) {
            System.out.print(i + "  ");
        }
    }

    /**
     * 选择排序
     */
    public static void selectSort(int[] arr) {
        int min = 0;
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            if (min != i) {
                temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        System.out.println("选择排序:");
        for (int i : arr) {
            System.out.print(i + "  ");
        }
        System.out.println("");
        System.out.println("=====================================");
    }

    /**
     * 冒泡排序
     *
     * @param arr
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
        System.out.println("冒泡排序(升序):");
        for (int i : arr) {
            System.out.print(i + "  ");
        }
        System.out.println("");
        System.out.println("=====================================");
    }
}
