package com.amao.Ademo_KP.java2;

import java.io.Serializable;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/7/5 17:31
 */
public class Creature<T> implements Serializable {
    private char gender;
    public double weight;

    private void breath() {
        System.out.println("生物呼吸");
    }

    public void eat() {
        System.out.println("生物进食");
    }
}
