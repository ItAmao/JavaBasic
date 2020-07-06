package com.amao.demo.bio;

import org.junit.Test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 *  @Author : ItAmao
 *  @Date   : 2020/7/3 17:53
 */
public class ServerTest {
    @Test
    public void server() throws IOException {
        //在正常处理的时候,不能抛出异常需要try来处理
        ServerSocket ss = new ServerSocket();
        ss.bind(new InetSocketAddress("127.0.0.1", 8888));
        while (true) {
            Socket s = ss.accept(); //阻塞方法
            new Thread(() -> {
                handle(s);
            }).start();
        }

    }

    public static void handle(Socket s) {
        try {
            byte[] bytes = new byte[1024];
            int len = s.getInputStream().read(bytes);//阻塞
            System.out.println(new String(bytes, 0, len));

            s.getOutputStream().write(bytes, 0, len);//阻塞
            s.getOutputStream().flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
