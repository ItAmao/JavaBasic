package com.amao.Ademo_KP;

public class Test {
    public static void main(String[] args) {
        /**
         *  Volatile关键字
         *          1.什么是volatile关键字
         *              a.volatile是一个"变量修饰符",它只能修饰"成员变量",它能强制线程每次从内存中获取值,
         *                  并能保证此变量不会被编译器优化
         *              b.volatile能解决变量的可见性、有序性
         *              c.volatile不能解决变量的原子性
         *
         *          2.a和b使用了volatile关键字修饰,那么编译器就不会进行优化,即对a和b进行赋值的代码不会进行"重排"
         *
         *
         * -------------------------------------------------------------------------------------------
         *  原子类
         *      1.什么是原子类?
         *              在java.util.concurrent.atomic包下定义了一些对“变量”操作的“原子类”:
         *
         *      2.原子类的作用?
         *              保证变量的操作是原子性操作
         *
         *      3.原子类有哪些?
         *              1).java.util.concurrent.atomic.AtomicInteger:对int变量操作的“原子类”;
         *              2).java.util.concurrent.atomic.AtomicLong:对long变量操作的“原子类”;
         *              3).java.util.concurrent.atomic.AtomicBoolean:对boolean变量操作的“原子类”;
         *
         *      4.AtomicInteger类示例
         *          a.AtomicInteger类是什么?
         *              为基本类型int提供的原子类
         *              作用:
         *                  AtomicInteger就能保证变量++或者++变量的原子性
         *
         *         b.AtomicInteger的构造方法
         *              public AtomicInteger(int num);
         *
         *         c.AtomicInteger的成员方法
         *              public int getAndIncrement(): //相当于变量++
         *              public int incrementAndget(); //相当于变量++
         *
         *     5.AtomicInteger类的工作原理-CAS机制
         *          a.第一步:线程1先取出原来的值为a=10;
         *            第二步:线程1执行a++操作 a=11
         *            第三步:如果在a还没有更新回去变成11之前:线程2抢到了 线程1修改后a的值11 那么这个时候 需要进行 第二步的值和第一步的值进行比较
         *                  如果相同 则线程2 执行a++操作 a=12
         *                  如果不相同:则先把之前的值10替换成11 在进行自增操作
         *
         *--------------------------------------------------------------------------------------------------------------
         *  synchronized关键字
         *      1.synchronized是什么??
         *          一个可以用于让多行代码保证原子性的关键字
         *
         *      2.synchronized的作用??
         *          让多行代码"同步",当某个线程进入这多行代码执行时,其他线程是无法进入的,
         *          直到多行代码都运行完毕了,其他线程才能进入
         *
         *      3.格式:
         *          synchronized(任意对象){ //也叫做锁对象
         *         需要同步的代码(需要保证原子性操作的那些代码)
         *          }
         *
         *      4.注意:
         * 	        a.synchronized()中的锁对象,可以是任意对象,但是必须保证多个线程使用的是同一个锁对象
         *
         *
         *
         */
    }
}
