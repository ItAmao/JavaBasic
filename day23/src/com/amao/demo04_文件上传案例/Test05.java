package com.amao.demo04_文件上传案例;

import org.junit.Test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 文件上传案例实现(代码演示)
 *
 *  @Author : ItAmao
 *  @Date   : 2020/7/2 16:30
 */
public class Test05 {
    /**
     * 客户端 ------>1.创建Socket对象,指定要连接的ip地址和端口号
     *              2.获取通道中的输出流
     *              3.创建一个文件字节流
     *                  一边读,一边发送给客户端
     *
     */
    @Test
    public void client() throws IOException {
        //1.创建Socket对象,指定要连接的ip地址和端口号
        System.out.println("连接服务器...");
        Socket socket = new Socket("127.0.0.1", 8090);
        System.out.println("服务器连接成功...");
        //2.获取通道中的输出流
        OutputStream outputStream = socket.getOutputStream();
        //3.创建一个文件字节流
        String path = "/Users/mao/Documents/code/basic/day23/src/com/amao/demo04_文件上传案例/1.jpg";
        File file = new File(path);
        FileInputStream fileInputStream = new FileInputStream(file);
        System.out.println("开始发送文件...");
        int len;
        byte[] bytes = new byte[1024];
        while ((len = fileInputStream.read(bytes)) != -1) {
            outputStream.write(bytes, 0, len);
        }
        //文件发送完毕.必须要告诉服务端,因为最后一次-1的时候客户端就撤了,可是服务端的while循环一直读不到-1,就一直在等
        socket.shutdownOutput();
        System.out.println("文件发送完毕");
        //获取通道中的输入流,来获取服务端的消息
        InputStream inputStream = socket.getInputStream();
        //调用read方法
        len = inputStream.read(bytes);
        System.out.println("服务端说:" + new String(bytes, 0, len));
        //释放资源
        inputStream.close();
        outputStream.close();
        fileInputStream.close();
        socket.close();
        System.out.println("客户端关闭了");
    }

    /**
     * 服务端----->1.创建服务器ServerSocket对象,并指定运行的端口号
     *            2.接收连接过来的客户端对象
     *            3.获取通道中的输入流
     *            4.创建一个文件的字节输出流
     */
    @Test
    public void server() throws IOException {
        //1.创建服务器ServerSocket对象,并指定要运行的端口号
        ServerSocket serverSocket = new ServerSocket(8090);
        System.out.println("服务器启动...");
        //2.接收连接过来的客户端对象
        System.out.println("等待客户端...");
        Socket socket = serverSocket.accept(); //阻塞
        System.out.println("客户端来了...");
        //3.获取通道中的输入流
        InputStream inputStream = socket.getInputStream();
        //4.创建一个字节的输出流
        String path = "/Users/mao/Documents/code/basic/day23/src/com/amao/demo04_文件上传案例/3.jpg";
        File file = new File(path);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        System.out.println("开始接收文件...");
        //5.接收文件
        byte[] bytes = new byte[1024];
        int len;
        while ((len = inputStream.read(bytes)) != -1) {
            fileOutputStream.write(bytes, 0, len);
        }
        System.out.println("接收文件完毕...");
        //6.获取通道中的输出流
        OutputStream outputStream = socket.getOutputStream();
        //7.调用writer方法给客户端写消息
        outputStream.write("交易完成,撤退".getBytes());
        System.out.println("给客户端发送回信...");
        //8.释放资源
        outputStream.close();
        inputStream.close();
        fileOutputStream.close();
        //socket.close();
        serverSocket.close();
        System.out.println("关闭服务器...");
    }
}
