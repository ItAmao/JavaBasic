package com.amao.demo06_AIO;

import org.junit.Test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.nio.channels.AsynchronousSocketChannel;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 *  AIO同步写法
 *  @Author : ItAmao
 *  @Date   : 2020/7/3 15:58
 */
public class Test01 {
    /**
     * 同步方法,方法有返回值
     */
    @Test
    public void method01() throws IOException, ExecutionException, InterruptedException {
        AsynchronousServerSocketChannel asynchronousServerSocketChannel = AsynchronousServerSocketChannel.open();
        //绑定窗口
        asynchronousServerSocketChannel.bind(new InetSocketAddress(8090));

        //连接客户端
        Future<AsynchronousSocketChannel> future1 = asynchronousServerSocketChannel.accept();

        //获取里面真实的一个结果
        AsynchronousSocketChannel asynchronousSocketChannel = future1.get();

        //创建数组
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);

        //读取
        Future<Integer> future2 = asynchronousSocketChannel.read(byteBuffer);

        Integer len = future2.get();

        //打印
        System.out.println(new String(byteBuffer.array(), 0, len));

        //关流
        asynchronousSocketChannel.close();


    }
}
