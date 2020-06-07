package com.amao.demo7_多个变量指向相同对象内存图;

/**
 * @Author：pengzhilin
 * @Date: 2020/5/31 14:01
 */
public class Test {
    public static void main(String[] args) {
        // 创建Student对象
        Student stu1 = new Student();

        // 使用对象访问成员变量
        System.out.println(stu1.name + "," + stu1.age);// null,0

        stu1.name = "张三";
        stu1.age = 18;

        System.out.println(stu1.name + "," + stu1.age);// 张三,18

        // 使用对象访问成员方法
        stu1.study();

        System.out.println("=================================");
        // 创建Student对象
        Student stu2 = stu1;

        // 使用对象访问成员变量
        System.out.println(stu2.name + "," + stu2.age);// 张三,18

        stu2.name = "李四";
        stu2.age = 19;
        System.out.println(stu2.name + "," + stu2.age);// 李四,19
        System.out.println(stu1.name + "," + stu1.age);// 李四,19

        // 使用对象访问成员方法
        stu2.study();

    }
}
