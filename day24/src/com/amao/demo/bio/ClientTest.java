package com.amao.demo.bio;

import org.junit.Test;

import java.io.IOException;
import java.net.Socket;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/7/3 18:07
 */
public class ClientTest {
    @Test
    public void client() throws IOException {
        Socket s = new Socket("127.0.0.1", 8888);
        s.getOutputStream().write("HelloWorld".getBytes());//阻塞
        s.getOutputStream().flush();
        System.out.println("write over,waiting for msg back....");
        byte[] bytes = new byte[1024];
        int len = s.getInputStream().read(bytes); //阻塞
        System.out.println(new String(bytes, 0, len));
        s.close();
    }
}
