package com.amao.demo2_static修饰成员变量;

/**
 * @Author：pengzhilin
 * @Date: 2020/6/4 9:32
 */
public class Test {
    public static void main(String[] args) {
        /*
            - static关键字概述: static是一个关键字,表示静态的意思,可以用来修饰成员变量,成员方法,代码块
            - static关键字的使用:
                修饰成员变量:
                    格式: static 数据类型 变量名;
                    特点: 被static修饰的成员变量会变成静态变量(类变量),该静态变量的值会被该类的所有对象共享,也就是说该类的
                          所有对象使用的是同一个变量值
                    访问方式:
                         对象名.静态成员变量名
                         类名.静态成员变量名     推荐
         */
        // 创建ChinesePeople对象
        ChinesePeople p1 = new ChinesePeople();
        p1.name = "张三";
        p1.country = "中国";
        System.out.println("姓名:" + p1.name + ",国籍:" + p1.country);// 姓名:张三,国籍:中国

        // 创建ChinesePeople对象
        ChinesePeople p2 = new ChinesePeople();
        System.out.println("姓名:" + p2.name + ",国籍:" + p2.country);// null,中国

        // 通过类名直接访问
        System.out.println(ChinesePeople.country);

        ChinesePeople.country = "中华人民共和国";
        System.out.println(p1.country);// 中华人民共和国
        System.out.println(p2.country);// 中华人民共和国
        System.out.println(ChinesePeople.country);// 中华人民共和国
    }
}
