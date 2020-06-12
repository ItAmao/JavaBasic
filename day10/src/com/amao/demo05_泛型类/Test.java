package com.amao.demo05_泛型类;

/**
 * @description:泛型类的实现
 * @params:
 * @return:
 * @author: ItAmao
 * @time: 2020/6/12 16:39
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("-----创建对象不定义泛型-----");
        Student stu1 = new Student();
        stu1.setName("阿毛");
        stu1.setAge(18);
        System.out.println(stu1.getName() + ", " + stu1.getAge());
        System.out.println("-----创建对象定义字符串泛型-----");
        Student<String> stu2 = new Student<>();
        stu2.setName("阿毛");
        //stu2.setAge(18); 编译报错,因为定义了泛型为String类型,只能传字符串参数
        stu2.setAge("18");
        System.out.println(stu1.getName() + ", " + stu1.getAge());
        System.out.println("-----创建对象定义整数泛型-----");
        Student<Integer> stu3 = new Student<>();
        //stu3.setName("阿毛"); 编译报错,因为定义了泛型为int类型,只能传int参数
        stu3.setName(18);
        stu3.setAge(18);
        System.out.println(stu1.getName() + ", " + stu1.getAge());
    }
}
