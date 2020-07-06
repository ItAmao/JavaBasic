package com.amao.demo05_Selector选择器;

import org.junit.Test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/7/4 12:08
 */
public class Test04 {
    @Test
    public void selectorTest() throws IOException {


        //2.获取选择器对象
        Selector selector = Selector.open();

        //3.将多个通道设置到选择器上
        //1.创建多个服务通道

        ServerSocketChannel.open().bind(new InetSocketAddress(7777))
                .configureBlocking(false).register(selector, SelectionKey.OP_ACCEPT);
        ServerSocketChannel.open().bind(new InetSocketAddress(8888)).configureBlocking(false)
                .register(selector, SelectionKey.OP_ACCEPT);
        ServerSocketChannel.open().bind(new InetSocketAddress(9999)).configureBlocking(false)
                .register(selector, SelectionKey.OP_ACCEPT);



    }
}
