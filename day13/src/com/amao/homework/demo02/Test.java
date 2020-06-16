package com.amao.homework.demo02;

import java.util.HashMap;

/**
 * @description: 有以下字符串：
 * ​              String str = “fje你kw我FDQFj你feAF他Eajf他eo2FA我FEjfew”;
 * ​       请编程统计每个字符出现的次数
 * @params:
 * @return:
 * @author: ItAmao
 * @time: 2020/6/16 17:11
 */
public class Test {
    public static void main(String[] args) {
        HashMap<Character, Integer> hm = new HashMap<>();
        String str = "fje你kw我FDQFj你feAF他Eajf他eo2FA我FEjfew";
        hm = times(hm, str);
        System.out.println(hm);
    }

    public static HashMap<Character, Integer> times(HashMap<Character, Integer> hm, String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (hm.containsKey(c)) {
                hm.put(c, hm.get(c) + 1);
            } else {
                hm.put(c, 1);
            }
        }
        return hm;
    }
}
