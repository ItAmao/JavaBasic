package com.amao.Ademo_KP.demo02_java2;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/7/1 17:18
 */
public class TCPTest4 {
    /**
     * 服务端
     */
    @Test
    public void server() throws IOException {
        //创建带端口号的服务器
        System.out.println("服务器启动...");
        ServerSocket ss = new ServerSocket(8888);
        System.out.println("等待连接...");
        //获得连接用户
        Socket sk = ss.accept();
        //输入流 读取信息
        System.out.println("连接成功...");
        InputStream is = sk.getInputStream();

        System.out.println("接收文件中...");
        int len = 0;
        byte[] bs = new byte[1024];
        while ((len = is.read(bs)) != -1) {
            System.out.println(new String(bs, 0, len));
        }
        sk.shutdownOutput();
        OutputStream os = sk.getOutputStream();
        System.out.println("发送回信..");
        os.write("服务器说：你好，客户端".getBytes());
        os.close();
        is.close();
        sk.close();
        ss.close();
    }

    /**
     * 客户端
     */
    @Test
    public void client() throws IOException {
        //建立客户端
        System.out.println("正在连接服务器...");
        Socket sk = new Socket("127.0.0.1", 8888);
        System.out.println("连接成功...");
        //获取数据流
        OutputStream os = sk.getOutputStream();
        //发送内容你好，服务器
        os.write("你好，服务器".getBytes());
        System.out.println("信息发送成功..");
        System.out.println("接收回信...");
        InputStream in = sk.getInputStream();
        int len = 0;
        byte[] bs = new byte[1024];
        while ((len = in.read(bs)) != -1) {
            System.out.println(new String(bs, 0, len));
        }
        sk.shutdownOutput();
        in.close();
        os.close();
        sk.close();

    }
}
