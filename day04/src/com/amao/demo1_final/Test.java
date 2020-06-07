package com.amao.demo1_final;

/**
 * @Author：pengzhilin
 * @Date: 2020/6/3 20:34
 */
public class Test {

    public static void main(String[] args) {
        /*
            - final关键字的概述: final是一个关键字,表示不可变的意思,可以用来修饰类,方法,变量.
            - final关键字的使用:
                修饰类:
                    格式: public final class 类名{}
                    特点: 被final修饰的类不能被继承
                修饰方法:
                    格式: 修饰符 final 返回值类型 方法名(形参列表){}
                    特点: 被final修饰的方法不能被子类重写
                修饰变量:
                    修饰局部变量:
                        基本类型局部变量:
                            格式: final 数据类型 变量名 = 值;

                        引用类型局部变量:
                            格式: final 数据类型 变量名 = 值;

                    修饰成员变量:
                        直接赋值方式: final 数据类型 变量名 = 值;
                        构造方法方式: 必须保证所有构造方法都可以给final修饰的变量赋值,并且只赋值一次

                    特点:
                        1.被final修饰的变量,只能赋值一次,不能重复赋值
                        2.被final修饰的变量就会变成常量,常量名的书写规范是所有字母大写
         */
        // final修饰基本类型局部变量:
        final int NUM = 10;
        // NUM = 20;// 编译报错,因为final修饰的变量只能赋值一次

        final int NUM2;
        NUM2 = 10;// 第一次赋值
        //NUM2 = 20;// 编译报错,因为final修饰的变量只能赋值一次

        // final修饰引用类型局部变量:
        final Student stu1 = new Student("张三");
        // stu1 = new Student("李四");// 编译报错,因为final修饰的变量只能赋值一次
        // final修饰的对象中的属性是可以重复赋值的
        stu1.name = "李四";

    }

}
