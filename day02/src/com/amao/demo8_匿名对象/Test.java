package com.amao.demo8_匿名对象;

public class Test {
    public static void main(String[] args) {
        /*
            - 匿名对象的概述: 其实就是没有名字的对象
            - 使用匿名对象: 只能使用一次
            - 使用场景:
                作为方法的实参传入
                作为方法的返回值返回
         */
        // 创建Student对象,取名为stu1
        Student stu1 = new Student("张三", 19);// 有名字的对象,名字为:stu1
        stu1.show();// 张三,19

        // 创建Student对象,不取名
        new Student("李四", 19);// 匿名对象
        new Student("李四", 19).show();
        // 以上2个对象不是同一个对象,因为但凡是new就会新建一个对象


        // 调用method1方法,就需要传入一个Student对象
        // Student stu2 = new Student("王五",20);
        // method1(stu2);

        method1(new Student("王五", 20));

    }

    public static void method1(Student stu) {
        stu.setAge(21);
    }

    public static Student method2() {
        //Student stu2 = new Student("王五",20);
        //return stu2;
        return new Student("王五", 20);
    }
}
