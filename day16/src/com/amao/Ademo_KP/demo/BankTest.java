package com.amao.Ademo_KP.demo;

/**
 *  使用同步机制将单例设计模式中的懒汉式改写成线程安全的问题
 *
 *
 *  @Author : ItAmao
 *  @Date   : 2020/6/25 15:29
 */
public class BankTest {

}

/**
 * 单例设计模式
 */
class Bank {
    private Bank() {
    }

    private static Bank instance = null;

    public static Bank getInstance() {
        //方式一:效率稍差
//        synchronized (Bank.class) {
//            if (instance == null) {
//                instance = new Bank();
//            }
//            return instance;
//        }
        //方式二
        if (instance == null) {
            synchronized (Bank.class) {
                if (instance == null) {
                    instance = new Bank();
                }
            }
        }
        return instance;
    }
}
