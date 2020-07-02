package day20.src.com.amao.demo01_File;

import java.io.File;
import java.util.Date;

/**
 *  File类的常用方法
 *      public String getAbsolutePath() :返回此File的绝对路径名字符串。
 *      public String getPath():将此File转换为路径名字符串。
 *      public String getName() :返回由此File表示的文件或目录的名称。
 *      public long length() :返回由此File表示的文件的长度。 不能获取目录的长度。
 *      public String getParent() :获取上层文件目录路径,若无,返回null
 *      public long lastModified() 获取最后一个修改时间
 *
 *      public String[] list(); 获取指定目录下的所有文件或者文件目录的名称数组
 *      public File[] listFiles() 获取指定目录下的所有文件或者文件目录的File数组
 *
 *  File类的重命名功能
 *      public boolean renameTo(File dest):把文件重命名为指定的文件路径
 *
 *
 *  @Author : ItAmao
 *  @Date   : 2020/6/26 15:49
 */
public class FileTest02 {
    public static void main(String[] args) {
        //1.创建File对象
        File f1 = new File("/Users/mao/Documents/code/basic/day20/src/com/amao/demo01_File/3.txt");

        //返回此File的绝对路径名字符串
        System.out.println(f1.getAbsolutePath());

        //将此File转换为路径名字符串
        System.out.println(f1.getPath());

        //返回由此File表示的文件或目录的名称
        System.out.println(f1.getName());

        //返回由此File表示的文件的长度,不能获取目录的长度
        System.out.println(f1.length());

        //获取上层文件目录路径,若无,返回null
        System.out.println(f1.getParent());

        //获取最后一个修改时间
        System.out.println(new Date(f1.lastModified()));

        //把文件重命名为指定的文件路径
        File f2 = new File("/Users/mao/Documents/code/basic/day20/src/com/amao/demo01_File/2.txt");
        File f3 = new File("/Users/mao/Documents/code/basic/day20/src/com/amao/demo01_File/3.txt");

        //把f2 剪切 到 f3中
        boolean b = f2.renameTo(f3);
        System.out.println(b);

    }

}
