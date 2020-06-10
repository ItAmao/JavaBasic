package com.amao.demo09_普通类作为方法参数和返回值;

/**
 * @description:
 * @params:
 * @return:
 * @author: ItAmao
 * @time: 2020/6/10 15:48
 */
public class StudentTest {
    public static void main(String[] args) {
        //调用普通类作为方法的参数(创建学生对象,并传参)
        Student stu = new Student();
        show(stu);
        System.out.println("-----------------------");
        //return的是stu对象
        System.out.println(getNum().getName());
    }

    /**
     * 普通类作为方法的返回值
     */
    public static Student getNum() {
        //创建对象,给name赋值
        Student stu = new Student();
        stu.setName("阿毛");
        return stu;
    }

    /**
     * 普通类作为方法的参数
     */
    public static void show(Student stu) {
        System.out.println("普通类作为方法的参数:");
        stu.setName("阿毛");
        stu.setAge(18);
        System.out.println("姓名:" + stu.getName() + ",年龄:" + stu.getAge());
    }
}

