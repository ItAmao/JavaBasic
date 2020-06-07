package com.amao.demo13_字符串拼接操作;

public class Test {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(splice(arr));
    }

    public static String splice(int[] arr) {
        StringBuilder res = new StringBuilder();
        res.append('[');
        for (int i = 0; i < arr.length; i++) {
            res.append(i);
            if (i != arr.length-1) {
                res.append(",");
            } else {
                res.append("]");
            }
        }
        return res.toString();
    }
}
