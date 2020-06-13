package com.amao.homework.demo05;

import java.util.Collections;
import java.util.TreeSet;

/**
 * @description: 请按以下要求顺序编码：
 * Ø  定义一个可以存储“整数”的TreeSet对象
 * Ø  存储以下整数
 * 30,20,50,10,30,20
 * Ø  打印集合大小。为什么跟存入的数量不一致？
 * Ø  遍历集合，打印大于25的元素
 * @params:
 * @return:
 * @author: ItAmao
 * @time: 2020/6/13 17:26
 */
public class Test {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        Collections.addAll(ts, 30, 20, 50, 10, 30, 20);
        System.out.println(ts);//无序,无索引,不可重复
        for (Integer t : ts) {
            if (t > 25) {
                System.out.println(t+"  ");
            }
        }

    }
}
