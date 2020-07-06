package com.amao.demo04_动态代理;

import java.util.ArrayList;
import java.util.List;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/7/5 21:17
 */
public class MyCollectionsTest {
    public static void main(String[] args) {
        //创建集合
        ArrayList<String> list = new ArrayList<>();
        //添加
        list.add("石原里美");
        list.add("王众");
        list.add("王宝强");

        //list是被代理对象
        //list2是代理对象
        //被代理对象和代理对象像一对儿孪生兄弟
        //工具类这个方法返回的代理对象不能调用增删改方法
        //List<String> list2 = Collections.unmodifiableList(list);
        List<String> m1 = MyCollections.method(list);
        String s = m1.get(2);
        System.out.println(s);
        m1.remove(2);
        System.out.println(m1);
    }
}
