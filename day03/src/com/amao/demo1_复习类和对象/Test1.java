package com.amao.demo1_复习类和对象;

public class Test1 {
    public static void main(String[] args) {
        // 创建对象并使用对象
        Student stu1 = new Student();
        stu1.show();// null,0

        Student stu2 = new Student("张三", 18);
        stu2.show();// 张三,18

        // 给stu1对象的属性赋值
        stu1.setName("李四");
        stu1.setAge(19);
        stu1.show();// 李四,19

        // 修改stu2对象的属性值
        stu2.setAge(20);
        stu2.show();// 张三,20

        // set方法是用来给属性赋值,可以反复赋值
        // 有参构造方法是用来创建对象,并给对象的属性赋初始值(只能赋值一次)
    }
}
