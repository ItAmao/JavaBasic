package com.amao.demo13_抽象类作为成员变量;

public class StudentTest {
    public static void main(String[] args) {
        //先重写课程的抽象方法,在创建学生对象
        Course course = new Course() {
            @Override
            public void goToClass() {
                System.out.println("去上java课");
            }
        };
        Student stu1 = new Student("阿毛", 18, "男", course);
        //第二种方法,使用匿名内部类重写方法
        Student stu2 = new Student("小毛", 19, "男", new Course() {
            @Override
            public void goToClass() {
                System.out.println("去上Python课");
            }
        });
        //这两种方法打印出来的都是 course这个对象的地址
        System.out.println(stu1);
        System.out.println(stu2);
        System.out.println("----------------------");
        Student stu3 = new Student();
        Course course1 = new Course() {
            @Override
            public void goToClass() {
                System.out.println("去上c语言");
            }
        };
        stu3.setCourse(course1);
        //需要调用goToClass方法才能打印出重写的方法内容
        stu3.getCourse().goToClass();

    }
}
