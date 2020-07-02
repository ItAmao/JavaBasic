package com.amao.demo8_接口中成员的访问特点;

/**
 * @Author：pengzhilin
 * @Date: 2020/6/4 11:17
 */
interface IA{
    // 常量
    public static final int NUM = 10;

    // 抽象方法
    public abstract void method1();

    // 默认方法
    public default void method2(){
        System.out.println("接口中的默认方法method2");

       // method4();
       // method5();
    }

    // 静态方法
    public static void method3(){
        System.out.println("接口中的静态方法method3");
       // method5();
    }

    // 私有方法
//     void method4(){
//
//    }

    static void method5(){

    }
}

class Imp implements IA{

    @Override
    public void method1() {
        System.out.println("重写接口中的method1方法");
    }

    @Override
    public void method2() {
        System.out.println("实现类重写接口中的默认方法method2");
    }
}

abstract class Imp2 implements IA{

}

public class Test {
    public static void main(String[] args) {
        /*
            接口中成员的访问特点:
                接口中常量: 主要接口名直接使用\访问(推荐), 当然也可以通过实现类对象直接访问(不推荐)
                接口中抽象方法: 用来强制实现类重写的,当然如果实现类是抽象类,可以不重写
                接口中默认方法: 供实现类对象直接调用或者实现类重写
                接口中静态方法: 只能供接口名直接调用
                接口中私有方法: 只能在接口中访问
         */
        // 使用接口名直接访问
        System.out.println(IA.NUM);// 10

        // 创建实现类对象
        Imp imp = new Imp();
        System.out.println(imp.NUM);// 10

        // 实现类对象调用重写的method1方法
        imp.method1();

        // 实现类对象调用接口中的默认方法
        imp.method2();

        // 实现类对象调用接口中的静态方法
        //imp.method3();// 编译报错,不能调用
        IA.method3();// 接口名直接访问
    }
}
