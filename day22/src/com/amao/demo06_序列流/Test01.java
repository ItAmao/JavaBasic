package com.amao.demo06_序列流;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/6/30 14:36
 */
//消除黄色警告
@SuppressWarnings("all")
public class Test01 {
    public static void main(String[] args) throws IOException {
        String path = "/Users/mao/Documents/code/basic/day22/src/com/amao/demo06_序列流/1.txt";
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path));

        Student stu1 = new Student("阿毛", 23);

        objectOutputStream.writeObject(stu1);

        objectOutputStream.close();
        //NotSerializableException
        //如果要序列化一个对象,这个对象类型必须是序列化对象的接口

        /**
         * 以上操作会出现乱码操作
         *  因为把一个对象放入txt文件中,这个操作就不对,
         *   解决方案: 反序列化流
         */
    }
}
