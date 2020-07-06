package com.amao.demo06_AIO;

import org.junit.Test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * 异步非阻塞客户端通道
 *
 *  @Author : ItAmao
 *  @Date   : 2020/7/4 15:41
 */
public class Test05 {
    /**
     * 异步非阻塞服务端通道
     */
    @Test
    public void server() throws IOException, InterruptedException {
        //1.创建AsynchronousServerSocketChannel对象
        AsynchronousServerSocketChannel asynchronousServerSocketChannel = AsynchronousServerSocketChannel.open();
        //2.绑定端口
        asynchronousServerSocketChannel.bind(new InetSocketAddress(7777));
        //3.接收客户端
        System.out.println("等待客户端连接...");
        asynchronousServerSocketChannel.accept(
                null,
                new CompletionHandler<AsynchronousSocketChannel, Object>() {
                    //客户端连接成功的回调
                    public void completed(AsynchronousSocketChannel result, Object attachment) {
                        System.out.println("客户端连接成功..." + result);
                        //接收数据
                        ByteBuffer buffer = ByteBuffer.allocate(1024);
                        Future<Integer> future = result.read(buffer);
                        try {
                            //read方法读取到数据之后必须先获取长度,然后才能取出数据,否则数据取不出来的!!
                            System.out.println("客户端说的字节数:" + future.get());
                            System.out.println("1");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        buffer.flip();
                        System.out.println("客户端说:" + new String(buffer.array(), 0, buffer.limit()));
                        try {
                            result.close();
                            asynchronousServerSocketChannel.close();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
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


    /**
     *异步非阻塞客户端通道
     */
    @Test
    public void client() throws IOException, InterruptedException {
        //1.创建asc对象
        AsynchronousSocketChannel asc = AsynchronousSocketChannel.open();

        //2.连接服务器
        asc.connect(new InetSocketAddress("127.0.0.1", 7777), null, new CompletionHandler<Void, Object>() {
            @Override
            public void completed(Void result, Object attachment) {
                System.out.println("连接成功,准备发送数据");
                ByteBuffer bb1 = ByteBuffer.wrap("你好,我是异步客户端".getBytes());
                //Future接口可以构建异步应用，是多线程开发中常见的设计模式。
                Future<Integer> future = asc.write(bb1);//并发
                try {
                    System.out.println("发送数据成功,大小是:" + future.get());
                    asc.close();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }


            }

            @Override
            public void failed(Throwable exc, Object attachment) {
                System.out.println("连接失败");
            }
        });
        //3.其他
        System.out.println("程序继续执行....");

        Thread.sleep(3000);
    }
}
