package com.amao.demo07_打印流;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/6/30 18:56
 */
public class Test03 {
    /**
     * 打印流
     */
    @Test
    public void testPrintStream() {
        String path = "/Users/mao/Documents/code/basic/day22/src/com/amao/demo07_打印流/2.txt";
        PrintStream printStream = null;
        try {
            //创建打印流对象
            //1.public void printStream(String path):使用指定的文件名创建新的打印流，无需自动换行。
            //printStream = new PrintStream(path);
            //2.public PrintStream(File file);使用指定的文件创建一个新的打印流，而不需要自动换行。
            //printStream = new PrintStream(new File(path));
            //3.public PrintStream(OutputStream out); 创建一个新的打印流。
            printStream = new PrintStream(new FileOutputStream(path));
            //2.打印数据
            printStream.print("ItAmao");
            printStream.print(666);
            printStream.println("HelloWorld");
            printStream.println(true);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            //释放资源
            if (printStream != null) {
                printStream.close();
            }
        }

    }
}
