package com.amao.demo06_AIO;

import org.junit.Test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;

/**
 *
 *  @Author : ItAmao
 *  @Date   : 2020/7/4 15:25
 */
public class Test04 {
    /**
     *  异步非阻塞客户端通道
     */
    @Test
    public void client() throws IOException, InterruptedException {
        //1.创建AsynchronousSocketChannel对象
        AsynchronousSocketChannel asc = AsynchronousSocketChannel.open();
        //2.连接服务器
        //第一个参数是服务器,第二个参数是附件内容,第三个是回调接口
        asc.connect(new InetSocketAddress("127.0.0.1", 7777), null, new CompletionHandler<Void, Object>() {
            @Override
            public void completed(Void result, Object attachment) {
                //连接成功之后的回调
                System.out.println("连接服务器成功...");
            }

            @Override
            public void failed(Throwable exc, Object attachment) {
                //连接过程中出异常的回调
                System.out.println("连接过程中出现异常...");
            }
        });
        //3.其他
        System.out.println("程序继续执行....");

        Thread.sleep(3000);
    }

    /**
     * 异步非阻塞服务器通道
     */
    @Test
    public void server() throws IOException, InterruptedException {
        //1.创建AsynchronousServerSocketChannel对象
        AsynchronousServerSocketChannel asynchronousServerSocketChannel = AsynchronousServerSocketChannel.open();
        //2.绑定端口
        asynchronousServerSocketChannel.bind(new InetSocketAddress(12345));
        //3.接收客户端
        System.out.println("等待客户端连接...");
        asynchronousServerSocketChannel.accept(
                null, //附件为null
                new CompletionHandler<AsynchronousSocketChannel, Object>() {//回调接口
                    //客户端连接成功的回调
                    public void completed(AsynchronousSocketChannel result, Object attachment) {
                        System.out.println("客户端连接成功..." + result);
                    }

                    //客户端连接过程中出异常回调
                    public void failed(Throwable exc, Object attachment) {
                        System.out.println("连接过程中出异常回调....");
                    }
                });

        //4.继续执行
        System.out.println("服务器继续执行....");
        Thread.sleep(50000);
    }
}
