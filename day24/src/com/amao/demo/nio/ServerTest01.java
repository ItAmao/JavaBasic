package com.amao.demo.nio;

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
 *  @Author : ItAmao
 *  @Date   : 2020/7/3 18:25
 */
public class ServerTest01 {
    @Test
    public void server() throws IOException {
        //ServerSocketChannel这是nio对于ServerSocket进行的封装
        ServerSocketChannel ssc = ServerSocketChannel.open();
        ssc.socket().bind(new InetSocketAddress("127.0.0.1", 8888));
        ssc.configureBlocking(false);//设置阻塞为非阻塞模型

        System.out.println("server started, listening on:" + ssc.getLocalAddress());

        Selector selector = Selector.open();

        ssc.register(selector, SelectionKey.OP_ACCEPT);//注册对哪件事感兴趣,有客户端连接上的

        //轮循
        while (true) {
            selector.select();
            Set<SelectionKey> keys = selector.selectedKeys();
            Iterator<SelectionKey> it = keys.iterator();
            while (it.hasNext()) {
                SelectionKey key = it.next();
                it.remove(); //如果不remove下一次循环的时候 事件还会处理一次
                handle(key);
            }
        }
    }

    private static void handle(SelectionKey key) {
        //说明有客户端想要连接上来
        if (key.isAcceptable()) {
            try {
                ServerSocketChannel ssc = (ServerSocketChannel) key.channel();
                SocketChannel sc = ssc.accept();
                sc.configureBlocking(false);
                sc.register(key.selector(), SelectionKey.OP_ACCEPT);
            } catch (IOException e) {
                e.printStackTrace();
            } finally {

            }
            //如果说可以读的话
        } else if (key.isReadable()) { //需要复位操作flip
            SocketChannel sc = null;
            try {
                sc = (SocketChannel) key.channel();
                ByteBuffer buffer = ByteBuffer.allocate(512);
                buffer.clear();
                int len = sc.read(buffer);
                if (len != -1) {
                    System.out.println(new String(buffer.array(), 0, len));
                }
                ByteBuffer bufferToWrite = ByteBuffer.wrap("HelloClient".getBytes());
                sc.write(bufferToWrite);
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (sc != null) {
                    try {
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

}
