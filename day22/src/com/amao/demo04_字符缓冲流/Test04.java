package com.amao.demo04_字符缓冲流;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *  测试readLine()
 *  @Author : ItAmao
 *  @Date   : 2020/6/30 17:27
 */
public class Test04 {
    @Test
    public void testReadLine() {
        //1.创建文件对象
        BufferedReader bufferedReader=null;
        String path = "/Users/mao/Documents/code/basic/day22/src/com/amao/demo04_字符缓冲流/2.txt";
        try {
            File file = new File(path);
            //2.造流
            //2.1 使用普通流
            FileReader fileReader = new FileReader(file);
            //2.2套缓冲流
             bufferedReader = new BufferedReader(fileReader);
            //3.操作readLine()

            //3.1不适用readLine(),只能输出 每个字符对应的ASCII码
//            int len;
//            while ((len = bufferedReader.read()) != -1) {
//                System.out.println(len);
//            }
            //3.2使用readLine()
            String str = "";
            while ((str = bufferedReader.readLine()) != null) {
                System.out.println(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //关闭流
            if(bufferedReader!=null){
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
