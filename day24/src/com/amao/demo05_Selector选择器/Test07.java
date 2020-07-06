package com.amao.demo05_Selector选择器;

import org.junit.Test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 * Selector多路信息接收测试
 *
 *  @Author : ItAmao
 *  @Date   : 2020/7/4 14:29
 */
public class Test07 {
    /**
     * 创建多线程客户端
     */
    @Test
    public void client() {
        new Thread(() -> {
            while (true) {
                try (SocketChannel sc = SocketChannel.open()) {
                    System.out.println("7777客户端正在连接中....");
                    sc.connect(new InetSocketAddress("127.0.0.1", 7777));
                    System.out.println("7777客户端连接成功....");

                    //和服务器进行通信
                    //a.先发数据
                    ByteBuffer bb1 = ByteBuffer.allocate(1024);
                    bb1.put("你好,服务端,我是7777客户端".getBytes());
                    bb1.flip();
                    sc.write(bb1);

                    //b.读取数据
                    ByteBuffer bb2 = ByteBuffer.allocate(1024);
                    sc.read(bb2);
                    bb2.flip();
                    System.out.println("服务端说:" + new String(bb2.array(), 0, bb2.limit()));
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


        new Thread(() -> {
            while (true) {
                try (SocketChannel sc = SocketChannel.open()) {
                    System.out.println("8888客户端正在连接");
                    sc.connect(new InetSocketAddress("127.0.0.1", 8888));
                    System.out.println("8888客户端连接成功");

                    //先和服务器进行通信
                    //先发数据
                    ByteBuffer bb1 = ByteBuffer.allocate(1024);
                    bb1.put("你好,服务端,我是客户端8888".getBytes());
                    bb1.flip();
                    sc.write(bb1);

                    //接收数据
                    ByteBuffer bb2 = ByteBuffer.allocate(1024);
                    sc.read(bb2);
                    bb2.flip();
                    System.out.println("客户端说:" + new String(bb2.array(), 0, bb2.limit()));
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

        new Thread(() -> {
            while (true) {
                try (SocketChannel sc = SocketChannel.open()) {
                    System.out.println("客户端9999正在连接");
                    sc.connect(new InetSocketAddress("127.0.0.1", 9999));
                    System.out.println("客户端9999连接成功");

                    //与服务端进行操作
                    //
                    ByteBuffer bb1 = ByteBuffer.allocate(1024);
                    bb1.put("你好服务端,我是客户端9999".getBytes());
                    bb1.flip();
                    sc.write(bb1);
                    System.out.println("客户端9999发送成功");

                    //
                    ByteBuffer bb2 = ByteBuffer.allocate(1024);
                    sc.read(bb2);
                    bb2.flip();
                    System.out.println("服务端说:" + new String(bb2.array(), 0, bb2.limit()));
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
    }

    /**
     * 服务端
     */
    @Test
    public void server() throws IOException, InterruptedException {
        //创建3个通道
        //1
        ServerSocketChannel ssc1 = ServerSocketChannel.open();
        ssc1.configureBlocking(false);
        ssc1.bind(new InetSocketAddress(7777));
        //2
        ServerSocketChannel ssc2 = ServerSocketChannel.open();
        ssc2.configureBlocking(false);
        ssc2.bind(new InetSocketAddress(8888));

        //3.
        ServerSocketChannel ssc3 = ServerSocketChannel.open();
        ssc3.configureBlocking(false);
        ssc3.bind(new InetSocketAddress(9999));

        //创建选择器
        Selector selector = Selector.open();

        //注册
        SelectionKey r1 = ssc1.register(selector, SelectionKey.OP_ACCEPT);
        SelectionKey r2 = ssc2.register(selector, SelectionKey.OP_ACCEPT);
        SelectionKey r3 = ssc3.register(selector, SelectionKey.OP_ACCEPT);

        //使用选择器
        System.out.println("等待客户端连接");

        while (true) {
            int count = selector.select();
            System.out.println("本次新增的通道个数为:" + count);
            //获取所有被连接的通道
            Set<SelectionKey> keys = selector.keys();
            //遍历这些通道
            Iterator<SelectionKey> it = keys.iterator();
            //迭代器遍历
            while (it.hasNext()) {
                SelectionKey key = it.next();
                //调用SelectionKey中的channel方法
                ServerSocketChannel serverSocketChannel = (ServerSocketChannel) key.channel();
                //被连接的通道
                System.out.println("被连接的通道为:" + serverSocketChannel);

                //获取连接到这个服务器通道的客户端
                SocketChannel sc = serverSocketChannel.accept();

                System.out.println("连接到此客户端是:" + sc);

                //服务端先收数据
                ByteBuffer bb = ByteBuffer.allocate(1024);
                sc.read(bb);
                bb.flip();
                System.out.println("接收到的数据是:" + new String(bb.array(), 0, bb.limit()));

                //服务端在回数据
                ByteBuffer bb1 = ByteBuffer.allocate(1024);
                bb1.put(("我是服务端," + System.currentTimeMillis()).getBytes());
                bb1.flip();
                sc.write(bb);
                System.out.println("给客户端回信成功,,,," + sc);
                //处理完之后,需要从集合删除,要不然还会执行
                it.remove();
            }
            System.out.println("-----------------");
            Thread.sleep(1000);
        }

    }
}
