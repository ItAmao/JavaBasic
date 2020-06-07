package com.amao.demo11_接口多继承几种冲突情况;

/**
 * @Author：pengzhilin
 * @Date: 2020/6/4 11:52
 */
/*interface A{
    // 常量
    public static final int A = 10;
}
interface B{
    // 常量
    public static final int A = 10;
}

interface C extends A,B{

}*/

/*interface A{
    // 抽象方法
    public abstract void method1();
}
interface B{
    // 抽象方法
    public abstract void method1();
}

interface C extends A,B{// 只会继承一个抽象方法

}

class Imp implements C{

    @Override
    public void method1() {

    }
}*/

/*interface A{
    // 默认方法
    public default void method2(){
        System.out.println("A 接口默认方法method2");
    }
}
interface B{
    // 默认方法
    public default void method2(){
        System.out.println("B 接口默认方法method2");
    }
}

interface C extends A,B{ // 必须重写,加上default

    @Override
    public default void method2() {

    }
}

class Imp implements C{// 可以不重写默认方法,也可以重写


}*/

interface A{
    // 静态方法
    public static void method3(){
        System.out.println("A 接口静态方法method3");
    }
}
interface B{
    // 静态方法
    public static void method3(){
        System.out.println("B 接口静态方法method3");
    }
}

interface C extends A,B{

}

public class Test {
    public static void main(String[] args) {
        /*
            接口多继承几种冲突情况:
                常量: 多个父接口中有相同的常量,子接口无法继承,也就无法使用
                抽象方法: 多个父接口中有相同的抽象方法,子接口只会继承一个抽象方法
                默认方法: 多个父接口中有相同的默认方法,子接口必须重写一次,而且重写的方法要加default
                静态方法: 多个父接口中有相同的静态方法,子类无须重写,因为静态方法是直接属于某个接口,不能被继承
                私有方法: 多个父接口中有相同的静态方法,子类无须重写,因为私有方法只能在本接口中使用

            对比:
                实现类重写接口中的默认方法,不需要加default
                接口重写父接口中的默认方法,必须加default
         */
        //System.out.println(C.A);// 编译报错
        //C.method3();// 编译报错
    }
}
