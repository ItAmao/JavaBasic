package com.amao.demo6_接口的定义;

/**
 * @Author：pengzhilin
 * @Date: 2020/6/4 10:51
 */
public interface IA {
    // 常量 默认修饰符 public static final  这三个修饰符可以省略
    public static final int NUM1 = 10;
    int NUM2 = 20;

    // 抽象方法 默认修饰符 public abstract 这2个修饰符可以省略
    public abstract void method1();
    void method2();

    // 默认方法 默认修饰符 public default public修饰符可以省略,default不可以省略
    public default void method3(){
        System.out.println("默认方法 method3");
    }

    default void method4(){
        System.out.println("默认方法 method4");
    }

    // 静态方法: public static修饰  static修饰符不可以省略 public可以省略
    public static void method5(){
        System.out.println("静态方法 method5");
    }

     // 私有静态方法 使用private static修饰  不可以省略
     private static void method6(){
        System.out.println("私有静态方法 method6");
    }

    // 私有非静态方法 使用private修饰
    private  void method7(){
        System.out.println("私有静态方法 method7");
    }
}
