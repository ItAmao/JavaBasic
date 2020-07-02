package day20.src.com.amao.demo01_File;

import java.io.File;

/**
 *  File类的判断功能方法
 *      public boolean exists() :此File表示的文件或目录是否实际存在。
 *      public boolean isDirectory() :此File表示的是否为目录。
 *      public boolean isFile() :此File表示的是否为文件。
 *      public boolean canRead(); 判断是否可读
 *      public boolean canWrite() 判断是否可写
 *      public boolean isHidden() 判断是否隐藏
 *
 *  @Author : ItAmao
 *  @Date   : 2020/6/26 16:11
 */
public class FileTest03 {
    public static void main(String[] args) {
        File f1 = new File("/Users/mao/Documents/code/basic/day20/src/com/amao/demo01_File/1.txt");

        //1.此File表示的文件或目录是否实际存在
        System.out.println(f1.exists());

        //2.此File表示的是否为目录
        System.out.println(f1.isDirectory());

        //3.此File表示的是否为文件
        System.out.println(f1.isFile());

        //4.判断是会否可读
        System.out.println(f1.canRead());

        //5.判断是否可写
        System.out.println(f1.canWrite());

        //6.判断是否隐藏
        System.out.println(f1.isHidden());

    }
}
