package com.amao.demo02_Iterator迭代器;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @description:Iterator迭代器的实现
 * @params:
 * @return:
 * @author: ItAmao
 * @time: 2020/6/12 10:11
 */
public class Test {
    public static void main(String[] args) {
        //1.创建集合
        ArrayList<String> arr = new ArrayList<>();
        //2.添加元素
        arr.add("1毛");
        arr.add("2毛");
        arr.add("3毛");
        arr.add("4毛");
        arr.add("5毛");
        arr.add("6毛");
        //3.遍历(使用迭代器遍历)
        //4.获取集合的迭代器
        Iterator<String> it = arr.iterator();
        //remove方法
        while (it.hasNext()) {
            it.next();
            it.remove();
            System.out.println(arr);
        }
        //5.先判断
        //       boolean isEmpty = it.hasNext();
//        if (isEmpty) {
//            //输出
//            String next=it.next();
//            System.out.println(next);
//        }
        //判断+循环
//        while (it.hasNext()) {
//            String next = it.next();
//            System.out.println(next);
//        }
        //没有下一个元素的话 就会抛出异常:NoSuchElementException(没有这样的元素异常)
        //Exception in thread "main" java.util.NoSuchElementException


        //需求:如果发现有一个4毛元素,那么像集合中添加一个"阿毛"元素
//        while (it.hasNext()) {
//            String next = it.next();
//            System.out.println(next);
//            if (next.equals("4毛")) {
//                arr.add("阿毛");
//            }
//        }
//        //当使用迭代器遍历集合的过程中,是不允许直接向集合中添加或者删除元素的
//        // ConcurrentModificationException(并发修改异常)
//        //Exception in thread "main" java.util.ConcurrentModificationException


    }
}
