package com.amao.homework.demo11;

public class Test {
    public static void main(String[] args) {
//        有以下数组：
//
//​       int[] arr = {55,77,0,88,22,44,33};
//
//        请编程实现：将后四个数字依次前移一位，移动后，最后一位置为0.
        int[] arr = {55, 77, 0, 88, 22, 44, 33};
        int temp = 0;
        for (int i = 2; i < arr.length - 1; i++) {
            temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
