package com.amao.demo14_接口作为成员变量;

public class StudentTest {
    public static void main(String[] args) {
        DoHomework doHomework1 = new DoHomework() {
            @Override
            public void doHomework() {
                System.out.println("阿毛写作业");
            }
        };
        Student stu1 = new Student("阿毛", 18, doHomework1);
        System.out.println(stu1);
        stu1.setDoHomework(doHomework1);
        stu1.getDoHomework().doHomework();

        Student stu2 = new Student("小毛", 19, new DoHomework() {
            @Override
            public void doHomework() {
                System.out.println("小毛写作业");
            }
        });

    }
}
