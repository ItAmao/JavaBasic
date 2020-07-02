package com.amao.Ademo_KP;

/**
 * @description:
 * @params:
 * @return:
 * @author: ItAmao
 * @time: 2020/6/17 08:59
 */
public class Test {
    public static void main(String[] args) {
        /**
         *  选择排序
         *      1.选择排序介绍
         *          demo01
         *
         *--------------------------------------------------------------------------------------------
         *  二分查找
         *      1.demo02
         *
         *-------------------------------------------------------------------------------------------
         *  异常
         *      1.什么是异常
         *          所谓的异常就是程序在编译/运行过程中出现的问题
         *
         *      2.异常的继承体系
         *          根类:Throwable
         *              子类:Exception(异常类)
         *              子类:Error(错误类)
         *
         *      3.异常类中常用的三个方法
         *          public void printStackTrace() :打印异常的详细信息。
         *          public String getMessage() 获取发生异常的原因。
         *          public String toString() :获取异常的类型和异常描述信息(不用)。
         *
         *      4.异常的分类
         *          1.编译时异常
         *              在编译时期报错了,提示可能有异常
         *              Exception以及其子类(RuntimeException除外)都属于编译时异常
         *              比如: SimpleDateFormat的parse方法
         *          2.运行时异常
         *              在编译时期不报错,运行时期才出现异常
         *              RuntimeException以及其子类都属于运行时异常
         *              比如: 空指针异常,数组越界异常,类型转换异常
         *
         *-------------------------------------------------------------------------------------------------
         *  异常处理
         *      1.Java中异常相关的五个关键字
         *          throw,throws,try,catch,finally
         *
         *      2.抛出异常throw
         *          什么是throw:
         *                      是一个关键字,
         *          什么时候使用throw:
         *                      当我们需要抛出一个异常对象时,可以使用throw抛出操作
         *          使用格式:
         *                  throw new xxxException();
         *                  xxxException xe=new xxxException();
         *                  throw xe;
         *
         *     3.throws抛出异常
         *          1.声明异常的格式
         *              throws给方法做声明用的,表示该方法内部可能抛出异常,要求该方法的调用者必须处理这种异常
         *          2.格式:
         *              public 返回值类型 方法名(参数列表) throws xxxException
         *
         *-----------------------------------------------------------------------------------------------------
         * Objects中非空判断方法
         *      非空判断方法(空指针容忍方法)
         *          public static <T> T requireNonNull(T obj) {
         *              if (obj == null)
         *                  throw new NullPointerException();
         *              return obj;
         *          }
         *
         *-----------------------------------------------------------------------------------------------------
         *  遇到异常的2种处理方式
         *          1 throws声明抛出异常
         *                  a.声明异常的格式
         *                          throws给方法做声明用的,表示该方法内部可能抛出某种异常,要求该方法的调用者必须处理这种异常
         *                  b.格式:
         * 	                        public 返回值类型 方法名(参数列表)throws XxxException,OooException{
         *      	                        //方法体
         *                              }
         *
         *          2.try..catch捕获异常
         *                  a.捕获异常的格式
         *                          try{
         *                              可能出现异常的代码
         *                              }catch(XxxException e){
         *                                   e.printStackTrace();
         *                              }
         *
         *                  b.捕获到异常之后,如何查看异常的信息
         *                          都用异常对象的printStackTrace方法即可
         *
         *----------------------------------------------------------------------------------------------------
         *  finally代码块
         *          a.finally代码块的格式
         * 	            try{
         *                  可能有异常的代码
         *              }catch(XxxException e){
         *      	            e.printStackTrace()
         *               }finally{
         *
         *              }
         *
         *          b.finally代码块的作用
         *              finally中写一定要执行的代码,释放资源相关的代码
         *
         *----------------------------------------------------------------------------------------------------
         * 异常的注意事项
         *      a.运行时异常被抛出可以不处理。即不捕获也不声明抛出。[非常重要!!]
         *      b.如果父类的方法声明抛出了多个异常,子类覆盖(重写)父类方法时,只能声明抛出相同的异常或者是他的子集。
         *      c.如果父类的方法没有声明抛出异常,子类覆盖(重写)父类方法时,也不能声明抛出异常(多线程中就会用到)
         *      d.多个异常我们如何捕获处理??[非常重要!!]
         *      代码1; //声明抛出OneException
         * 		代码2; //声明抛出TwoException
         * 		代码3; //声明抛出ThreeException
         *
         *      i.分开捕获分开处理
         *     	try{
         *            代码1; //声明抛出OneException
         *         }catch(OneException e){
         *          	e.printStackTrace();
         *         }
         * 		try{
         *            代码2; //声明抛出TwoException
         *         }catch(TwoException e){
         *          	e.printStackTrace();
         *         }
         * 		try{
         *            代码3; //声明抛出ThreeException
         *         }catch(ThreeException e){
         *          	e.printStackTrace();
         *         }
         *
         *      ii.一起捕获,分开处理
         *     	try{
         *          代码1; //声明抛出OneException  extends TwoException
         * 			代码2; //声明抛出TwoException
         * 			代码3; //声明抛出ThreeException
         *         }catch(OneException e){
         *          	e.printStackTrace();
         *         }catch(TwoException e){
         *          	e.printStackTrace();
         *         }catch(ThreeException e){
         *          	e.printStackTrace();
         *         }
         *
         *      iii.一起获取一起处理[最常用的!!]
         *     	try{
         *          代码1; //声明抛出OneException
         * 			代码2; //声明抛出TwoException
         * 			代码3; //声明抛出ThreeException
         *         }catch(Exception e){
         *          	e.printStackTrace();
         *         }
         *
         *      e.当选择ii中处理多个异常时,如果这些异常有子父类关系,那么必须先处理子类异常,再父类异常
         *      f.在try/catch后可以追加finally代码块，其中的代码一定会被执行，通常用于资源回收(IO流的关系,网络连接关闭)
         *
         *--------------------------------------------------------------------------------------------------
         *  自定义异常
         *          1.为什么要定义异常
         *                  虽然Java中有很多很多异常类,但是不可能可以描述开发中所有可能出现的异常情况,这使用我们需要自定义异常类!
         *
         *          2.自定义异常的步骤
         *                  a.创建一个类,类名必须叫XxxException
         *                  b.继承Exception或者RuntimeException
         *                  c.必须提供至少两个构造: 无参构造+带有String异常信息的构造
         *
         *
         *
         */
    }
}
