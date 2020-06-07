package com.amao.homework.demo2;

public class BMWMotorcycle extends Motorcycle implements BmwCar {
    @Override
    public void run() {
        System.out.println("宝马摩托在开");
    }

    @Override
    public void GPS() {
        System.out.println("宝马摩托专用GPS");
    }
}
