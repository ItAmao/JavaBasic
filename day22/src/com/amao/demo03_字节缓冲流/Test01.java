package com.amao.demo03_字节缓冲流;

import java.io.*;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/6/30 09:48
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        //1.创建对象对象
        String path1 = "/Users/mao/Documents/code/basic/day22/src/com/amao/demo03_字节缓冲流/1.txt";
        String path2 = "/Users/mao/Documents/code/basic/day22/src/com/amao/demo03_字节缓冲流/2.txt";
        File file1 = new File(path1);
        File file2 = new File(path2);
        //2.造流
        //2.1 文件流
        FileInputStream fileInputStream = new FileInputStream(file1);
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        //2.2 套字节缓冲流
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

        //3.文件复制粘贴操作
        byte[] bytes = new byte[5];
        int len;
        while ((len = bufferedInputStream.read(bytes)) != -1) {
            bufferedOutputStream.write(bytes, 0, len);
        }

        //4.关闭流
        bufferedInputStream.close();
        bufferedOutputStream.close();

    }
}
