package com.amao.demo05_Selector选择器;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SocketChannel;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/7/4 12:39
 */
public class SelectorDemo {
    public static void main(String[] args) throws InterruptedException {
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
}
