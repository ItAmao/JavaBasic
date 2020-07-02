package com.amao.demo05_转换流;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *  输入转换流
 *  @Author : ItAmao
 *  @Date   : 2020/6/30 10:51
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        String path = "/Users/mao/Documents/code/basic/day22/src/com/amao/2.txt";
        InputStreamReader inputStreamReader =
                new InputStreamReader(new FileInputStream(path), "utf-8");

        //1,idea默认的字符集是UTF-8的方式
        int read = inputStreamReader.read();
        System.out.println((char) read);

    }
}
