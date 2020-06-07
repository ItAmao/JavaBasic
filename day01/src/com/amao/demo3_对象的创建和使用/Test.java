package com.amao.demo3_对象的创建和使用;

import com.amao.demo2_类的定义.Phone;

public class Test { //用来执行程序的
    // 程序的入口main方法
    public static void main(String[] args) {
        /*
            对象的创建:  类名 对象名 = new 类名();
            对象的使用:
                对象访问成员变量: 对象名.成员变量名
                    获取成员变量的值: 对象名.成员变量名
                    给成员变量赋值: 对象名.成员变量名 = 值;

                对象访问成员方法:  对象名.成员方法名(实参);


            结论: 成员变量有默认值
                整数类型: 默认值是0
                浮点类型: 默认值是0.0
                布尔类型: 默认值是false
                字符类型: 默认值是不可见字符  '\u0000'
                引用数据类型:默认值是 null
         */
        // 创建一个Phone对象
        Phone p1 = new Phone();

        // 使用p1对象访问成员变量
        // 获取成员变量的值:
        System.out.println(p1.brand);// null
        System.out.println(p1.price);// 0

        // 给成员变量赋值
        p1.brand = "华为";
        p1.price = 1999;

        System.out.println(p1.brand);// 华为
        System.out.println(p1.price);// 1999

        String str = p1.brand;
        System.out.println(str);// 华为

        System.out.println("======================================");
        // 使用p1对象访问成员方法
        p1.call("10086");
        p1.sendMessage("10086", "请问一下联通的客服电话号码是多少?");

    }

    // 对象的创建
    private static void method01() {
        // 创建Phone类的对象
        Phone p1 = new Phone();// p1对象
        Phone p2 = new Phone();// p2对象

        // 创建Student类的对象
        Student stu1 = new Student();// stu1对象
        Student stu2 = new Student();// stu2对象

        // 复盘之前的结论: 对象是根据类来创建的,类是对象的数据类型(引用数据类型)
        // 新的结论: 对象和对象之间是相互独立的
        // 新的结论: 一个类可以创建多个对象
    }
}
