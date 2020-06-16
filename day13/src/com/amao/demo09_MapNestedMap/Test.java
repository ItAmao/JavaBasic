package com.amao.demo09_MapNestedMap;

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

        //4.创建一个大Map集合,保存班级的名字和该班级的学生map信息
        HashMap<String, HashMap<Integer, String>> mapAll = new HashMap<String, HashMap<Integer, String>>();
        mapAll.put("Java班", map1);
        mapAll.put("UI班", map2);
        mapAll.put("PHP班", map3);
        //{PHP班={800=狗娃, 900=狗蛋, 700=狗剩}, UI班={400=小明, 500=小冬, 600=小明}, Java班={100=jack, 200=rose, 300=marry}}
        System.out.println(mapAll);
    }
}
