package com.amao.demo6_标准的类;

/**
 * @Author：pengzhilin
 * @Date: 2020/6/1 11:51
 */
public class Test {
    public static void main(String[] args) {
        // 需求:要求分别使用空参和有参构造方法创建对象，空参创建的对象通过setXxx赋值，有参创建的对象直接赋值，并通过show方法展示数据。
        // 使用空参构造方法创建对象
        Student stu1 = new Student();

        // 使用有参构造方法创建对象
        Student stu2 = new Student("张三",18);

        // 使用stu1和stu2调用show方法打印各自属性的值
        stu1.show();// null,0
        stu2.show();// 张三,18

        // 空参创建的对象只能通过setXxx赋值
        stu1.setName("李四");
        stu1.setAge(19);
        stu1.show();// 李四,19

    }
}
