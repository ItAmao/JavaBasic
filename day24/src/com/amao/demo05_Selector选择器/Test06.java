package com.amao.demo05_Selector选择器;

import org.junit.Test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/7/4 12:41
 */
public class Test06 {
    /**
     * 实现多路连接
     */
    @Test
    public void server01() throws IOException, InterruptedException {
        ServerSocketChannel ssc1 = ServerSocketChannel.open();
        ssc1.configureBlocking(false);
        ssc1.bind(new InetSocketAddress(7777));

        ServerSocketChannel ssc2 = ServerSocketChannel.open();
        ssc2.configureBlocking(false);
        ssc2.bind(new InetSocketAddress(8888));

        ServerSocketChannel ssc3 = ServerSocketChannel.open();
        ssc3.configureBlocking(false);
        ssc3.bind(new InetSocketAddress(9999));

        //设置选择器
        Selector selector = Selector.open();

        //把上边3个通道注册选择器上
        SelectionKey r1 = ssc1.register(selector, SelectionKey.OP_ACCEPT);
        SelectionKey r2 = ssc2.register(selector, SelectionKey.OP_ACCEPT);
        SelectionKey r3 = ssc3.register(selector, SelectionKey.OP_ACCEPT);

        //------------------------------------------------------------
        //选择选择器
        System.out.println("服务器等待客户连接");
        while (true) {
            int s = selector.select();//获取连接通道的个数
            System.out.println("本次新增的连接通道的个数:" + s);

            //获取所有被连接通道的个数
            Set<SelectionKey> keys = selector.keys();

            //遍历连接通道的集合,这里需要用到迭代器,因为循环一遍之后,有的个数还会被循环一次
            Iterator<SelectionKey> it = keys.iterator();

            while (it.hasNext()) {
                SelectionKey key = it.next();
                //调用SelectionKey的channel方法
                ServerSocketChannel channel = (ServerSocketChannel) key.channel();
                System.out.println("被连接的通道:" + channel);
                //获取连接到这个服务器通道的客户端
                SocketChannel sc = channel.accept();
                System.out.println("连接到此通道的客户端是:" + sc);
                it.remove();
            }
            System.out.println("======================================");
            Thread.sleep(3000);
        }

    }

    @Test
    public void client01() {
        //创建3个多线程服务端


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

}
