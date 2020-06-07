package com.amao.demo5_单个对象的内存图;

/**
 * @Author：pengzhilin
 * @Date: 2020/5/31 11:23
 * 类的定义
 * 对象的使用
 * 方法的定义
 * 方法的调用
 */
public class Test {
    public static void main(String[] args) {
        // 单个对象的内存图
        // 创建Student对象
        Student stu1 = new Student();

        // 打印stu1对象
        System.out.println(stu1);// 地址值

        // 使用stu1对象访问成员变量
        // 取对象的属性值
        System.out.println(stu1.name+","+stu1.age);// null,0
        // 给对象的属性赋值
        stu1.name = "张三";
        stu1.age = 18;
        // 取对象的属性值
        System.out.println(stu1.name+","+stu1.age);// 张三,18

        System.out.println("========================");
        // 使用stu1对象访问成员方法
        stu1.study();
        stu1.doHomeWork();
    }
}
