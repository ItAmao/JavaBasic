package com.amao.demo06_Map集合练习;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @description: 输入一个字符串, 每个字符出现的个数
 * @params:
 * @return:
 * @author: ItAmao
 * @time: 2020/6/16 11:24
 */
public class Test {
    public static Map<Character, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String inputString = sc.nextLine();
        times(inputString);
    }

    public static void times(String inputString) {
        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "出现了" + entry.getValue() + "次");
        }
    }
}
