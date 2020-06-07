package com.amao.demo10_权限修饰符;

/**
 * @Author：pengzhilin
 * @Date: 2020/6/5 11:52
 */
public class Person {
    public void method1(){}
    protected void method2(){}
     void method3(){}
    private void method4(){}

    public void method(){
        method1();
        method2();
        method3();
        method4();
    }
}
