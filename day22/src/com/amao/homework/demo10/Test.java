package com.amao.homework.demo10;

import java.io.*;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/6/30 20:15
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String path = "/Users/mao/Documents/code/basic/day22/src/com/amao/homework/demo10/1.txt";
        File file = new File(path);
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Object o = objectInputStream.readObject();
        System.out.println(o);
        objectInputStream.close();
    }
}
