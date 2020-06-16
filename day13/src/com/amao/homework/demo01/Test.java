package com.amao.homework.demo01;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: ​    请按以下要求顺序编码：
 * <p>
 * Ø  定义一个：键Integer，值String类型的HashMap集合
 * <p>
 * Ø  存储以下数据：
 * <p>
 * 1，”张三”
 * <p>
 * 2，“李四”
 * <p>
 * 1，“王五”
 * Ø  打印集合大小；
 * Ø  使用“键找值”的方式遍历集合，打印键和值；
 * Ø  使用“键值对”的方式遍历集合，打印键和值；
 * Ø  获取键为1的值，并打印
 * Ø  获取键为10的值，并打印
 * Ø  判断集合中是否有键：10
 * Ø  删除键为1的键值对，删除完毕打印集合
 * @params:
 * @return:
 * @author: ItAmao
 * @time: 2020/6/16 17:03
 */
public class Test {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "张三");
        hm.put(2, "李四");
        hm.put(1, "王五");
        System.out.println("打印集合大小");
        System.out.println(hm.size());
        System.out.println("--------------------------");
        System.out.println("使用“键找值”的方式遍历集合，打印键和值；");
        for (Integer integer : hm.keySet()) {
            System.out.println(integer + "=" + hm.get(integer));
        }
        System.out.println("--------------------------");
        System.out.println("使用“键值对”的方式遍历集合，打印键和值；");
        for (Map.Entry<Integer, String> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        System.out.println("--------------------------");
        System.out.println("获取键为1的值，并打印");
        System.out.println(hm.get(1));
        System.out.println("--------------------------");

        System.out.println("获取键为10的值，并打印");
        System.out.println(hm.get(10));
        System.out.println("--------------------------");

        System.out.println("判断集合中是否有键：10");
        System.out.println(hm.containsKey(10));
        System.out.println("--------------------------");

        System.out.println("删除键为1的键值对，删除完毕打印集合");
        hm.remove(1);
        System.out.println(hm);
    }
}
