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
 *  @Author : ItAmao
 *  @Date   : 2020/7/3 15:11
 */
public class Test03 {
    @Test
    public void server() throws IOException {
        //1.创建对象
        ServerSocketChannel serverSocketChannel1 = ServerSocketChannel.open();
        //2.绑定端口
        serverSocketChannel1.bind(new InetSocketAddress(8090));
        //3.设置非阻塞
        serverSocketChannel1.configureBlocking(false);
        //4.创建选择器
        Selector selector = Selector.open();
        //5.注册
        serverSocketChannel1.register(selector, SelectionKey.OP_ACCEPT);

        //6.选择器选择方法就是帮助服务器等待服务端的到来
        selector.select();

        //7.当有客户端连接服务器,会把对象放入集合中
        Set<SelectionKey> keys = selector.keys();
        //8.处理数据,用增强for
        Iterator<SelectionKey> iterator = keys.iterator();
        while (iterator.hasNext()) {
            SelectionKey key = iterator.next();
            ServerSocketChannel channel1 = (ServerSocketChannel) key.channel();
            //获取客户端对象
            SocketChannel socketChannel = channel1.accept();
            //创建数组
            ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
            //读取数据
            int len = socketChannel.read(byteBuffer);
            System.out.println(new String(byteBuffer.array(), 0, len));

            //在发现一个服务端对象被连接时,会把这个对象放在一个集合中,但是使用完之后没有从集合中删除
            //导致下次在遍历集合时,已经被操作过的对象,再次被操作,导致出现空指针异常
            //解决办法:在使用完对象后,应该把这个对象从集合中删除
            iterator.remove();
        }
        //会出现修改并发异常
//        for (SelectionKey key : keys) {
//
//        }
    }
}
