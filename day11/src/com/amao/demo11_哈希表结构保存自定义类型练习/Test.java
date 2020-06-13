package com.amao.demo11_哈希表结构保存自定义类型练习;

import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        System.out.println("-----没有重写HashCode和equals方法-----");
        HashSet<Student1> hs1 = new HashSet<>();
        hs1.add(new Student1("阿毛", 18, 176.3));
        hs1.add(new Student1("阿毛", 18, 176.3));
        hs1.add(new Student1("1毛", 19, 177.3));
        hs1.add(new Student1("2毛", 20, 178.3));
        hs1.add(new Student1("3毛", 21, 179.3));
        for (Student1 stu1 : hs1) {
            System.out.println(stu1);
        }
        System.out.println("-----重写HashCode和equals方法-----");
        HashSet<Student2> hs2 = new HashSet<>();
        hs2.add(new Student2("阿毛", 18, 176.3));
        hs2.add(new Student2("阿毛", 18, 176.3));
        hs2.add(new Student2("阿毛", 19, 177.3));
        hs2.add(new Student2("2毛", 20, 178.3));
        hs2.add(new Student2("3毛", 21, 179.3));
        for (Student2 stu2 : hs2) {
            System.out.println(stu2);
        }
        //总结,重写了HashCode和equals方法之后,不能存入全部都相同的元素
    }
}
