package com.amao.demo1_private关键字;


public class Test {
    public static void main(String[] args) {
        /*
            private关键字:
                - private的含义: private是一个权限修饰符,表示最小的权限
                - private的使用: 修饰成员变量和成员方法
                        修饰成员变量的格式:  private 数据类型 变量名;
                        修饰成员方法的格式:  private 返回值类型 方法名(参数列表){...}

                - 特点: 被private修饰的成员变量或者成员方法,只能在本类中访问
                - 案例
         */
        // 创建Student对象
        Student stu = new Student();

        // 访问成员变量
        //System.out.println(stu.name);// 编译报错,name使用了private修饰,所以在这没有访问权限
        System.out.println(stu.age);

        // 访问成员方法
        stu.study();
        //stu.doHomeWork();// 编译报错,doHomeWork方法使用了private修饰,所以在这没有访问权限

        stu.show();
    }

    public static void method() {

    }
}
