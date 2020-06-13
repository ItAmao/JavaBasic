package com.amao.homework.demo03;

import java.util.HashSet;

/**
 * @description: 请按以下要求顺序编码：
 * l  定义学生类Student，属性：姓名、性别、年龄
 * l  定义测试类，及main()方法
 * Ø  定义一个存储Student类型的HashSet集合
 * Ø  创建以下三个Student对象
 * 张三,男,20
 * 李四,女,21
 * 张三,男,20
 * Ø  将上述三个对象存储到Set集合中
 * Ø  使用增强for遍历集合，获取每个Student对象，并打印属性值；
 * Ø  请实现集合中不能存储姓名年龄相同的元素
 * @params:
 * @return:
 * @author: ItAmao
 * @time: 2020/6/13 17:17
 */
public class Test {
    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<>();
        hs.add(new Student("张三", 20, "男"));
        hs.add(new Student("李四", 21, "女"));
        hs.add(new Student("张三", 20, "男"));
        System.out.println("-----没有重写HashCode和equals方法------");
        for (Student stu : hs) {
            System.out.println(stu);
            //Student{name='张三', age=20, gender='男'}
            //Student{name='李四', age=21, gender='女'}
            //Student{name='张三', age=20, gender='男'}
        }
        System.out.println("-----重写HashCode和equals方法------");
        for (Student stu : hs) {
            System.out.println(stu);
            //Student{name='李四', age=21, gender='女'}
            //Student{name='张三', age=20, gender='男'}
        }
    }
}
