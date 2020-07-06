package com.amao.demo02_Channel;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/7/3 09:54
 */
public class Test01 {
    @Test
    public void method01() throws IOException {
        String path1 = "/Users/mao/Documents/code/basic/day24/src/com/amao/demo02_Channel/1.jpg";
        String path2 = "/Users/mao/Documents/code/basic/day24/src/com/amao/demo02_Channel/3.jpg";
        //1.创建输入流,创建输出流
        FileInputStream fileInputStream = new FileInputStream(path1);
        FileOutputStream fileOutputStream = new FileOutputStream(path2);

        //流里边有getChannel方法获取通道
        FileChannel channel1 = fileInputStream.getChannel();
        FileChannel channel2 = fileOutputStream.getChannel();

        //读写
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        //方式一: 一个岸上小船运东西,小船一次只能装1024个东西,来回运
        while ((channel1.read(byteBuffer)) != -1) {
            //切换
            byteBuffer.flip();
            channel2.write(byteBuffer);
            //还原
            byteBuffer.clear();
        }
        //关流
        fileInputStream.close();
        fileOutputStream.close();
    }
}
