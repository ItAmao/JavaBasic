package com.amao.demo03_注解;

/**
 *  注解:
 *      1.概述
 *          注解是JDK1.5的新特性,它是一种标记,可以标记类,方法,成员变量,局部变量,参数等....
 *          这个标记主要是给编译器看的,或者给JVM看的
 *
 *      2.作用:
 *          a.生成帮助文档
 *              @author     作者信息
 *              @version    版本信息
 *
 *          b.编译检查
 *              @Override    检查方法重写是否正确
 *
 *          c.给框架作为配置使用
 *              (Mybatis,Spring,SpringMVC)这些框架都会用到注解
 *
 *      3.常见的注解介绍
 *          @Override 方法重写注解
 *          @FunctionalInterface 函数式接口注解
 *          @Deprecated 过期注解
 *          @author 用来标识作者
 *          @version 用于标识版本
 *          @Test junit单元测试
 *
 *      4.自定义注解
 *          自定义类:
 *              public class 类名(){}
 *          自定义接口
 *              public interface 接口名(){}
 *          自定义枚举
 *              public enum 枚举名(){}
 *          自定义注解
 *              public @interface 注解名{}
 *
 *      5.给自定义注解添加属性
 *          格式:
 *              public @interface 注解名{
 *                  //注解中只能写属性
 *                  数据类型 属性名() [default 默认值]  []可不写
 *              }
 *          注解中属性的数据类型必须是以下三大类型
 *              a.8中基本数据类型(int short byte long boolean char double float)
 *              b.4中引用类型(String,枚举类型,class类型,其他注解类型)
 *              c.以上12种的一维数组
 *
 *
 *      6.自定义注解中的特殊属性名value【重点】
 *          a.如果注解中只有一个属性且名字叫value，则在使用该注解时可以直接给该属性赋值，而不需要 给出属性名。
 *          b.如果注解中除了value之外,其他的属性都有默认值,并且使用时只给value赋值,那么直接给该属性赋值，而不需要 给出属性名。
 *
 *      7.注解的注解--元注解(了解即可)
 *          a.@Target元注解
 *              作用:规定我们注解的标记目标
 *              属性名:value
 *              属性值:
 *                  @Target(ElementType.TYPE)   TYPE，类，接口
 *                  @Target(ElementType.FIELD)  FIELD, 成员变量
 *                  @Target(ElementType.METHOD) METHOD, 成员方法
 *                  @Target(ElementType.PARAMETER)  PARAMETER, 方法参数
 *                  @Target(ElementType.CONSTRUCTOR)  CONSTRUCTOR, 构造方法
 *                  @Target(ElementType.LOCAL_VARIABLE) LOCAL_VARIABLE, 局部变量
 *
 *          b.@Retension元注解
 *              作用:规定我们的注解的生命周期
 *              属性名:value
 *              属性值:
 *                  必须是RetensionPolicy枚举类中的成员,其值如下:
 *                  SOURCE: 代表我们的注解只在源码阶段存在
 *                  CLASS: 代表我们的注解在源码中存在,编译之后也存在,但是加载到JVM中会删除
 *                  RUNTIME:代表我们的注解 在源码中存在,编译之后也存在,加载到JVM后还是存在(一直存在)
 *                  例子: @Rentension(RetensionPolicy.SOURCE)
 *
 *      8.注解的解析:
 *          1.什么是注解的解析?
 *              通过编写代码,将某个注解的属性值取出来,打印到控制台
 *          2.注解解析的步骤?
 *              a.获取注解所在类的Class对象
 *              b.获取出注解所在的那个对象(构造,成员方法,成员变量)
 *              c.判断b中那个对象上是否有我们想要的注解
 *              d.获取到我们想要的注解,在进一步获取注解的属性值
 *
 *
 *
 *
 *  @Author : ItAmao
 *  @Date   : 2020/7/5 11:35
 */
public @interface Test01 {
    //属性
    //格式: 数据类型 属性名();
    String name();
    /*
        基本数据类型
        String
        Class
        枚举
        注解
        以上类型的数组形式

        注意事项:
            1.属性可以定义默认值,定义了默认值,就不会要求必须赋值了
            2.如果注解中只有一个属性,且属性名叫value的话,那么在使用注解时,可以省略成分
            3.数组形式的元素中,如果只有一个元素,那么可以省略大括号
     */

}
