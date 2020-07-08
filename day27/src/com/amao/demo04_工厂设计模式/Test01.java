package com.amao.demo04_工厂设计模式;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/7/7 10:03
 */
interface Runnable {
    public abstract void run();
}

/**
 * 奥拓
 */
class Auto implements Runnable {

    @Override
    public void run() {
        System.out.println("奥拓汽车,百公里加速需要5.0秒~~~");
    }
}

/**
 * 奥迪
 */
class Audi implements Runnable {

    @Override
    public void run() {
        System.out.println("奥迪汽车,百公里加速需要3.5秒~~~");
    }
}

/**
 * 法拉利
 */
class Ferrari implements Runnable {

    @Override
    public void run() {
        System.out.println("法拉利跑车,百公里加速需要1.0秒~~~");
    }
}

class CarFactory {
    /**
     * 获取方法
     */
    public static Runnable getInstance(int id) {
        if (id == 1) {
            return new Auto();
        } else if (id == 2) {
            return new Audi();
        } else if (id == 3) {
            return new Ferrari();
        } else {
            System.out.println("你要的汽车没有");
            return null;
        }
    }
}

public class Test01 {
    public static void main(String[] args) {
        CarFactory.getInstance(3).run();
    }

}
