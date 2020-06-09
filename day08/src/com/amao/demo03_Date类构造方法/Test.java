package com.amao.demo03_Date类构造方法;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        //无参构造
        Date d1 = new Date();
        System.out.println(d1);
        //有参构造
        Date d2 = new Date(0L);
        System.out.println(d2);

    }
}

