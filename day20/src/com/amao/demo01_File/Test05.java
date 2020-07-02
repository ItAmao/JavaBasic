package day20.src.com.amao.demo01_File;

import java.io.File;

/**
 *  File类的目录的遍历
 *      1.public String[] list() :返回一个String数组，表示该File目录中的所有子文件或目录。
 *      2.public File[] listFiles() :返回一个File数组，表示该File目录中的所有的子文件或目录。
 *
 *  @Author : ItAmao
 *  @Date   : 2020/6/26 10:31
 */
public class Test05 {
    public static void main(String[] args) {
        //1.File对象
        File f1 = new File("/Users/mao/Documents/code/basic/day20/src/com/amao/demo01_File/3");
        //2.返回一个String数组，表示该File目录中的所有子文件或目录。
        String[] fileNames = f1.list();
        for (String fileName : fileNames) {
            System.out.println(fileName);
        }

        //3.返回一个File数组，表示该File目录中的所有的子文件或目录。
        File[] files = f1.listFiles();
        for (File file : files) {
            System.out.println(file.getName());
        }

    }
}
