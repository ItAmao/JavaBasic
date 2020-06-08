package com.amao.demo07_ArrayList存储基本数据类型;

import java.util.ArrayList;

public class Test {
    /*
        集合中的泛型不能是基本类型,只能使用引用类型
        java为8种基本类型,提供了引用类型,我们一般称为基本类型的包装类,简称包装类
        byte        Byte
        short       Short
        char        Character
        int         Integer
        long        Long
        float       Float
        double      Double
        boolean     Boolean
     */
    public static void main(String[] args) {
        //需求: 使用集合保存基本类型的数据,并遍历打印到控制台
        //1.创建集合保存基本类型的数据
        ArrayList<Integer> arr = new ArrayList<Integer>();
        //2.添加数据
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        //3.遍历
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            System.out.println(num);
        }
//        System.out.println(arr);
//        arr.remove(2); //删除指定位置的元素
//        System.out.println(arr);
    }
}
