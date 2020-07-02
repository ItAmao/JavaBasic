package com.amao.homework.demo02;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/6/30 19:47
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        String path = "/Users/mao/Documents/code/basic/day22/src/com/amao/homework/demo02/2.txt";
        //1.创建File对象
        File file = new File(path);
        //2.创建Properties对象
        Properties properties = new Properties();
        properties.setProperty("品名", "Iphone11 Pro Max");
        properties.setProperty("颜色", "暗夜绿");
        properties.setProperty("存储容量", "256G");
        properties.setProperty("价格", "10899");
        //3造流
        FileWriter fileWriter=new FileWriter(file);
        properties.store(fileWriter,"");
        fileWriter.close();
    }
}
