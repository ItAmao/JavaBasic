package com.amao.homework.demo06;

import sun.print.SunMinMaxPage;

import java.util.HashMap;
import java.util.Random;

/**
 * @description: 3.2 双色球规则，双色球每注投注号码由6个1—33的号码和1个1—16的号码组成。
 * 其中6个1-33的数字要求不能重复。请随机生成一注双色球号码。
 * @params:
 * @return:
 * @author: ItAmao
 * @time: 2020/6/16 17:27
 */
public class Test {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm = randomlyGenerated(hm);
        System.out.print("双色球号码为:   ");
        for (Integer integer : hm.keySet()) {
            System.out.print(hm.get(integer) + "  ");
        }

    }

    public static HashMap<Integer, Integer> randomlyGenerated(HashMap<Integer, Integer> hm) {
        Random r = new Random();
        int index = 0;
        for (int i = 0; hm.size() <= 6; i++) {
            int num1 = r.nextInt(33) + 1;
            if (hm.containsKey(num1)) {
                continue;
            } else {
                hm.put(index, num1);
                index++;
            }
        }
        int num2 = r.nextInt(16) + 1;
        hm.put(++index, num2);
        return hm;
    }
}
