package com.amao.demo02_InetAddress;

import org.junit.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *  InetAddress 测试
 *
 *  @Author : ItAmao
 *  @Date   : 2020/7/2 15:48
 */
public class Test02 {
    /**
     * 成员方法
     */
    @Test
    public void testInetAddress02() throws UnknownHostException {
        //1.获取InetAddress对象
        InetAddress inetAddress = InetAddress.getLocalHost();
        //2.获取主机名
        String hostName = inetAddress.getHostName();
        System.out.println(hostName);
        //3.获取ip地址字符串
        String hostAddress = inetAddress.getHostAddress();
        System.out.println(hostAddress);
    }

    /**
     * 静态方法
     */
    @Test
    public void testInetAddress01() throws UnknownHostException {
        //静态方法
        //1.获取InetAddress对象
        InetAddress inetAddress = InetAddress.getLocalHost();
        System.out.println(inetAddress);
        //2.获取其他主机的ip地址对象
        InetAddress byName = InetAddress.getByName("www.baidu.com");
        System.out.println(byName);

    }
}
