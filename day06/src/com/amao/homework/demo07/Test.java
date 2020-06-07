package com.amao.homework.demo07;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(splice(arr));
    }

    public static String splice(int[] arr) {
        if (arr == null) {
            return null;
        }
        StringBuilder res = new StringBuilder();
        res.append("[");
        for (int i = 0; i < arr.length; i++) {
            res.append(arr[i]);
            if (i != arr.length - 1) {
                res.append(", ");
            }
        }
        res.append("]");
        return res.toString();
    }
}
