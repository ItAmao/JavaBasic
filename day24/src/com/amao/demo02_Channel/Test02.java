package com.amao.demo02_Channel;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * FileChannel类的基本使用
 *
 *
 *  @Author : ItAmao
 *  @Date   : 2020/7/4 10:00
 */
public class Test02 {
    /**
     * FileChannell类的基本使用实现文件的复制和粘贴
     */
    @Test
    public void fileChannel01() throws IOException {
        //1.创建文件对象
        FileInputStream fis = new FileInputStream("/Users/mao/Documents/code/basic/day24/src/com/amao/demo02_Channel/1.jpg");
        FileOutputStream fos = new FileOutputStream("/Users/mao/Documents/code/basic/day24/src/com/amao/demo02_Channel/4.jpg");
        //2.创建FileChannel通道
        FileChannel c1 = fis.getChannel();
        FileChannel c2 = fos.getChannel();

        //3.创建数组
        ByteBuffer b1 = ByteBuffer.allocate(1024);
        int len;
        while ((len = c1.read(b1)) != -1) {
            //切换模式,flip()方法,获取到可以读取的地方
            b1.flip();
            //写数据
            c2.write(b1);
            //清空缓冲区
            b1.clear();
        }
        //关闭流
        c1.close();
        c2.close();
        fis.close();
        fos.close();


    }

}
