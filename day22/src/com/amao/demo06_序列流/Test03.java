package com.amao.demo06_序列流;

import org.junit.Test;

import java.io.*;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/6/30 15:19
 */
public class Test03 {
    //不能把序列化写入和读取放在一个代码中
    @Test
    public void testObjectStream() {
        ObjectInputStream objectInputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            //1.创建File对象
            String path1 = "/Users/mao/Documents/code/basic/day22/src/com/amao/demo06_序列流/1.txt";
            String path2 = "/Users/mao/Documents/code/basic/day22/src/com/amao/demo06_序列流/2.txt";
            File file1 = new File(path1);
            File file2 = new File(path2);

            //2.造流
            FileInputStream fileInputStream = new FileInputStream(file1);
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            //3.使用序列流操作对象
            //3.1创建学生对象
            Student stu1 = new Student("阿毛", 23);
            //3.2创建序列流
            objectInputStream = new ObjectInputStream(fileInputStream);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);

            //4.操作序列流
            //4.1把对象存入文本1
            objectOutputStream.writeObject(stu1);
            //4.2读取文本1的文件
            Object o = objectInputStream.readObject();
            System.out.println(o);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (objectOutputStream != null) {
                try {
                    objectOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (objectInputStream != null) {
                try {
                    objectInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
