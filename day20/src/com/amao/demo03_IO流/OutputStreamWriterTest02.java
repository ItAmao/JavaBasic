package day20.src.com.amao.demo03_IO流;

import java.io.*;

/**
 * 综合使用
 *
 *  @Author : ItAmao
 *  @Date   : 2020/6/27 17:40
 *
 *
 *  字符集:
 *
 */
public class OutputStreamWriterTest02 {
    public static void main(String[] args) throws IOException {

        String path1 = "/Users/mao/Documents/code/basic/day20/src/com/amao/demo03_IO流/1.txt";
        String path2 = "/Users/mao/Documents/code/basic/day20/src/com/amao/demo03_IO流/5.txt";
        File file1 = new File(path1);
        File file2 = new File(path2);

        //字节流
        FileInputStream fileInputStream = new FileInputStream(file1);
        FileOutputStream fileOutputStream = new FileOutputStream(file2);

        //装换流
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "utf-8");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "gbk");

        //读写的过程
        char[] chars = new char[5];
        int len;
        while ((len = inputStreamReader.read(chars)) != -1) {
            outputStreamWriter.write(chars, 0, len);
        }

        //关闭流
        inputStreamReader.close();
        outputStreamWriter.close();

    }
}
