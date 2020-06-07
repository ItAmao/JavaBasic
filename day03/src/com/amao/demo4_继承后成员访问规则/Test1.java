package com.amao.demo4_继承后成员访问规则;

/**
 * @Author：pengzhilin
 * @Date: 2020/6/2 10:17
 */
class Fu1{
    public Fu1(){

    }

    public Fu1(String name,int age){

    }
}

class Zi1 extends Fu1{

}

public class Test1 {
    public static void main(String[] args) {
        // 继承后构造方法的访问:父类中的构造方法不能被子类继承,不能直接使用
        // 如果子类可以继承,那么子类就拥有父类的空参构造和有参构造
        // Zi1 zi = new Zi1("张三",19);// 编译报错
    }
}
