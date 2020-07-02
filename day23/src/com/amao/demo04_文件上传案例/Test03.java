package com.amao.demo04_文件上传案例;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * 客户端和服务端通信
 *
 *  @Author : ItAmao
 *  @Date   : 2020/7/2 12:14
 */
public class Test03 {
    /**
     * 客户端
     */
    @Test
    public void client() throws IOException {
        //1.创建Socket对象
        Socket socket = new Socket("127.0.0.1", 8090);
        while (true) {
            //准备信息
            String message = new Scanner(System.in).nextLine();
            //2.获取通道中的输出流
            OutputStream outputStream = socket.getOutputStream();
            //3.发送消息
            outputStream.write(message.getBytes());

            InputStream inputStream = socket.getInputStream();
            int len;
            byte[] bytes = new byte[1024];
            len = inputStream.read(bytes);
            System.out.println("服务端说:" + new String(bytes, 0, len));
        }
    }

    @Test
    public void server() throws IOException {

    }
}
