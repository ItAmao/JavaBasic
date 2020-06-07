package com.amao.homework.demo1;

public class UiTeacher extends Staff implements Painting {
    @Override
    public void painting() {
        System.out.println("UI老师画画");
    }

    @Override
    public void work() {
        System.out.println("UI老师教UI");
    }
}
