package com.amao.demo9_多实现时的几种冲突情况;

/**
 * @Author：pengzhilin
 * @Date: 2020/6/4 11:33
 */
/*interface IA{
    // 常量
    public static final int A = 10;
    public static final int B = 20;
}
interface IB{
    // 常量
    public static final int A = 10;
}

class Imp implements IA,IB{// A常量没有继承过来

}*/
/*interface IA{
    // 抽象方法
    public abstract void method1();
}
interface IB{
    // 抽象方法
    public abstract void method1();
}

class Imp implements IA,IB{// 实现类重写一次即可
    @Override
    public void method1() {
        System.out.println("重写method1方法");
    }

}*/

/*interface IA{
    // 默认方法
    public default void method2(){
        System.out.println("A接口中的默认方法method2");
    }
}
interface IB{
    // 默认方法
    public default void method2(){
        System.out.println("B接口中的默认方法method2");
    }
}

class Imp implements IA,IB{// 必须重写一次

    @Override
    public void method2() {
        System.out.println("实现类重写method2默认方法");
    }
}*/

interface IA{
    // 静态方法
    public static void method3(){
        System.out.println("A接口中的静态方法method3");
    }
}
interface IB{
    // 静态方法
    public static void method3(){
        System.out.println("B接口中的静态方法method3");
    }
}

class Imp implements IA,IB{// 必须重写一次

}

public class Test {
    public static void main(String[] args) {
        /*
            多实现时的几种冲突情况:
                公有静态常量的冲突: 实现类不会继承,也就不能访问这个有冲突的常量
                公有抽象方法的冲突: 实现类必须重写一次
                公有默认方法的冲突: 实现类必须重写一次
                公有静态方法的冲突: 不存在冲突
                私有方法的冲突: 不存在冲突
         */
        // 公有静态常量的冲突: 实现类不会继承,也就不能访问这个有冲突的常量
       /* // 创建实现类对象
        Imp imp = new Imp();
        //System.out.println(imp.A);// 编译报错
        System.out.println(imp.B);// 可以访问  20*/
    }
}
