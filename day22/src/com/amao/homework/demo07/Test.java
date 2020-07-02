package com.amao.homework.demo07;

import java.io.*;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/6/30 20:05
 */
public class Test {
    public static void main(String[] args) throws IOException {
        String path = "/Users/mao/Documents/code/basic/day22/src/com/amao/homework/demo07/1.txt";
        File file = new File(path);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "GBK");
        outputStreamWriter.write("我要学好Java，我要月薪过万！！");
        outputStreamWriter.close();
    }
}
