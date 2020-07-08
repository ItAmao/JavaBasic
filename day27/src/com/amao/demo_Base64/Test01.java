package com.amao.demo_Base64;

import org.junit.Test;

import java.util.Base64;
import java.util.UUID;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/7/8 20:41
 */
public class Test01 {
    @Test
    public void test1() {
        //1.对普通字符串进行编码解码
        Base64.Encoder encoder = Base64.getEncoder();
        String string = encoder.encodeToString("HelloWorld".getBytes());
        System.out.println("编码之后的内容" + string);

        Base64.Decoder decoder = Base64.getDecoder();
        byte[] decode = decoder.decode(string);
        System.out.println("解码之后的内容" + new String(decode));
    }

    @Test
    public void test2() {
        //2.对URL进行编码解码
        Base64.Encoder urlEncoder = Base64.getUrlEncoder();
        String string = urlEncoder.encodeToString("www.baidu.com".getBytes());
        System.out.println("解码之后的内容" + string);

        Base64.Decoder urlDecoder = Base64.getUrlDecoder();
        byte[] decode = urlDecoder.decode(string);
        System.out.println("解码之后的内容" + new String(decode));
    }

    @Test
    public void test3() {
        //3.对MIME类型进行编码解析
        Base64.Encoder mimeEncoder = Base64.getMimeEncoder(4,"-".getBytes());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            UUID uuid = UUID.randomUUID();
            sb.append(uuid);
        }
        String encodeToString2 = mimeEncoder.encodeToString(sb.toString().getBytes());
        System.out.println(encodeToString2);

        Base64.Decoder mimeDecoder = Base64.getMimeDecoder();
        byte[] bs2 = mimeDecoder.decode(encodeToString2);
        System.out.println("解码之后的"+new String(bs2));
    }

}
