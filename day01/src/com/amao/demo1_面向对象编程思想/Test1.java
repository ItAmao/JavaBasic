package com.amao.demo1_面向对象编程思想;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println("");
        System.out.println("------------");
        System.out.println(Arrays.toString(arr));
    }
}
