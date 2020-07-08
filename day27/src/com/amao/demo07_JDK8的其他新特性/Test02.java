package com.amao.demo07_JDK8的其他新特性;

import org.junit.Test;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * 基于非静态方法的引用
 *  @Author : ItAmao
 *  @Date   : 2020/7/8 20:32
 */
public class Test02 {
    @Test
    public void test1() {
        //1.创建集合
        ArrayList<String> arr = new ArrayList<>();
        arr.add("阿毛");
        arr.add("你好");
        arr.add("你真瘦");
        //2.获取Stream流对象
        Stream<String> stream = arr.stream();
        //1.匿名内部类
//        stream.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });
        //2.使用lambda
        //stream.forEach((s)->System.out.println(s));

        stream.forEach(System.out::println);
    }
}
