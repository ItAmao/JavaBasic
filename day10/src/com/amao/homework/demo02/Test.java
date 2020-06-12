package com.amao.homework.demo02;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @description: ​    请定义一个Collection类型的集合，存储以下分数信息：
 * <p>
 * ​              88.5,39.2,77.1,56.8,89,99,59.5
 * <p>
 * 请编程实现以下功能：
 * <p>
 * Ø  使用增强for遍历所有元素，并打印
 * <p>
 * Ø  使用增强for遍历所有元素，打印不及格的分数；
 * <p>
 * Ø  使用增强for遍历所有元素，计算不及格的分数的数量，和所有分数的平均分，并打印计算结果。
 * <p>
 * Ø  使用增强for遍历所有元素，求出最高分，并打印；
 * <p>
 * (注意：以上所有功能写在一个main()方法中，但请单独实现)
 * @params:
 * @return:
 * @author: ItAmao
 * @time: 2020/6/12 17:37
 */
public class Test {
    public static void main(String[] args) {
        Collection<Double> col = new ArrayList<>();
        double[] arr = {88.5, 39.2, 77.1, 56.8, 89, 99, 59.5};
        for (int i = 0; i < arr.length; i++) {
            col.add(arr[i]);
        }
        System.out.println("使用增强for遍历所有元素，并打印");
        print1(col);
        System.out.println("使用增强for遍历所有元素，打印不及格的分数；");
        print2(col);
        System.out.println("使用增强for遍历所有元素，计算不及格的分数的数量，和所有分数的平均分，并打印计算结果。");
        print3(col);
        System.out.println("使用增强for遍历所有元素，求出最高分，并打印；");
        print4(col);
    }

    /**
     * 使用增强for遍历所有元素，求出最高分，并打印；
     */
    public static void print4(Collection<Double> col) {
        double temp = 0;
        for (double score : col) {
            if (temp < score) {
                temp = score;
            } else {
                continue;
            }
        }
        System.out.println("最高分:" + temp);
        System.out.println("");
        System.out.println("----------");
    }

    /**
     * 使用增强for遍历所有元素，计算不及格的分数的数量，和所有分数的平均分，并打印计算结果。
     */
    public static void print3(Collection<Double> col) {
        double sum = 0;
        int num = 0;
        int count = 0;
        for (Double score : col) {
            sum += score;
            count++;
            if (score < 60) {
                num++;
            }
        }
        BigDecimal b = new BigDecimal(sum);
        BigDecimal c = new BigDecimal(count);
        //scale是保留的小数位数 ,第三个是取舍模式 四舍五入
        BigDecimal avg = b.divide(c, 2, RoundingMode.HALF_UP);
        System.out.println("不及格的分数的数量:" + num);
        System.out.println("所有分数的平均分" + avg);
        System.out.println("");
        System.out.println("----------");
    }

    /**
     * 使用增强for遍历所有元素，打印不及格的分数；
     */
    public static void print2(Collection<Double> col) {
        for (double score : col) {
            if (score < 60) {
                System.out.print(score + "  ");
            }
        }
        System.out.println("");
        System.out.println("----------");
    }

    /**
     * 使用增强for遍历所有元素，并打印
     */
    public static void print1(Collection<Double> col) {
        for (double score : col) {
            System.out.print(score + "  ");
        }
        System.out.println("");
        System.out.println("----------");
    }
}
