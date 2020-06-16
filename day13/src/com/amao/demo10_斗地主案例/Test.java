package com.amao.demo10_斗地主案例;

import java.util.*;

/**
 * @description: 斗地主案例
 * @params:
 * @return:
 * @author: ItAmao
 * @time: 2020/6/16 16:23
 */
public class Test {
    public static HashMap<Integer, String> hm = new HashMap<>();
    public static ArrayList<Integer> arr = new ArrayList<>();

    public static void main(String[] args) {
        //1.生成牌
        HashMap<Integer, String> generateCards = generateCards(hm);
        //2.洗牌
        ArrayList<Integer> shuffle = shuffle(generateCards);
        //3.发牌
        deal(shuffle);

    }

    /**
     * 实现抢地主
     */
    public static ArrayList<Integer> landGrab(ArrayList<Integer> arr, ArrayList<Integer> holeCard) {
        for (int i = 0; i < holeCard.size(); i++) {
            arr.add(holeCard.get(i));
        }
        return arr;
    }

    /**
     * 看牌
     */
    public static void cardReading(String name, ArrayList<Integer> arr, HashMap<Integer, String> hm) {
        //玩家的发牌顺序从大到小排列,方便用户
        Collections.sort(arr);
        if (arr.size() > 17) {
            System.out.println("地主:" + name);
        } else {
            System.out.println("农民:" + name);
        }
        for (Integer integer : arr) {
            String cards = hm.get(integer);
            System.out.print(cards + " ");
        }
        System.out.println("");
        System.out.println("--------------------");
    }

    /**
     * 发牌
     */
    public static void deal(ArrayList<Integer> shuffle) {
        ArrayList<Integer> play1 = new ArrayList<>();
        ArrayList<Integer> play2 = new ArrayList<>();
        ArrayList<Integer> play3 = new ArrayList<>();
        ArrayList<Integer> holeCard = new ArrayList<>();
        //int count = 0;
        for (int i = 0; i < shuffle.size(); i++) {
            //count++;
            //0-53 随机数
            Integer num = shuffle.get(i);
            //51 52 53 底牌
            if (i >= 51) {
                //把底牌存进去
                holeCard.add(i);
            } else if (i % 3 == 0) {
                play1.add(i);
            } else if (i % 3 == 1) {
                play2.add(i);
            } else if (i % 3 == 2) {
                play3.add(i);
            }
        }
        //打乱顺序
        Collections.shuffle(play1);
        Collections.shuffle(play2);
        Collections.shuffle(play3);
        Random random = new Random();
        //随机生成1-3的数
        int r = random.nextInt(3) + 1;
        //System.out.println(r);
        System.out.println(r + "号成功抢地主");
        System.out.println("");
        if (r == 1) {
            play1 = landGrab(play1, holeCard);
        } else if (r == 2) {
            play2 = landGrab(play2, holeCard);
        } else if (r == 3) {
            play3 = landGrab(play3, holeCard);
        }
        cardReading("高阔", play1, hm);
        cardReading("陈东宇", play2, hm);
        cardReading("闫海权", play3, hm);
        //System.out.println(count);
    }

    /**
     * 生成 符号+牌号方法
     */
    public static HashMap<Integer, String> generateCards(HashMap<Integer, String> hm) {
        //定义颜色
        String[] colors = {"♥", "♠", "♦", "♣"};
        //定义牌号
        String[] cardNums = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        //先放入大小王
        hm.put(0, "大王");
        hm.put(1, "小王");
        //记录hm中的位置
        int index = 2;
        //遍历数组
        for (String cardNum : cardNums) {
            for (String color : colors) {
                //拼接字符串
                String newCard = color + cardNum;
                hm.put(index, newCard);
                index++;
            }
        }
        return hm;
    }

    /**
     * 洗牌阶段
     */
    public static ArrayList<Integer> shuffle(HashMap<Integer, String> hm) {
        for (Map.Entry<Integer, String> entry : hm.entrySet()) {
            arr.add(entry.getKey());
        }
        //打乱顺序
        Collections.shuffle(arr);
        return arr;
    }
}
