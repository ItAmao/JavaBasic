package com.amao.demo07_ListNestedList;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //1.创建一个集合,保存1班学生的名字
        ArrayList<String> arr1 = new ArrayList<String>();
        arr1.add("jack");
        arr1.add("rose");
        arr1.add("tom");

        //2.创建一个集合,保存2班学生的名字
        ArrayList<String> arr2 = new ArrayList<String>();
        arr2.add("小明");
        arr2.add("小冬");
        arr2.add("小美");


        //3.创建一个集合,保存3班学生的名字
        ArrayList<String> arr3 = new ArrayList<String>();
        arr3.add("狗蛋");
        arr3.add("狗娃");
        arr3.add("狗剩");

        //4.创建一个大集合 保存以上三个集合
        ArrayList<ArrayList<String>> arrAll = new ArrayList<ArrayList<String>>();
        arrAll.add(arr1);
        arrAll.add(arr2);
        arrAll.add(arr3);

        // [[jack, rose, tom], [小明, 小冬, 小美], [狗蛋, 狗娃, 狗剩]]
        System.out.println(arrAll);


    }
}
