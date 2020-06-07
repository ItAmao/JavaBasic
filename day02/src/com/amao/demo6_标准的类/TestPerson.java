package com.amao.demo6_标准的类;

/**
 * @Author：pengzhilin
 * @Date: 2020/6/1 14:04
 */
public class TestPerson {
    public static void main(String[] args) {
        // 调用满参构造方法创建Person对象
        Person p1 = new Person("张三",19,true);

        Person p2 = new Person("张三",19,true);

        // 凡是new就会新创建一个对象,p1和p2是2个不同的对象

        // 构造方法: 创建对象,并给对象的属性赋初始值
        // set方法: 给属性赋值,可以重复赋值的
        p1.setAge(20);
        p1.setAge(21);
    }
}
