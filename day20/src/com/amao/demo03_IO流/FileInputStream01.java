package day20.src.com.amao.demo03_IO流;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 测试FileInputStream使用
 *  结论:对于文本文件,使用字符流处理
 *      对于非文本文件,使用字节流处理
 *
 *  @Author : ItAmao
 *  @Date   : 2020/6/27 11:47
 */
public class FileInputStream01 {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try {
            //1.创建File对象
            File file = new File("/Users/mao/Documents/code/basic/day20/src/com/amao/demo03_IO流/1.txt");
            //2.操作输入字节流
            fileInputStream = new FileInputStream(file);
            //3.读数据
            byte[] buffer = new byte[5];
            int len;//记录每次读取的字节的个数
            while ((len = fileInputStream.read(buffer)) != -1) {
                String str = new String(buffer, 0, len);
                System.out.print(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
