package day20.src.com.amao.demo03_IO流;

import java.io.File;
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
public class FileReadWriterTest01 {
    public static void main(String[] args) {
        FileReader fr1 = null;
        try {
            //异常的处理,为了保证流资源一定可以执行关闭操作,抛出异常需要使用try-catch-finally操作
            //读入的文件一定要存在,否则就会报FileNotFindException

            //1.实例化File类的对象
            File f1 = new File("/Users/mao/Documents/code/basic/day20/src/com/amao/demo03_IO流/1.txt");
            //2.将1.txt文件的内容读入程序,并输出到控制台,提供具体的流
            fr1 = new FileReader(f1);
//        ----------------------------------方式一------------------------------------------------------------
//        //2.数据的读入过程
//        //read() 返回读入的一个字符,如果达到文件末尾,返回-1
//        int read = fr1.read();
//        //判断
//        while (read != -1) {
//            System.out.println((char) read);
//            read = fr1.read();
//        }
//        ----------------------------------------------------------------------------------------------
            //方式二:
            int data;
            while ((data = fr1.read()) != -1) {
                System.out.println((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.流的关闭
            if (fr1 != null) {
                try {
                    fr1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
