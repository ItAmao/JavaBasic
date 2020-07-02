package com.amao.demo03_字节缓冲流;

import java.io.*;

/**
 * 字节缓冲流和普通流关于复制粘贴的比较
 *
 *  @Author : ItAmao
 *  @Date   : 2020/6/30 14:17
 */
public class Test02 {

    public static void main(String[] args) throws IOException {
        //1.测试普通流和缓冲流的时间差
        long startTime1 = System.currentTimeMillis();
        testCopy1();
        long endTime1 = System.currentTimeMillis();
        System.out.println(endTime1 - startTime1);
        long startTime2 = System.currentTimeMillis();
        testCopy2();
        long endTime2 = System.currentTimeMillis();
        System.out.println(endTime2 - startTime2);
    }

    /**
     * 使用缓冲流复制粘贴操作
     */
    public static void testCopy2() throws IOException {
        String path1 = "/Users/mao/Documents/code/basic/day22/src/com/amao/demo03_字节缓冲流/1.jpg";
        String path2 = "/Users/mao/Documents/code/basic/day22/src/com/amao/demo03_字节缓冲流/2.jpg";
        //1.创建文件对象
        File file1 = new File(path1);
        File file2 = new File(path2);
        //2.造流
        //2.1 普通流
        FileInputStream fileInputStream = new FileInputStream(file1);
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        //2.2 缓冲字节流
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        //3.操作流
        byte[] bytes = new byte[5];
        int len;
        while ((len = bufferedInputStream.read(bytes)) != -1) {
            bufferedOutputStream.write(bytes, 0, len);
        }
        //4.关闭流
        bufferedInputStream.close();
        bufferedOutputStream.close();
    }

    /**
     * 使用普通流进行复制粘贴操作
     */
    public static void testCopy1() throws IOException {
        String path1 = "/Users/mao/Documents/code/basic/day22/src/com/amao/demo03_字节缓冲流/1.jpg";
        String path2 = "/Users/mao/Documents/code/basic/day22/src/com/amao/demo03_字节缓冲流/2.jpg";
        //1.创建文件对象
        File file1 = new File(path1);
        File file2 = new File(path2);
        //2.造流 普通流
        FileInputStream fileInputStream = new FileInputStream(file1);
        FileOutputStream fileOutputStream = new FileOutputStream(file2);

        //3.复制粘贴操作
        int len;
        while ((len = fileInputStream.read()) != -1) {
            fileOutputStream.write(len);
        }
        //4.关闭流
        fileInputStream.close();
        fileOutputStream.close();
    }

}
