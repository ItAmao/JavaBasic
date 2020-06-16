package com.amao.demo01_HashMap常用方法;

import java.util.HashMap;

/**
 * @description:
 * @params:
 * @return:
 * @author: ItAmao
 * @time: 2020/6/16 09:44
 */
public class Test {
    public static void main(String[] args) {
        //1.创建Map对象
        HashMap<String, Integer> hm = new HashMap<>();
        //2.调用方法
        //增
        hm.put("阿毛", 18);
        hm.put("1毛", 19);
        hm.put("2毛", 20);
        hm.put("3毛", 21);
        hm.put("4毛", 22);
        hm.put("5毛", 23);
        hm.put("6毛", 24);
        //{6毛=24, 5毛=23, 4毛=22, 3毛=21, 2毛=20, 1毛=19, 阿毛=18}
        System.out.println(hm);
        System.out.println("--------------------------------------------------");
        //删
        hm.remove("6毛");
        System.out.println(hm);
        System.out.println("--------------------------------------------------");
        //改
        hm.put("5毛", 24);
        System.out.println(hm);
        System.out.println("--------------------------------------------------");
        //查
        Integer get = hm.get("阿毛");
        System.out.println(get);
        System.out.println("--------------------------------------------------");
        //其他
        System.out.println(hm.size());
        System.out.println(hm.containsKey("阿毛"));
        System.out.println(hm.containsValue(24));
        System.out.println("--------------------------------------------------");
        System.out.println(hm.replace("阿毛", 19));
        System.out.println(hm);

    }
}
