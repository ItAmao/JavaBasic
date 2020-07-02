package com.amao.demo01_JUnit单元测试;

import org.junit.Assert;
import org.junit.Test;

/**
 * 断言
 *
 *  @Author : ItAmao
 *  @Date   : 2020/7/2 09:02
 */
public class Test03 {
    /*
        减法运算
     */
    @Test
    public void testSub() {
        int sub = sub(5, 3);
        System.out.println(sub);
        //断言
        //第一个参数是预期值,第二个参数是实际值
        //如果第一个数和第二个数不一样,则会出错
        Assert.assertEquals(2,sub);
    }


    public int sub(int a, int b) {
        return a - b;
    }

}
