package com.amao.demo05_转换流;

import org.junit.Test;

import java.io.*;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/6/30 17:53
 */
public class Test03 {
    /**
     * 把出师表安装GBK的方式读出来,然后用UTF-8的方式存
     */
    @Test
    public void testOutputStreamWriter() {
        String path1 = "/Users/mao/Documents/code/basic/day22/src/com/amao/demo05_转换流/2.txt";
        String path2 = "/Users/mao/Documents/code/basic/day22/src/com/amao/demo05_转换流/3.txt";
        InputStreamReader inputStreamReader = null;
        OutputStreamWriter outputStreamWriter = null;
        try {
            //1.创建File文件对象
            File file1 = new File(path1);
            File file2 = new File(path2);
            //2.造流:因为转换流需要底层的普通字节流
            //2.1普通字节流
            FileInputStream fileInputStream = new FileInputStream(file1);
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            //2.2转换流
            inputStreamReader = new InputStreamReader(fileInputStream, "GBK");
            outputStreamWriter = new OutputStreamWriter(fileOutputStream, "UTF-8");
            //3.复制粘贴
            char[] chars = new char[5];
            int len;
            while ((len = inputStreamReader.read(chars)) != -1) {
                String str = new String(chars, 0, len);
                outputStreamWriter.write(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //关闭流
            if (inputStreamReader != null) {
                try {
                    inputStreamReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (outputStreamWriter != null) {
                try {
                    outputStreamWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 转换输入流,
     * 把出师表按照UTF-8的方式读取出来,然后用GBK的方式存
     */
    @Test
    public void testInputStreamReader() {
        //1.创建File对象
        InputStreamReader inputStreamReader = null;
        OutputStreamWriter outputStreamWriter = null;
        String path1 = "/Users/mao/Documents/code/basic/day22/src/com/amao/demo05_转换流/1.txt";
        String path2 = "/Users/mao/Documents/code/basic/day22/src/com/amao/demo05_转换流/2.txt";
        try {
            File file1 = new File(path1);
            File file2 = new File(path2);
            //2.造流:因为转换流底层需要一个普通的字节流
            //2.1 普通的字节输入流
            FileInputStream fileInputStream = new FileInputStream(file1);
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            //2.2 套转换流
            inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
            outputStreamWriter = new OutputStreamWriter(fileOutputStream, "GBK");
            //3.打印流
            //把文件1.txt的内容以UTF-8的方式读取出来,然后以GBK的方式存入2.txt中
            char[] chars = new char[5];
            int len;
            while ((len = inputStreamReader.read(chars)) != -1) {
                String str = new String(chars, 0, len);
                outputStreamWriter.write(str);
                //outputStreamWriter.write(chars, 0, len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭流
            if (inputStreamReader != null) {
                try {
                    inputStreamReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (outputStreamWriter != null) {
                try {
                    outputStreamWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
