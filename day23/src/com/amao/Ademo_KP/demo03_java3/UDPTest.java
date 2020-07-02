package com.amao.Ademo_KP.demo03_java3;

import org.junit.Test;

import java.io.IOException;
import java.net.*;

/**
 * UDP协议的网络编程
 *
 *  @Author : ItAmao
 *  @Date   : 2020/7/1 14:11
 */
public class UDPTest {

    /**
     * 发送端
     */
    @Test
    public void send() throws IOException {
        DatagramSocket socket = new DatagramSocket();
        String str = "我是UDP方式发送的导弹";
        byte[] data = str.getBytes();
        InetAddress inet = InetAddress.getLocalHost();
        DatagramPacket packet = new DatagramPacket(data, 0, data.length, inet, 9090);
        socket.send(packet);
        socket.close();
    }

    /**
     * 接收端
     */
    @Test
    public void receive() throws IOException {
        DatagramSocket socket = new DatagramSocket(9090);
        byte[] bytes = new byte[100];
        DatagramPacket packet = new DatagramPacket(bytes, 0, bytes.length);
        socket.receive(packet);
        System.out.println(new String(packet.getData(), packet.getLength()));
        socket.close();
    }
}
