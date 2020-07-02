package day20.src.com.amao.demo01_File;

import java.io.File;

/**
 *  File类的常用方法
 *      1.public String getAbsolutePath() :返回此File的绝对路径名字符串。
 *      2.public String getPath():将此File转换为路径名字符串。
 *      3.public String getName() :返回由此File表示的文件或目录的名称。
 *      4.public long length() :返回由此File表示的文件的长度。 不能获取目录的长度。
 *
 *  @Author : ItAmao
 *  @Date   : 2020/6/26 09:27
 */
public class Test02 {
    public static void main(String[] args) {
        //1.创建File对象
        File f1 = new File("day20/src/com/amao/demo01_File/1.txt");

        //2.获取绝对路径
        String absolutePath = f1.getAbsolutePath();
        System.out.println(absolutePath);// /Users/mao/Documents/code/basic/day20/src/com/amao/demo01_File/1.txt

        //3.将此File转换为路径名字符串。
        String path = f1.getPath();
        System.out.println(path);// /Users/mao/Documents/code/basic/day20/src/com/amao/demo01_File/1.txt

        //4.public String getName() :返回由此File表示的文件或目录的名称。
        String name = f1.getName();
        System.out.println(name);//1.txt

        //5.返回由此File表示的文件的长度。不能获取目录的长度。
        System.out.println(f1.length());




    }
}
