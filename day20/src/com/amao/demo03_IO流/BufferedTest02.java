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
 *      3.处理流:就是"套接"在已有的流的基础上
 *
 *  @Author : ItAmao
 *  @Date   : 2020/6/27 16:28
 *
 *  使用BufferedReader和BufferedWriter实现文本文件的复制
 *
 *
 */
public class BufferedTest02 {
    public static void main(String[] args) {
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            //1.创建File对象
            File file1 = new File("/Users/mao/Documents/code/basic/day20/src/com/amao/demo03_IO流/1.txt");
            File file2 = new File("/Users/mao/Documents/code/basic/day20/src/com/amao/demo03_IO流/4.txt");
            //2.造流
            fileReader = new FileReader(file1);
            fileWriter = new FileWriter(file2);
            //3,套缓冲流
            bufferedReader = new BufferedReader(fileReader);
            bufferedWriter = new BufferedWriter(fileWriter);
//          //4.读取流
//            int len;
//            while ((len = bufferedReader.read()) != -1) {
//                bufferedWriter.write(len);
//            }
            String data;
            while ((data = bufferedReader.readLine()) != null) {
                //方法一:
                //bufferedWriter.write(data + "\n"); //data中不包含换行符
                //方法二:
                bufferedWriter.write(data);
                bufferedWriter.newLine();//提供换行操作
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //5.关闭流
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
