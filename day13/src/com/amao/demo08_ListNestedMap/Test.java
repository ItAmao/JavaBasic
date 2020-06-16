package com.amao.demo08_ListNestedMap;

import java.util.ArrayList;
import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        //1.创建一个Map,保存1班学生的学号和姓名
        HashMap<Integer, String> map1 = new HashMap<Integer, String>();
        map1.put(100, "jack");
        map1.put(200, "rose");
        map1.put(300, "marry");

        //2.创建一个Map,保存2班学生的学号和姓名
        HashMap<Integer, String> map2 = new HashMap<Integer, String>();
        map2.put(400, "小明");
        map2.put(500, "小冬");
        map2.put(600, "小明");

        //3.创建一个Map,保存3班学生的学号和姓名
        HashMap<Integer, String> map3 = new HashMap<Integer, String>();
        map3.put(700, "狗剩");
        map3.put(800, "狗娃");
        map3.put(900, "狗蛋");

        //4.创建一个大集合,保存以上的三个Map集合
        ArrayList<HashMap<Integer, String>> arrAll = new ArrayList<HashMap<Integer, String>>();
        arrAll.add(map1);
        arrAll.add(map2);
        arrAll.add(map3);
        //[{100=jack, 200=rose, 300=marry}, {400=小明, 500=小冬, 600=小明}, {800=狗娃, 900=狗蛋, 700=狗剩}]
        System.out.println(arrAll);
    }
}
