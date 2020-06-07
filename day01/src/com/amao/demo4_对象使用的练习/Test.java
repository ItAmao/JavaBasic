package com.amao.demo4_对象使用的练习;

/**
 * @Author：pengzhilin
 * @Date: 2020/5/31 11:05
 */
public class Test {
    public static void main(String[] args) {
        // 创建一个Student对象  类名 对象名 = new 类名();
        Student stu1 = new Student();

        // 使用Student对象访问成员变量  对象名.成员变量名
        System.out.println(stu1.name+","+stu1.age);// null,0

        stu1.name = "张三";// 把张三赋值给stu1对象的name成员变量
        stu1.age = 18;// 把18赋值给stu1对象的age成员变量

        System.out.println(stu1.name+","+stu1.age);// 张三,18

        System.out.println("+==============================");
        // 使用Student对象访问成员方法  对象名.成员方法名(实参);
        stu1.study();
        stu1.doHomeWork();
    }
}
