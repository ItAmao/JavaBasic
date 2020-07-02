package com.amao.demo04_字符缓冲流;

import org.junit.Test;

import java.io.*;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/6/30 17:18
 */
public class Test03 {
    /**
     * 测试字符缓冲流中newLine()
     */
    @Test
    public void testBuffered() {
        BufferedWriter bufferedWriter = null;
        try {
            //1.创建文件对象
            String path = "/Users/mao/Documents/code/basic/day22/src/com/amao/demo04_字符缓冲流/1.txt";
            File file1 = new File(path);
            //2.造流
            //2.1 普通字符流
            FileWriter fileWriter = new FileWriter(file1);
            //2.2 字符缓冲流
            bufferedWriter = new BufferedWriter(fileWriter);

            //3.研究newLine()方法
//            for (int i = 0; i < 10; i++) {
//                //不适用newLine()的话,所有的java都显示在第一行,不会自动换行
//                bufferedWriter.write("java");
//            }
            for (int i = 0; i < 10; i++) {
                //使用newLine(),每次输入一次java就会换一行
                bufferedWriter.write("java");
                bufferedWriter.newLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.释放资源
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
