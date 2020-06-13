package com.amao.homework.demo02;

import java.util.*;

/**
 * @description: 请编写main()方法，按以下要求顺序
 * <p>
 * Ø  定义一个Set集合，并存储以下数据：
 * <p>
 * 刘备，关羽，张飞，刘备，张飞
 * <p>
 * Ø  打印集合大小
 * <p>
 * Ø  使用迭代器遍历集合，并打印每个元素
 * <p>
 * Ø  使用增强for遍历集合，并打印每个元素
 * @params:
 * @return:
 * @author: ItAmao
 * @time: 2020/6/13 17:10
 */
public class Test {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        Collections.addAll(hs, "刘备", "关羽", "张飞", "刘备", "张飞");
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        Collections.addAll(lhs, "刘备", "关羽", "张飞", "刘备", "张飞");
        print1(hs);
        print2(hs);
        print1(lhs);
        print2(lhs);
    }

    public static void print1(Set<String> set) {
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String name = it.next();
            System.out.print(name + "   ");
        }
        System.out.println("");
        System.out.println("------------------");
    }

    public static void print2(Set<String> set) {
        for (String s : set) {
            System.out.print(s + "  ");
        }
        System.out.println("");
        System.out.println("------------------");
    }
}
