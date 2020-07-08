package com.amao.demo02_单例设计模式;

/**
 * 懒汉模式:
 *  @Author : ItAmao
 *  @Date   : 2020/7/8 16:08
 */
public class LazyMan {
    //1.将构造器私有化
    private LazyMan() {
    }

    //2.在类内部只定义一个本类的对象名,但不赋值
    private static LazyMan lazyMan;

    //3.提供一个静态方法,用于获取对象
    public synchronized static LazyMan getInstance() {
        //别人调用的时候,我们才赋值
        if (lazyMan == null) {
            lazyMan = new LazyMan();
        }
        return lazyMan;
    }
}

class Test00 {
    public static void main(String[] args) {
        //4.别的类想要获取对象,可以通过调用这个类的静态方法获取
        for (int i = 0; i < 10; i++) {
            LazyMan lazyMan = LazyMan.getInstance();
            System.out.println(lazyMan);
        }
    }
}
