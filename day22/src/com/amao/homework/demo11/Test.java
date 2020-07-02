package com.amao.homework.demo11;

import org.apache.commons.io.IOUtils;

import java.io.*;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/6/30 20:17
 */
public class Test {
    public static void main(String[] args) throws IOException {
        String path1 = "/Users/mao/Documents/code/basic/day22/src/com/amao/homework/demo11/1.jpg";
        String path2 = "/Users/mao/Documents/code/basic/day22/src/com/amao/homework/demo11/2.jpg";
        File file1 = new File(path1);
        File file2 = new File(path2);
        FileInputStream fileInputStream = new FileInputStream(file1);
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        IOUtils.copy(fileInputStream, fileOutputStream);

    }
}
