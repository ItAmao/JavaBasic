package com.amao.demo4_static修饰代码块;

/**
 * @Author：pengzhilin
 * @Date: 2020/6/4 10:25
 */
public class Test {

    static {
        System.out.println("Test 静态代码块");
    }

    public static void main(String[] args) {
        /*
            static修饰代码块:
                格式:
                    static{

                    }
               特点:
                 位置: 定义在类中,方法外
                 执行: 随着类的加载而执行,并且只执行一次
                 特点:
                    1.优先于构造方法的执行
                    2.main方法所在的类如果有静态代码块,那么该静态代码块优先于main 方法的执行
         */
        System.out.println("main");
        Person p1 = new Person();
        Person p2 = new Person();
    }

}
