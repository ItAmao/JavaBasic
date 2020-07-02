package com.amao.homework.demo08;

import java.io.*;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/6/30 20:08
 */
public class Test {
    public static void main(String[] args) throws IOException {
        String path = "/Users/mao/Documents/code/basic/day22/src/com/amao/homework/demo08/1.txt";
        File file = new File(path);
        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "GBK");
        int len;
        char[] chars = new char[1024];
        while ((len = inputStreamReader.read(chars)) != -1) {
            String str = new String(chars, 0, len);
            System.out.println(str);
        }
        inputStreamReader.close();
    }
}
