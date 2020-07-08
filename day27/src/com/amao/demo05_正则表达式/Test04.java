package com.amao.demo05_正则表达式;

import org.junit.Test;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/7/8 21:16
 */
public class Test04 {
    /**
     * 判断qq是否合法
     */
    @Test
    public void test1() {
        String qq = "";
        qq.matches("[1-9]\\d{4,11}");
    }

}
