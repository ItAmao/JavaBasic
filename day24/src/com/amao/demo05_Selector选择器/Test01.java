package com.amao.demo05_Selector选择器;

import org.junit.Test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.util.Set;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/7/3 14:36
 */
public class Test01 {
    /**
     * 服务器端
     */
    @Test
    public void server01() throws IOException {
        //创建
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        //绑定一个端口
        serverSocketChannel.bind(new InetSocketAddress(8090));
        //设置非阻塞
        serverSocketChannel.configureBlocking(false);
        //创建选择器
        Selector selector = Selector.open();
        //注册
        //让选择器帮忙管理accept()这个方法
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);

        //这个方法就是选择器等待客户端的方法
        //被连接的服务器的端口会被放在这个集合中,
        //返回一个Set集合,集合中存放的是被连接的集合的对象
        Set<SelectionKey> selectionKeys = selector.selectedKeys();
        //这个集合放的是所有注册的服务端对象
        //返回的是一个Set集合,集合中
        Set<SelectionKey> keys = selector.keys();
        while (true) {
            System.out.println("正在连接客户端");
            System.out.println("连接用户数:" + selectionKeys.size());
            System.out.println("注册的个数为:" + keys.size());

            //选择器的选择方法,这个方法就是在监听客户端的连接
            selector.select(); //阻塞问题:在没有客户端连接的情况下,方法是阻塞的
                                //在有客户端连接时,方法是非阻塞的
                                //客户端被处理之后,方法又进入阻塞状态

            System.out.println("客户端连接成功");
            System.out.println("连接用户数:" + selectionKeys.size());
        }
    }

}
