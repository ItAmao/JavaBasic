package com.amao.demo06_泛型方法;

public class Test {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.<String>doHomework("阿毛");
        stu.<Integer>doHomework(18);
        stu.<Double>doHomework(3.14);
    }
}
