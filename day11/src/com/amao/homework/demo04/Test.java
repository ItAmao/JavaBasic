package com.amao.homework.demo04;

import java.util.Collections;
import java.util.LinkedHashSet;

/**
 * @description: 请按以下要求顺序编码：
 * <p>
 * Ø  定义一个可以存储“整数”的LinkedHashSet对象
 * <p>
 * Ø  存储以下整数
 * <p>
 * 20,30,50,10,30,20
 * <p>
 * Ø  打印集合大小。为什么跟存入的数量不一致？
 * <p>
 * Ø  使用增强for遍历集合，打印大于25的元素
 * @params:
 * @return:
 * @author: ItAmao
 * @time: 2020/6/13 17:22
 */
public class Test {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        Collections.addAll(lhs, 20, 30, 50, 10, 30, 20);
        System.out.println(lhs); //有序,无索引,不可重复
        for (Integer lh : lhs) {
            if (lh > 25) {
                System.out.print(lh + "   ");
            }
        }
    }
}
