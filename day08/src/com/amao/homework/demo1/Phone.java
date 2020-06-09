package com.amao.homework.demo1;

/*
    手机类
 */
public class Phone {
    private String brand;//品牌
    private String color;//颜色
    private double price;//价格

    //无参构造器
    public Phone() {

    }

    //有参构造器
    public Phone(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    //set/get方法
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "手机信息: {" +
                "品牌:='" + brand + '\'' +
                ", 颜色='" + color + '\'' +
                ", 价格=" + price +
                '}';
    }
}
