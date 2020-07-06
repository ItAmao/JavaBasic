package com.amao.demo06_AIO;

import org.junit.Test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;

/**
 *  异步非阻塞连接
 *  @Author : ItAmao
 *  @Date   : 2020/7/3 16:07
 */
public class Test02 {
    @Test
    public void server() throws IOException {
        //1.创建对象
        AsynchronousServerSocketChannel asynchronousServerSocketChannel = AsynchronousServerSocketChannel.open();
        //2.绑定端口
        asynchronousServerSocketChannel.bind(new InetSocketAddress(8090));
        //3.异步连接客户端
        //第一个参数:附件信息 ,第二个参数:回调函数,
        asynchronousServerSocketChannel.accept(null, new CompletionHandler<AsynchronousSocketChannel, Object>() {
            //这个方法在连接成功时,会自动执行的方法
            //第一个参数是连接到的客户端对象,第二个参数是附件信息
            @Override
            public void completed(AsynchronousSocketChannel result, Object attachment) {

            }

            //这个方法在连接失败时,会自动执行的方法
            @Override
            public void failed(Throwable exc, Object attachment) {

            }
        });
    }

    @Test
    public void server01() throws IOException {
        //1.创建对象
        AsynchronousServerSocketChannel asynchronousServerSocketChannel = AsynchronousServerSocketChannel.open();
        //2.绑定端口
        asynchronousServerSocketChannel.bind(new InetSocketAddress(8090));
        //3.异步连接客户端
        //第一个参数:附件信息 ,第二个参数:回调函数,
        asynchronousServerSocketChannel.accept(null, new CompletionHandler<AsynchronousSocketChannel, Object>() {
            //这个方法在连接成功时,会自动执行的方法
            //第一个参数是连接到的客户端对象,第二个参数是附件信息
            @Override
            public void completed(AsynchronousSocketChannel result, Object attachment) {
                //接收从客户端发来的数据
                //准备一个数组
                ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
                //读取
                result.read(byteBuffer, null, new CompletionHandler<Integer, Object>() {
                    //completed在读取成功后会自动去执行
                    @Override
                    public void completed(Integer result, Object attachment) {
                        //打印数据
                        System.out.println(new String(byteBuffer.array(), 0, result));
                    }

                    //读取失败后,会自动执行
                    @Override
                    public void failed(Throwable exc, Object attachment) {

                    }
                });
            }

            //这个方法在连接失败时,会自动执行的方法
            @Override
            public void failed(Throwable exc, Object attachment) {

            }
        });
        {

        }
    }
}