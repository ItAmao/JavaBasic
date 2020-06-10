package com.amao.demo06_包装类;

import sun.management.Agent;

public class Test {
    public static void main(String[] args) {
        //1.构造方法
        Integer i1 = new Integer(100);
        Integer i2 = new Integer("100");
        //true 重写了equals方法
        System.out.println(i1.equals(i2));
        //Integer类型只能比较 -128到127之间的数据。超过了这个值java会默认帮你new一个新的实例。
        // 这样的话==肯定时比较不出来的，只有用equals才能比较。
        //System.out.println(i1 == i2);//false 使用'=='而不是'equals（）'比较数字对象
        System.out.println(i1);
        System.out.println(i2);

        //2.静态方法
        Integer i3 = Integer.valueOf(3);
        Integer i4 = Integer.valueOf("3");
        //3.成员方法
        //取出Integer对象中的int值
        int i = i2.intValue();
        System.out.println(i);
        System.out.println(i3.intValue());

        //4.最后一个静态方法 字符串转基本类型
        int i5 = Integer.parseInt("12345");
        System.out.println(i5);

        //面试题
        //把基本类型 转 字符串类型
        //1
        int a = 100;
        String b = a + "";
        System.out.println(b);
        //2
        String c = String.valueOf(a);
        System.out.println(c);

        //3 先把字符串变成包装类
        String age = "18";
        Integer d = new Integer(age);
        int age1 = d;
        int age2 = Integer.parseInt(age);
        System.out.println(age1);
        System.out.println(age2);

    }
}
