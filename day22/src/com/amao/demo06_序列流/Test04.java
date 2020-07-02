package com.amao.demo06_序列流;

import org.junit.Test;

import java.io.*;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/6/30 18:19
 */

public class Test04 {
    /**
     * 反序列化操作
     *
     */
    @Test
    public void testObjectOutputStream03() {
        String path = "/Users/mao/Documents/code/basic/day22/src/com/amao/demo06_序列流/4.txt";
        ObjectInputStream objectInputStream=null;
        try {
            //1.创建File对象
            File file = new File(path);
            //2.造流
            //2.1普通字节流
            FileInputStream fileInputStream = new FileInputStream(file);
            //2.2反序列流
             objectInputStream = new ObjectInputStream(fileInputStream);
            //3.读取对象 ,需要向下转型
            Object o = objectInputStream.readObject();
            //4.打印反序列化流
            System.out.println(o);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            //关闭流
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
     * 解决方法
     *  学生类对象必须实现Serializable接口
     *  这个时候会出现乱码,因为把一个对象放进txt文件,这种操作不对
     *  解决方法,需要反序列化操作
     */
    @Test
    public void testObjectOutputStream02() {
        //1.创建文件对象
        String path = "/Users/mao/Documents/code/basic/day22/src/com/amao/demo06_序列流/4.txt";
        ObjectOutputStream objectOutputStream = null;
        try {
            File file = new File(path);
            //2.造流 因为序列化对象的构造方法底层也需要传入普通流
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            //3.创建ObjectOutputStream流
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            //4.创建学生类对象
            Student05 student05 = new Student05("阿毛", 23);
            objectOutputStream.writeObject(student05);
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

    /**
     * 测试序列化操作
     *
     * 以下代码会出来
     * 添加学生类对象异常
     * java.io.NotSerializableException
     * 因为如果需要序列化一个对象,这个对象必须序列化对象的接口
     */
    @Test
    public void testObjectOutputStream01() {
        //1.创建文件对象
        String path = "/Users/mao/Documents/code/basic/day22/src/com/amao/demo06_序列流/3.txt";
        ObjectOutputStream objectOutputStream = null;
        try {
            File file = new File(path);
            //2.造流 因为序列化对象的构造方法底层也需要传入普通流
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            //3.创建ObjectOutputStream流
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            //4.创建学生类对象
            Student04 student04 = new Student04("阿毛", 23);
            objectOutputStream.writeObject(student04);
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
