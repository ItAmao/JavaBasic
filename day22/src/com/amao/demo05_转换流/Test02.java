package com.amao.demo05_转换流;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 *  输出转换流
 *
 *  @Author : ItAmao
 *  @Date   : 2020/6/30 11:13
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        //1.创建一个字符流
        String path = "/Users/mao/Documents/code/basic/day22/src/com/amao/3.txt";
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(path));

        outputStreamWriter.write("你好,ItAmao");

        outputStreamWriter.close();
    }
}
