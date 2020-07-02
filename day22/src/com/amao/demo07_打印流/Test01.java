package com.amao.demo07_打印流;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 *  printStream:字节打印流
 *  printWriter:字符打印流
 *
 *  打印流:
 *      里边有输出任何类型的一个方法
 *
 *
 *  @Author : ItAmao
 *  @Date   : 2020/6/30 15:31
 */
public class Test01 {
    /**
     * 打印流的成员方法
     */
    @Test
    public void testPrintStream02() {
        //1.创建打印流对象
        PrintStream printStream = null;
        String path = "/Users/mao/Documents/code/basic/day22/src/com/amao/demo07_打印流/1.txt";
        try {
            printStream = new PrintStream(path);
            System.setOut(printStream);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            printStream.close();
        }

    }

    /**
     * 打印流的构造方法
     */
    @Test
    public void testPrintStream01() {
        PrintStream printStream = null;
        //字节打印流
        try {
            printStream = new PrintStream("/Users/mao/Documents/code/basic/day22/src/com/amao/demo07_打印流/1.txt");
            printStream.println("阿毛");
            printStream.println(666);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            printStream.close();
        }
    }
}
