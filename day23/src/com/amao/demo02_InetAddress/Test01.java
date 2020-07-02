package com.amao.demo02_InetAddress;

import org.junit.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/7/2 09:58
 */
public class Test01 {
    @Test
    public void test() throws UnknownHostException {
        //1.获取本机的IP地址
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);
        //获取主机名
        String hostName = localHost.getHostName();
        System.out.println(hostName);
        //获取IP地址
        System.out.println(localHost.getHostAddress());

        //2.根据IP地址字符或主机名获得对应的IP地址对象
        InetAddress byName = InetAddress.getByName("127.0.0.1");
        System.out.println(byName);
        //3.

    }
}
