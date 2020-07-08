package com.amao.demo03_多例设计模式;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Random;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/7/7 09:46
 */
class AAA {

    private AAA() {
    }

    private static ArrayList<AAA> list = new ArrayList<>();

    static {
        for (int i = 0; i < 3; i++) {
            AAA a = new AAA();
            list.add(a);
        }
    }

    public static AAA getInstance() {
        //随机从集合中取出一个去使用
        Random r = new Random();
        int num = r.nextInt(list.size());
        return list.get(num);
    }
}

public class Test01 {
    @Test
    public void test1() {
        for (int i = 0; i < 10; i++) {
            AAA a1 = AAA.getInstance();
            System.out.println(a1);
        }
    }
}
