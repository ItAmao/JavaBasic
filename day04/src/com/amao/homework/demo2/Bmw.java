package com.amao.homework.demo2;

public class Bmw extends Car implements BmwCar {
    @Override
    public void run() {
        System.out.println("宝马车在开");
    }

    @Override
    public void GPS() {
        System.out.println("宝马车系专用GPS");
    }
}
