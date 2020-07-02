package com.amao.demo06_序列流;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *  反序列化
 *
 *  @Author : ItAmao
 *  @Date   : 2020/6/30 14:49
 */
public class Test02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //创建对象
        String path = "/Users/mao/Documents/code/basic/day22/src/com/amao/demo06_序列流/1.txt";
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path));

        Object o = objectInputStream.readObject();
        System.out.println(o);

        objectInputStream.close();
    }
}
