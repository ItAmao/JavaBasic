package day20.src.com.amao.demo03_IO流;

import java.io.*;

/**
 *  处理流之一:缓冲流的使用
 *      1.缓冲流
 *          BufferedInputStream
 *          BufferedOutputStream
 *          BufferedReader
 *          BufferedWriter
 *
 *      2.作用:
 *          提供流的读取,写入的速度
 *
 *  @Author : ItAmao
 *  @Date   : 2020/6/27 16:10
 *
 *  实现非文本文件的复制
 */
public class BufferedTest01 {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            //1.创建File对象
            File file1 = new File("/Users/mao/Documents/code/basic/day20/src/com/amao/demo03_IO流/1.jpg");
            File file2 = new File("/Users/mao/Documents/code/basic/day20/src/com/amao/demo03_IO流/2.jpg");

            //2.造流
            //2.1 造节点流
            fileInputStream = new FileInputStream(file1);
            fileOutputStream = new FileOutputStream(file2);
            //2.2 造缓冲流
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

            //3.复制粘贴的细节 读取和写入
            byte[] bytes = new byte[10];
            int len;
            while ((len = bufferedInputStream.read(bytes)) != -1) {
                bufferedOutputStream.write(bytes, 0, len);
       //         bufferedOutputStream.flush();//刷新缓冲区
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4,资源关闭
            //要求.先关闭外层的流,在关闭内层的流
            if (bufferedInputStream != null) {
                try {
                    bufferedInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bufferedOutputStream != null) {
                try {
                    bufferedOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        //说明:关闭外层流的同时,内层流也会自动的进行关闭,所以内层流可以省略
//        fileInputStream.close();
//        fileOutputStream.close();

    }
}
