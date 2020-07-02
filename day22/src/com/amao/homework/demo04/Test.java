package com.amao.homework.demo04;

import java.io.*;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/6/30 19:55
 */
public class Test {
    public static void main(String[] args) throws IOException {
        String path1 = "/Users/mao/Documents/code/basic/day22/src/com/amao/homework/demo04/1.jpg";
        String path2 = "/Users/mao/Documents/code/basic/day22/src/com/amao/homework/demo04/2.jpg";
        File file1 = new File(path1);
        File file2 = new File(path2);
        FileInputStream fileInputStream = new FileInputStream(file1);
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

        byte[] bytes = new byte[1024];
        int len;
        while ((len = bufferedInputStream.read(bytes)) != -1) {
            bufferedOutputStream.write(bytes, 0, len);
        }
        bufferedInputStream.close();
        bufferedOutputStream.close();
    }
}
