package com.amao.demo06_AIO;

import org.junit.Test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;
import java.util.concurrent.TimeUnit;

/**
 * AIO异步读写数据
 *
 *  @Author : ItAmao
 *  @Date   : 2020/7/4 15:59
 */
public class Test06 {
    @Test
    public void client() throws IOException, InterruptedException {
        //1.创建AsynchronousSocketChannel对象
        AsynchronousSocketChannel asc = AsynchronousSocketChannel.open();

        //2.异步非阻塞连接服务器
        asc.connect(new InetSocketAddress("127.0.0.1", 8888)
                , null,
                new CompletionHandler<Void, Object>() {
                    @Override
                    public void completed(Void result, Object attachment) {
                        System.out.println("连接成功...");
                        //异步非阻塞给服务器发送数据
                        ByteBuffer buffer = ByteBuffer.wrap("我是客户端...".getBytes());
                        System.out.println("准备发送数据...");
                        asc.write(buffer,
                                500,
                                TimeUnit.MILLISECONDS,
                                null,
                                new CompletionHandler<Integer, Object>() {
                                    @Override
                                    public void completed(Integer result, Object attachment) {
                                        System.out.println("消息发送OK..." + result + "字节");
                                    }

                                    @Override
                                    public void failed(Throwable exc, Object attachment) {
                                        System.out.println("消息发送失败....");
                                    }
                                });
                        System.out.println("发数据的后续代码....");
                    }

                    @Override
                    public void failed(Throwable exc, Object attachment) {
                        System.out.println("连接失败...");
                    }
                }
        );
        //3.后续代码
        System.out.println("后续代码...");
        Thread.sleep(30000);
    }

    @Test
    public void server() throws IOException, InterruptedException {
        //1.创建AsynchronousServerSocketChannel对象
        AsynchronousServerSocketChannel asynchronousServerSocketChannel = AsynchronousServerSocketChannel.open();
        //2.绑定自己的端口
        asynchronousServerSocketChannel.bind(new InetSocketAddress(8888));
        //3.异步非阻塞接收客户端
        asynchronousServerSocketChannel.accept(
                null,
                new CompletionHandler<AsynchronousSocketChannel, Object>() {
                    @Override
                    public void completed(AsynchronousSocketChannel result, Object attachment) {
                        System.out.println("客户端来了...");
                        //异步非阻塞读取客户端发送的信息
                        ByteBuffer buffer = ByteBuffer.allocate(1024);
                        result.read(
                                buffer,//保存数据的字节缓冲区
                                500,//超时时间
                                TimeUnit.MILLISECONDS,//超时时间单位
                                null,//附件
                                new CompletionHandler<Integer, Object>() {//读取数据成功与否的回到接口
                                    @Override
                                    public void completed(Integer result, Object attachment) {
                                        System.out.println("接收数据成功..." + result + "字节");
                                        System.out.println(new String(buffer.array(), 0, result));
                                    }

                                    @Override
                                    public void failed(Throwable exc, Object attachment) {
                                        System.out.println("数据接收失败....");
                                    }
                                }
                        );
                        System.out.println("接收数据代码进行执行....");
                    }

                    @Override
                    public void failed(Throwable exc, Object attachment) {
                        System.out.println("客户端连接异常了...");
                    }
                });
        //4.后续代码
        System.out.println("后续代码...");
        Thread.sleep(30000);

    }
}
