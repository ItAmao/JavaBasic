package com.amao.demo06_序列流;

import org.junit.Test;

import java.io.*;
import java.util.ArrayList;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/6/30 18:40
 */
public class Test05 {
    /**
     * 反序列操作
     */
    @Test
    public void testDemo02() {
        String path = "/Users/mao/Documents/code/basic/day22/src/com/amao/demo06_序列流/5.txt";
        ObjectInputStream objectInputStream = null;
        try {
            //1.创建File对象
            File file = new File(path);
            //2.造流
            FileInputStream fileInputStream = new FileInputStream(file);
            //反序列化流
            objectInputStream = new ObjectInputStream(fileInputStream);
            //读对象
            ArrayList<Student05> arrayList = (ArrayList<Student05>) objectInputStream.readObject();
            //循环打印
            for (Student05 student05 : arrayList) {
                System.out.println(student05);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //释放资源
            if(objectInputStream!=null){
                try {
                    objectInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 序列化多个对象
     * 这个时候的存入对个对象都还是乱码,需要反序列操作
     */
    @Test
    public void testDemo01() {
        //1.创建File对象
        String path = "/Users/mao/Documents/code/basic/day22/src/com/amao/demo06_序列流/5.txt";
        ObjectOutputStream objectOutputStream = null;
        try {
            File file = new File(path);
            //2.造流
            //2.1 普通流
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            //2.2 序列化流
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            //3,创建学生对象
            Student05 stu1 = new Student05("阿毛", 18);
            Student05 stu2 = new Student05("1毛", 19);
            Student05 stu3 = new Student05("2毛", 20);
            Student05 stu4 = new Student05("3毛", 21);
            Student05 stu5 = new Student05("4毛", 22);
            //存入集合
            ArrayList<Student05> arrayList = new ArrayList<>();
            arrayList.add(stu1);
            arrayList.add(stu2);
            arrayList.add(stu3);
            arrayList.add(stu4);
            arrayList.add(stu5);
            //把这个集合当做一个对象存
            objectOutputStream.writeObject(arrayList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //释放资源
            if (objectOutputStream != null) {
                try {
                    objectOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
