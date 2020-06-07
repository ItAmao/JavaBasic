package com.amao.demo5_构造方法的概述和定义;

public class Test {
    public static void main(String[] args) {
        /*
            - 构造方法的概述: 构造方法是一种比较特殊的方法,用来创建对象并给对象的属性赋初始值
            - 构造方法的特点:
                1.构造方法没有返回值类型,连void都不能写
                2.构造方法的方法名就是类名
                3.构造方法的作用就是用来创建对象

            - 构造方法的定义:
                    无参构造方法:
                        public 类名(){

                        }

                    有参构造方法
                        public 类名(形参列表){
                            给属性赋值
                        }
            - 注意:
                1.如果一个类没有定义构造方法,系统会自动为该类生成一个空参构造方法
                2.构造方法可以重载
                3.如果定义了构造方法，系统将不再提供默认的构造方法
         */
        // 创建学生对象
        Student stu = new Student();// 调用空参构造方法创建对象
        Student stu2 = new Student("张三", 18);

        System.out.println(stu.name + "," + stu.age);// null,0
        System.out.println(stu2.name + "," + stu2.age);// 张三,18

        Student stu3 = new Student("李四");


    }
}
