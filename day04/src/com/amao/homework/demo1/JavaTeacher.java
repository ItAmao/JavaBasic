package com.amao.homework.demo1;

public class JavaTeacher extends Staff implements Painting {
    @Override
    public void painting() {
        System.out.println("java老师画画");
    }

    @Override
    public void work() {
        System.out.println("java老师在教课");
    }

}
