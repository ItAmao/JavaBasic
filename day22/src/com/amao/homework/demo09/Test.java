package com.amao.homework.demo09;

import java.io.*;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/6/30 20:11
 */
public class Test {
    public static void main(String[] args) throws IOException {
        //创建学生对象
        Student stu1 = new Student("迪丽热巴", 18, "女");
        String path = "/Users/mao/Documents/code/basic/day22/src/com/amao/homework/demo09/1.txt";
        File file = new File(path);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(stu1);
        objectOutputStream.close();
    }
}
