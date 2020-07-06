package com.amao.demo06_AIO;

import org.junit.Test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/7/3 16:54
 */
public class Test03 {
    @Test
    public void client() throws IOException {
        //创建对象
        AsynchronousSocketChannel asynchronousSocketChannel = AsynchronousSocketChannel.open();

        //连接

        asynchronousSocketChannel.connect(new InetSocketAddress("192.168.11.29", 8090), null, new CompletionHandler<Void, Object>() {
            //连接成功后会自动执行的代码
            @Override
            public void completed(Void result, Object attachment) {

            }

            //连接失败后会自动执行的代码
            @Override
            public void failed(Throwable exc, Object attachment) {

            }
        });

        //程序不结束
        while (true) {

        }
    }
}
