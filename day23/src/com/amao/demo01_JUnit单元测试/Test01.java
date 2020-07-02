package com.amao.demo01_JUnit单元测试;

import org.junit.Test;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/7/2 08:45
 */
public class Test01 {
    /**
     * 单元测试
     */
    @Test
    public void testAdd() {
        System.out.println(add(3, 5));
    }

    private int add(int a, int b) {
        return a + b;
    }
}
