package com.amao.demo04_文件上传案例;

import org.junit.Test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 多线程版本的服务器:
 *
 *  @Author : ItAmao
 *  @Date   : 2020/7/2 16:48
 */
public class Test06 {

    @Test
    public void server() throws IOException {
        //1.创建ServerSocket对象,并指定要运行的端口号
        ServerSocket serverSocket = new ServerSocket(8090);
        System.out.println("服务器启动...");
        while (true) {
            System.out.println("等待客户端...");
            //2.接收要连接的客户端
            Socket socket = serverSocket.accept();//阻塞
            System.out.println("客户端来了...");
            //3.创建一个多线程,在线程中与客户端进行数据交互
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        //4.获取通道中的输入流
                        InputStream inputStream = socket.getInputStream();
                        //5.创建一个文件的字节输出流
                        String path = "/Users/mao/Documents/code/basic/day23/src/com/amao/" +
                                "demo04_文件上传案例/" + System.currentTimeMillis() + ".jpg";
                        File file = new File(path);
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        //6.接收文件
                        int len;
                        byte[] bytes = new byte[1024];
                        while ((len = inputStream.read(bytes)) != -1) {
                            fileOutputStream.write(bytes, 0, len);
                        }
                        //7.获取通道中的输出流
                        OutputStream outputStream = socket.getOutputStream();
                        //8.发送消息给客户端
                        outputStream.write("交易成功,撤退".getBytes());
                        System.out.println("给客户端发送回信...");
                        //9释放资源
//                        outputStream.close();
//                        inputStream.close();
//                        fileOutputStream.close();
                        //socket.close();
                        //serverSocket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }
}
