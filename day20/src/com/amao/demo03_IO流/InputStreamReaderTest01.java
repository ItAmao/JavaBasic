package day20.src.com.amao.demo03_IO流;

import java.io.*;

/**
 *  处理流之二:转换流的使用
 *      1.转换流:属于字符流
 *          InputStreamReader:  将一个字节的输入流转换为字符的输入流
 *          OutputStreamWriter:
 *      2.作用:
 *          提供字节流与字符流直接的转换
 *
 *      3.字节、字节数组 ----> 字符数组,字符串 解码
 *        反之  解码
 *
 *      4.字符集
 *
 *
 *  @Author : ItAmao
 *  @Date   : 2020/6/27 17:04
 *
 *  此时处理异常的话,仍然应该使用try-catch-finally
 *  InputStreamReader的使用,实现了字节的输入流到字符的输入流的转换
 *
 *
 */
public class InputStreamReaderTest01 {
    public static void main(String[] args) throws IOException {
        String path = "/Users/mao/Documents/code/basic/day20/src/com/amao/demo03_IO流/1.txt";
        FileInputStream fileInputStream = new FileInputStream(path);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");

        char[] chars = new char[5];
        int len;
        while ((len = inputStreamReader.read(chars)) != -1) {
            String str = new String(chars, 0, len);
            System.out.print(str);
        }
        inputStreamReader.close();
    }
}
