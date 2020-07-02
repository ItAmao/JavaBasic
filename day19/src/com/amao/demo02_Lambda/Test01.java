package com.amao.demo02_Lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Test01 {
    public static void main(String[] args) {

        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        Arrays.sort(args);
//        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(Arrays.toString(arr));
        //使用Lambda替代匿名内部类
        Arrays.sort(arr, (Integer o1, Integer o2) -> {
            return o1 - o2;
        });
        System.out.println(Arrays.toString(arr));
    }
}
