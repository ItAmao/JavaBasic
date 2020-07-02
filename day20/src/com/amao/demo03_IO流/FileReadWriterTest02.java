package day20.src.com.amao.demo03_IO流;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *  1.流的分类
 *      1.按照数据单位:字节流,字符流
 *      2.按照流的流向:输入流,输出流
 *      3.流的角色:节点流,处理流
 *
 *
 *  2.流的体系机构
 *      抽象基类                    节点流(或文件流)               缓冲流(处理流的一种)
 *          InputStream         FileInputStream               BufferedInputStream
 *          OutputStream        FileOutputStream              BufferedOutputStream
 *          Reader              FileReader                    BufferedReader
 *          Writer              FileWriter                    BufferedWriter
 *
 *
 *
 *
 *  @Author : ItAmao
 *  @Date   : 2020/6/27 10:06
 */
public class FileReadWriterTest02 {
    public static void main(String[] args) {
        FileReader fileReader = null;
        try {
            //对read()操作升级: 使用read的重载方法
            //1.File类的实例化
            File file = new File("/Users/mao/Documents/code/basic/day20/src/com/amao/demo03_IO流/1.txt");
            //2.流的实例化(文本文件FileReader)
            fileReader = new FileReader(file);
            //3.读入的操作
            //fileReader.read(cbuf); 返回每次读入cbuf数组中的字符的个数
            char[] cbuf = new char[5];
            int len;
            while ((len = fileReader.read(cbuf)) != -1) {
                //方式一:
                //错误的写法:相当于最后3位 123覆盖了前面5位 World 最后剩下 ld 所以输入123ld
//                for (int i = 0; i < cbuf.length; i++) {
//                    System.out.print(cbuf[i]);//输出结果:HelloWorld123ld
//                }
//                for (int i = 0; i < len; i++) {
//                    System.out.print(cbuf[i]);
//                }
//                方式二:
                //错误写法,和方式一错误写法一样的道理
//                String str=new String(cbuf);
//                System.out.print(str);//HelloWorld123ld
                //正确的写法
                String str = new String(cbuf, 0, len);
                System.out.print(str);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭流
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
