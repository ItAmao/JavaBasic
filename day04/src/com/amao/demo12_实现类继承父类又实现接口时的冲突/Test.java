package com.amao.demo12_实现类继承父类又实现接口时的冲突;

/**
 * @Author：pengzhilin
 * @Date: 2020/6/4 14:11
 */
/*class Fu{
    // 常量
    public static final int A = 10;
}

interface IA{
    // 常量
    public static final int A = 10;
}

class Zi extends Fu implements IA{// A常量没有继承过来
    // 继承的同时又实现接口

}*/

/*abstract class Fu{
    // 抽象方法
    public abstract void method1();
}

interface IA{
    // 抽象方法
    public abstract void method1();
}

// 继承的同时又实现接口
class Zi extends Fu implements IA{// 必须重写一次
    @Override
    public void method1() {

    }
}*/


/* class Fu{
    // 默认方法
    public void method2(){
         System.out.println("Fu 类中的默认方法method2");
    }
}

interface IA{
    // 默认方法
    public default void method2(){
        System.out.println("IA 接口中的默认方法method2");
    }
}

// 继承的同时又实现接口
class Zi extends Fu implements IA{

}*/

class Fu{
    // 静态方法
    public static void method3(){
        System.out.println("Fu 类中的静态方法method3");
    }
}

interface IA{
    // 静态方法
    public static void method3(){
        System.out.println("IA 接口中的静态方法method3");
    }
}

// 继承的同时又实现接口
class Zi extends Fu implements IA{

}

public class Test {
    public static void main(String[] args) {
        /*
            类可以继承的同时又实现接口:
                public class 类名 extends 父类名 implements 接口1,接口2,接口3,...{

                }

            实现类继承父类又实现接口时的冲突:
                常量: 父类和父接口中有相同的常量,那么子类无法继承,也就无法使用
                抽象方法: 父类和父接口中有相同的抽象方法,那么子类可以继承,必须重写一次
                默认方法: 父类和父接口中有相同的默认方法,那么子类优先使用父类的
                静态方法: 父类和父接口中有相同的静态方法,那么子类使用的是父类的,因为父类的静态方法可以继承,而父接口中的静态方法不可以继承
                私有方法:  父类和父接口中有相同的私有方法,没有影响
         */
        //System.out.println(Zi.A);// 编译报错
        Zi zi = new Zi();
        //zi.method2();// Fu 类中的默认方法method2
        zi.method3();
    }
}
