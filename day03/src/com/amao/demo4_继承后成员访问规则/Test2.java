package com.amao.demo4_继承后成员访问规则;

/**
 * @Author：pengzhilin
 * @Date: 2020/6/2 10:20
 */
class Fu2{
    private int num;
    private void method(){
        System.out.println("Fu2 私有成员方法");
    }
}

class Zi2 extends Fu2{

}

public class Test2 {
    public static void main(String[] args) {
        // 继承后私有成员访问特点: 私有成员可以继承,但是子类不能直接使用
        // 私有: private修饰
        Zi2 zi = new Zi2();
        //System.out.println(zi.num);// 编译报错
        //zi.method();// 编译报错
    }
}
