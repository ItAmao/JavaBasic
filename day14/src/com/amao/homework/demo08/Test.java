package com.amao.homework.demo08;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
    public static Scanner sc = new Scanner(System.in);
    public static HashMap<Product, Integer> hm = new HashMap<>();
    public static Product p = new Product();

    public static void main(String[] args) {
        while (true) {
            System.out.println("请输入你要进行的操作:1.添加商品   2.查看购物车     3.退出");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addStore();
                    break;
                case 2:
                    lookCar();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("输入错误,请重新输入");
                    break;
            }
        }
    }

    public static void addStore() {
        System.out.println("请输入你要添加的店铺:");
        String store = sc.next();
        System.out.println("请输入你要添加的商品名称:");
        String name = sc.next();
        if (hm.containsKey(p)) {
            hm.put(p, hm.get(p) + 1);
        } else {
            hm.put(p, 1);
        }
    }

    public static void lookCar() {
        if (hm.size() == 0) {
            System.out.println("你购物车还是空的,请添加");
            return;
        }
        System.out.println("你的购物车信息如下:");
        for (Map.Entry<Product, Integer> entry : hm.entrySet()) {
            System.out.println("信息:" + entry.getKey() + "数量:" + entry.getValue());
        }
    }
}
