package com.amao.demo4_this关键字;

/**
 * @Author：pengzhilin
 * @Date: 2020/6/1 9:37
 */
public class Test {
    public static void main(String[] args) {
        /*
            问题:set方法的形参名不符合规范,没有做到知名达意,怎么解决?
            解决方式:把形参名改成和属性名一致
            问题: set方法的形参修改为属性名后,发现没有给属性赋值,怎么解决?
            解决方式: 使用this关键字来区别同名的成员变量和局部\形参变量
            this关键字:
                1.使用格式:  this.成员变量名
                2.this表示当前对象
                    当前对象\this: 谁调用this所在的方法,谁就是当前对象\this
         */
        // 创建Student对象
        Student stu = new Student();

        // 给属性赋值
        stu.setName("张三");
        stu.setAge(18);

        // 获取属性的值
        System.out.println(stu.getName());// 张三
        System.out.println(stu.getAge());// 18

        Student stu2 = new Student();
        stu2.setName("李四");
        System.out.println(stu2.getName());// 李四
    }
}
