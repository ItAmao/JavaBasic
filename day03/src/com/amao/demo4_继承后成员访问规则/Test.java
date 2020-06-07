package com.amao.demo4_继承后成员访问规则;

/**
 * @Author：pengzhilin
 * @Date: 2020/6/2 10:04
 */
class Fu{

}

class Zi extends Fu{

}

public class Test {
    public static void main(String[] args) {
        // 为了方便大家听课,所以接下来,多个类都定义在一个文件中
        // 一个文件中可以定义多个类,但只能有一个public修饰的类,因为程序执行会找public类中的main方法,
        // 这个文件中定义的这多个类都是相互独立的,会各自编译成各自的class文件
    }
}
