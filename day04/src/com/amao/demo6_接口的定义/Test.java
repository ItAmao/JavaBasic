package com.amao.demo6_接口的定义;

/**
 * @Author：pengzhilin
 * @Date: 2020/6/4 10:49
 */
public class Test {
    public static void main(String[] args) {
        /*
            接口的定义:
                public interface 接口名{
                     jdk7及其以前:  常量,抽象方法
                     jdk8: 额外增加默认方法和静态方法
                     jdk9及其以上: 额外增加了私有方法
                }
         */
        System.out.println(IA.NUM1);// 10
    }

    // 类中的默认方法,使用默认权限修饰符(空)
    void method(){

    }
}
