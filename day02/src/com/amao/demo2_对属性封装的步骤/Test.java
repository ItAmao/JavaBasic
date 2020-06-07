package com.amao.demo2_对属性封装的步骤;

public class Test {
    public static void main(String[] args) {
        /*
            - 为什么要对属性进行封装
                - 通过对象名直接访问成员变量的方式来对属性赋值,会存在数据安全隐患,应该怎么解决呢?
                - 解决方式: 不让外界直接访问成员变量(也就是要对属性进行封装)

            - 对属性封装的步骤
                1.使用private修饰属性,让外界不能直接访问属性
                2.对需要访问的成员变量,提供对应的getXxx方法(获取属性的值) 、setXxx 方法(给属性赋值)。
         */
        // 创建Student对象
        Student stu = new Student();

        // 对stu对象的name和age赋值
        stu.name = "张三";
        //stu.age = 18;
        //stu.age = -18;// 编译报错

        //System.out.println(stu.name+","+stu.age);// 张三,-18

    }
}
