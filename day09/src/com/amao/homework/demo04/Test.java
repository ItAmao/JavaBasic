package com.amao.homework.demo04;

import java.util.Scanner;

/**
 * @description: 请从控制台接收一个整数的“分数”值，要求用String类型的变量存储，
 * 程序可以将这个String类型的分数值转换为int值，并将分数 + 5分后打印到控制台。
 * @params:
 * @return:
 * @author: ItAmao
 * @time: 2020/6/10 17:37
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请从控制台接收一个整数的“分数”值:");
        String score = scanner.next();
        Integer scores = new Integer(score);
        int a = scores; //自动拆箱
        System.out.println(a + 5);
    }
}
