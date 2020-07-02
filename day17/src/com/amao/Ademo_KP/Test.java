package com.amao.Ademo_KP;

/**
 * @description:
 * @params:
 * @return:
 * @author: ItAmao
 * @time: 2020/6/21 09:10
 */
public class Test {
    public static void main(String[] args) {
        /**
         *  synchronized关键字
         *      1. 同步方法
         *          使用synchronized修饰的方法,就叫做同步方法,保证A线程执行该方法的时候,其他线程只能在方法外等着。
         *
         *      2.格式:
         *          public synchronized void 方法名(){
         *           可能会产生线程安全问题的代码(	需要同步的代码(需要保证原子性的代码)   )
         *              }
         *
         *      3.注意:
         *          a.同步方法需不需要锁对象?
         *              需要,但是不需要我们去指定,默认使用当前对象this
         *          b.同步方法是否可以是静态方法?
         *              可以,对于非static方法,同步锁就是this。
         *                  对于static方法,我们使用当前方法所在类的字节码对象(类名.class)。
         *
         *------------------------------------------------------------------------------------------------
         *  Lock锁
         *      1.java.util.concurrent.locks.Lock
         *          机制提供了比synchronized代码块和synchronized方法更广泛的锁定操作,
         *          同步代码块/同步方法具有的功能Lock都有,除此之外更强大
         *
         *      2.Lock锁也称同步锁，加锁与释放锁方法化了，如下:
         *              public void lock() :加同步锁。
         *              public void unlock() :释放同步锁。
         *
         *      3.格式:
         *          Lock lock = new ReentrantLock();
         *          lock.lock();//加锁
         *          需要同步的代码,需要保证原子性的代码
         *          lock.unlock();//解锁
         *
         *----------------------------------------------------------------------------------------------------------
         *  并发包
         *      1.什么是并发包:
         *          收集了各种专门在多线程情况下使用,并且可以保证线程安全的一些类
         *
         *      2.CopyOnWriteArrayList
         *          ArrayList的线程是不安全
         *          CopyOnWriteArrayList是线程安全的
         *          public static ArrayList<Integer> list = new ArrayList<>();//线程不安全的
         *          public static CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();//线程安全的
         *
         *     3.CopyOnWriteArraySet
         *          HashSet是线程不安全的
         *          CopyOnWriteArraySet是线程安全的
         *          public static HashSet<Integer> set = new HashSet<>();//线程不安全的
         *          public static CopyOnWriteArraySet<Integer> set = new CopyOnWriteArraySet<>();//线程安全的
         *
         *          CopyOnWriteArraySet之所以是线程安全的, 因为如下代码:
         * 	        private boolean addIfAbsent(E e, Object[] snapshot) {
         *                  final ReentrantLock lock = this.lock;
         *                  lock.lock();
         *                  try {
         *            	        需要同步的代码;
         *                      return true;
         *                      } finally {
         *                      lock.unlock();
         *                       }
         *                      }
         *
         *      4.ConcurrentHashMap
         *          HashMap是线程不安全的
         *          注意:
         * 	            HashMap是线程不安全的,多个线程操作同一个HashMap时,可能会出现以下情况:
         * 	            a.运行没问题,但是结果小于单线程情况下的结果(大概率出现这种情况)
         *              b.假死状态(可能出现,概率比较小)
         *              c.抛出异常(可能出现,概率比较小)
         *
         *          HashTable之所以能保证线程安全,原因是如下代码:
         * 	            public synchronized V put(K key, V value) {
         *     		        需要同步的代码;
         *              }
         * 		        public synchronized V remove(Object key) {
         *          	    需要同步的代码;
         *               }
         * 		        public synchronized V get(Object key) {
         *                  需要同步的代码;
         *              }
         *
         *          但是HashTable有两个性能上的问题:
         *          a.无脑加锁,无论是添加,删除,获取都加锁,并使用同一个锁对象,导致性能极其低下
         *          b.HashTable添加是全局锁,有且仅有一个线程可以操作HashTable,导致性能极其低下
         *          public static HashMap<Integer, Integer> map = new HashMap<>();//是线程不安全的
         *          public static Hashtable<Integer, Integer> map = new Hashtable<>();//是线程安全的
         *          public static ConcurrentHashMap<Integer, Integer> map = new ConcurrentHashMap<>();//是线程安全的
         *
         *--------------------------------------------------------------------------------------------------------------
         * CountDownLatch
         *      1.CountDownLatch的作用
         *          允许一个线程等另外一个线程结束之后在继续执行!!!
         *
         *      2.CountDownLatch的API
         *          构造方法:
         * 	                public CountDownLatch(int count);指定计数的线程
         *          成员方法:
         * 	                public void await();让当前线程等待
         *                  public void countDown();减少需要等待的线程数量
         *
         *              案例:
         * 	                发射火箭:
         * 		                a.计算空气阻力(线程1)
         *                      b.计算因高度不同的地球引力(线程2)
         *                      c.发射火箭(线程3)
         *
         *--------------------------------------------------------------------------------------------------------------
         *  CyclicBarrier
         *      1.CyclicBarrier的作用
         *          让一组线程均到达某个屏障点.然后去执行某个任务!!!
         *
         *      2.CyclicBarrier的API
         *          构造方法:
         * 	                public CyclicBarrier(int parties, Runnable barrierAction);
         * 	                参数1:parties表示这组线程的数量!
         *                  参数2:barrierAction 表示一组线程都到达之后需要执行的任务!
         *          成员方法:
         * 	                public int await(); 让当前线程阻塞
         *
         *--------------------------------------------------------------------------------------------------------------
         *  Semaphore
         *      1.Semaphore的作用
         *          控制并发线程的数量!!
         *
         *      2.Semaphore的API
         *          构造方法:
         *                  public Semaphore(int permits);
         * 		            参数permits称为许可证,即最大的线程并发数量
         *          成员方法:
         *                  public void acquire(); 表示获取许可证
         *                  public void release(); 释放许可证
         *
         *--------------------------------------------------------------------------------------------------------------
         *  Exchanger
         *      1.Exchanger的作用
         *          用于两个线程间做数据交换的.
         *
         *      2.Exchanger的API
         *          构造方法:
         *                  public Exchanger();
         *          成员方法:
         * 	                public V exchange(V x);//交换数据
         *
         *
         *
         */
    }
}
