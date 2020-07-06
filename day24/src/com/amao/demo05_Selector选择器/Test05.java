package com.amao.demo05_Selector选择器;

import org.junit.Test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Set;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/7/4 12:19
 */
public class Test05 {
    @Test
    public void client() {
        //1.创建三个线程,分别模拟一个客户端
        //客户端1
        new Thread(() -> {
            while (true) {
                try (SocketChannel socket = SocketChannel.open()) {

                    System.out.println("7777客户端连接服务器......");

                    socket.connect(new InetSocketAddress("127.0.0.1", 7777));

                    System.out.println("7777客户端连接成功....");

                    break;
                } catch (IOException e) {
                    System.out.println("7777异常重连");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    }
                }
            }
        }).start();

        //客户端2
        new Thread(() -> {
            while (true) {
                try (SocketChannel socket = SocketChannel.open()) {

                    System.out.println("8888客户端连接服务器......");

                    socket.connect(new InetSocketAddress("127.0.0.1", 8888));

                    System.out.println("8888客户端连接成功....");

                    break;
                } catch (IOException e) {
                    System.out.println("8888异常重连");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    }
                }
            }
        }).start();

        //客户端3
        new Thread(() -> {
            while (true) {
                try (SocketChannel socket = SocketChannel.open()) {

                    System.out.println("9999客户端连接服务器......");

                    socket.connect(new InetSocketAddress("127.0.0.1", 9999));

                    System.out.println("9999客户端连接成功....");

                    break;
                } catch (IOException e) {
                    System.out.println("9999异常重连");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    }
                }
            }
        }).start();
    }


    /**
     * 服务端
     */
    @Test
    public void server01() throws IOException, InterruptedException {
        //1.创建多个服务通道
        //服务器通道1
        ServerSocketChannel serverSocketChannel1 = ServerSocketChannel.open();
        serverSocketChannel1.configureBlocking(false);
        serverSocketChannel1.bind(new InetSocketAddress(7777));
        //服务器通道2
        ServerSocketChannel serverSocketChannel2 = ServerSocketChannel.open();
        serverSocketChannel2.configureBlocking(false);
        serverSocketChannel2.bind(new InetSocketAddress(8888));
        //服务器通道3
        ServerSocketChannel serverSocketChannel3 = ServerSocketChannel.open();
        serverSocketChannel3.configureBlocking(false);
        serverSocketChannel3.bind(new InetSocketAddress(9999));

        //获取选择器对象
        Selector selector = Selector.open();
        //将多个通道注册到选择器上
        SelectionKey key1 = serverSocketChannel1.register(selector, SelectionKey.OP_ACCEPT);
        //ServerSocketChannel channel = (ServerSocketChannel)key.channel();
        SelectionKey key2 = serverSocketChannel2.register(selector, SelectionKey.OP_ACCEPT);
        SelectionKey key3 = serverSocketChannel3.register(selector, SelectionKey.OP_ACCEPT);


        //使用选择器
        Set<SelectionKey> keys = selector.keys();
        System.out.println("注册通道数量：" + keys.size());

        Set<SelectionKey> selectionKeys = selector.selectedKeys();
        System.out.println("已连接的通道数量：" + selectionKeys.size());

        System.out.println("---------------------------------");
        System.out.println("服务器等待客户端连接...");
        for (int i = 0; i < 3; i++) {
            int count = selector.select();
            //a.如果没有一个通道被连接,此方法会阻塞
            //b.返回值代表本次被连接的通道数量
            System.out.println("本次被连接数量：" + count);
            Thread.sleep(1000);
        }
    }
}
