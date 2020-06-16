package com.amao.demo11_冒泡排序;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 14, 12, 15, 10, 11, 13};
        int[] MaxToMin = bubble1(arr);
        for (int i : MaxToMin) {
            System.out.print(i + "    ");
        }
        System.out.println("");
        System.out.println("------------------");
        int[] MinToMax = bubble2(arr);
        for (int i : MinToMax) {
            System.out.print(i + "    ");
        }
    }

    /**
     * 冒泡从小到大
     */
    public static int[] bubble2(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                //从大到小
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    /**
     * 冒泡从大到小
     *
     * @param arr
     * @return
     */
    public static int[] bubble1(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                //从大到小
                if (arr[j] < arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
