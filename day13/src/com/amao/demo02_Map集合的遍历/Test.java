package com.amao.demo02_Map集合的遍历;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "阿毛");
        map.put(2, "2毛");
        map.put(3, "3毛");
        map.put(4, "4毛");
        map.put(5, "5毛");
        map.put(6, "6毛");
        map.put(7, "7毛");
        map.put(8, "8毛");
        //第一种遍历map的方法，通过加强for循环map.keySet()，然后通过键key获取到value值
        //map.keySet():该方法返回map中所有key值的列表。
        for (Integer integer : map.keySet()) {
            System.out.println("key:" + integer + " value:" + map.get(integer));
        }
        System.out.println("--------------------------------------------------");

        //第二种只遍历键或者值，通过加强for循环
        //map.KeySet():该方法返回map中所有key值的列表。
        for (Integer integer : map.keySet()) {
            System.out.println("键key ：" + integer);
        }
        //System.out.println(map.values());
        //map.values() 获取 map中所有的值
        for (String s : map.values()) {
            System.out.println("值value ：" + s);
        }
        System.out.println("--------------------------------------------------");

        //第三种方式Map.Entry<Integer, String>的加强for循环遍历输出键key和值value
        // System.out.println(map.entrySet()); [1=阿毛, 2=2毛, 3=3毛, 4=4毛, 5=5毛, 6=6毛, 7=7毛, 8=8毛]
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("键 key ：" + entry.getKey() + " 值value ：" + entry.getValue());
        }
        System.out.println("--------------------------------------------------");

        //第四种Iterator遍历获取，然后获取到Map.Entry<Integer, String>，再得到getKey()和getValue()
        Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, String> entry = it.next();
            System.out.println("键key ：" + entry.getKey() + " value ：" + entry.getValue());
        }
        System.out.println("====================================");
    }
}
