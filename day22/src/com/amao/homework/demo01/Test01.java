package com.amao.homework.demo01;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *  请使用FileWriter向文件输出：HelloWorld
 * ​		要求：用JDK7以后的异常处理方式。
 *  @Author : ItAmao
 *  @Date   : 2020/6/30 19:38
 */
public class Test01 {
    public static void main(String[] args) {
        String path="/Users/mao/Documents/code/basic/day22/src/com/amao/homework/demo01/1.txt";
        FileWriter fileWriter=null;
        try {
            //1.创建File对象
            File file=new File(path);
            //2.造流
            fileWriter=new FileWriter(file);
            //3.向文件写入
            fileWriter.write("HelloWorld");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.释放资源
            if(fileWriter!=null){
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
