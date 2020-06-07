package com.amao.demo2_对象的内存图;

/**
 * @Author：pengzhilin
 * @Date: 2020/6/2 9:16
 */
public class Test {
    public static void main(String[] args) {
        // 2个对象的内存图
        Student stu1 = new Student();
        Student stu2 = new Student("张三", 18);

        stu1.show();// null,0
        stu2.show();// 张三,18
    }
}
