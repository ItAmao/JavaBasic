package com.amao.demo06_可变参数;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        //可变参数的例子
        System.out.println(getSum(1));
        System.out.println(getSum(1, 2));
        System.out.println(getSum(1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println("--------------------");
        //可变参数的应用场景
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);
        arr1.add(5);
        System.out.println(arr1);
        Collections.addAll(arr2, 1, 2, 3, 4, 5);
        System.out.println(arr2);

    }

    public static int getSum(int... num) {
        //System.out.println(num);
        int sum = 0;
        for (int i : num) {
            sum += i;
        }
        return sum;
    }
}
