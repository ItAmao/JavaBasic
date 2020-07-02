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
 *
 * 文件的复制操作
 */
public class FileReadWriterTest04 {
    /**
     * 把文件2复制到文件1中
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) {
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            //1.创建File对象
            File file1 = new File("/Users/mao/Documents/code/basic/day20/src/com/amao/demo03_IO流/2.txt");
            //2.使用流
            fileReader = new FileReader(file1);
            int len;
            //3.读写入操作
            File file2 = new File("/Users/mao/Documents/code/basic/day20/src/com/amao/demo03_IO流/1.txt");
            fileWriter = new FileWriter(file2);
            while ((len = fileReader.read()) != -1) {
                fileWriter.write(len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
