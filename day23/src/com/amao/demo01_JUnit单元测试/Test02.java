package com.amao.demo01_JUnit单元测试;

import org.junit.*;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/7/2 08:55
 */
public class Test02 {
    /**
     * 单元测试
     */
    @Test
    public void testAdd() {
        System.out.println(add(3, 5));
    }

    @Before
    public void method1() {
        System.out.println("我在之前执行了");//2
    }

    @After
    public void method2() {
        System.out.println("我在之后执行了");//4
    }

    @BeforeClass
    public static void method3() {
        System.out.println("我在类加载之前执行了");//1
    }
    @AfterClass
    public static void method4(){
        System.out.println("我在类加载完成之后执行了");//5
    }

    private int add(int a, int b) {
        return a + b;//3
    }
}
