package day20.src.com.amao.demo03_IO流;

import java.io.*;

/**
 * 测试FileInputStream使用
 *  结论:对于文本文件,使用字符流处理
 *      对于非文本文件,使用字节流处理
 *
 *  @Author : ItAmao
 *  @Date   : 2020/6/27 11:47
 *
 *  实现对图片的复制
 */
public class FileInputStream02 {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            //1.创建File对象
            File file1 = new File("/Users/mao/Documents/code/basic/day20/src/com/amao/demo03_IO流/1.jpg");
            File file2 = new File("/Users/mao/Documents/code/basic/day20/src/com/amao/demo03_IO流/3.jpg");
            //2.操作流
            fileInputStream = new FileInputStream(file1);
            fileOutputStream = new FileOutputStream(file2);
            byte[] bytes = new byte[5];
            int len;
            while ((len = fileInputStream.read(bytes)) != -1) {
                fileOutputStream.write(bytes, 0, len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
