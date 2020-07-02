package day20.src.com.amao.demo03_IO流;

import java.io.*;

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
 *  从内存中写出数据到硬盘文件里
 *
 *  @Author : ItAmao
 *  @Date   : 2020/6/27 10:06
 *
 *  说明:
 *      1.输出操作,对呀的File可以不存在,如果不存在,在输出的过程中,会自动创建
 *      2.如果存在,如果流使用的构造器是FileWriter(file,false) 对原有文件进行覆盖/FileWriter(file,true),对源文件进行添加
 *
 */
public class FileReadWriterTest03 {
    public static void main(String[] args) throws IOException {
        //1.提供File类的对象,指明写出到的文件
        File file = new File("/Users/mao/Documents/code/basic/day20/src/com/amao/demo03_IO流/2.txt");
        //2.提供FileWriter的对象,用于数据的写出
        //true表示是在原有文件进行添加 默认为false表示覆盖
        FileWriter fileWriter = new FileWriter(file, true);

        //3.写出的操作
        fileWriter.write("ItAmao Hello World");
        fileWriter.write("666");


        //4.流资源的关闭
        fileWriter.close();


    }
}
