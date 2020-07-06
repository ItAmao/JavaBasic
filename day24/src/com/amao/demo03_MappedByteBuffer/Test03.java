package com.amao.demo03_MappedByteBuffer;

import org.junit.Test;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/**
 * FileChannel结合MappedByteBuffer实现高效读写
 *
 *  @Author : ItAmao
 *  @Date   : 2020/7/4 10:06
 */
public class Test03 {


    /**
     *  注意: FileChannel结合MappedByteBuffer只能用于复制2GB一下的文件
     *     	如果想要复制2GB以上文件,我们可以分块映射分块复制!!(参考讲义的13G.rar复制案例)
     */
    @Test
    public void show01() throws IOException {
        //创建两个File
        //随机存取档案
        String path1 = "/Users/mao/Documents/code/basic/day24/src/com/amao/demo02_Channel/1.jpg";
        String path2 = "/Users/mao/Documents/code/basic/day24/src/com/amao/demo02_Channel/5.jpg";
        RandomAccessFile raf1 = new RandomAccessFile(path1, "r");
        RandomAccessFile raf2 = new RandomAccessFile(path2, "rw");
        //2.获取Channel
        FileChannel c1 = raf1.getChannel();
        FileChannel c2 = raf2.getChannel();

        //3.创建映射缓冲区
        long s1 = c1.size();
        MappedByteBuffer map1 = c1.map(FileChannel.MapMode.READ_ONLY, 0, s1);
        MappedByteBuffer map2 = c2.map(FileChannel.MapMode.READ_WRITE, 0, s1);
        //4.复制
        //记时
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < s1; i++) {
            byte b = map1.get(i);
            map2.put(i, b);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("耗时:" + (endTime - startTime));
        //释放资源
        c1.close();
        c2.close();
    }
}
