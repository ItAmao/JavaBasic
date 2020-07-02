package com.amao.demo03_TCP通信程序;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * 客户端和服务端聊天
 *
 *  @Author : ItAmao
 *  @Date   : 2020/7/2 20:16
 */
public class Test06 {
    @Test
    public void server() throws IOException {
        ServerSocket serverSocket = new ServerSocket(8090);
        Socket socket = serverSocket.accept();
        while (true) {
            InputStream inputStream = socket.getInputStream();
            int len;
            byte[] bytes = new byte[1024];
            len = inputStream.read(bytes);
            System.out.println("阿毛:" + new String(bytes, 0, len));

            String str = new Scanner(System.in).nextLine();
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write(str.getBytes());
        }
    }

    @Test
    public void client() throws IOException {
        Socket socket = new Socket("127.0.0.1", 8090);
        while (true) {
            String str = new Scanner(System.in).nextLine();
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write(str.getBytes());

            InputStream inputStream = socket.getInputStream();
            int len;
            byte[] bytes = new byte[1024];
            len = inputStream.read(bytes);
            System.out.println("马云:" + new String(bytes, 0, len));
        }
    }
}
