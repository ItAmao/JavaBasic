package com.amao.demo08_泛型通配符;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Double> arr3 = new ArrayList<>();
        show(arr1);
        show(arr2);
        show(arr3);
    }

    /**
     * 泛型不支持多态
     *
     * @param arrayList
     */
    public static void show(ArrayList<?> arrayList) {

    }
}
