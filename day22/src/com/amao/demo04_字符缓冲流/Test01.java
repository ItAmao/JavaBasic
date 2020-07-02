package com.amao.demo04_字符缓冲流;

import java.io.*;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/6/30 09:56
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        //1.创建文件对象
        String path1 = "/Users/mao/Documents/code/basic/day22/src/com/amao/2.txt";
        String path2 = "/Users/mao/Documents/code/basic/day22/src/com/amao/3.txt";
        File file1 = new File(path1);
        File file2 = new File(path2);

        //把文件2.txt复制粘贴到3.txt
        //2.造流
        //2.1 字符流
        FileReader fileReader = new FileReader(file1);
        FileWriter fileWriter = new FileWriter(file2);
        //2.2 套缓冲流
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        //3.复制粘贴
        String len;
        while ((len = bufferedReader.readLine()) != null) {
            bufferedWriter.write(len);
            bufferedWriter.newLine();
        }
        //4.关闭流
        bufferedReader.close();
        bufferedWriter.close();

        
    }
}
