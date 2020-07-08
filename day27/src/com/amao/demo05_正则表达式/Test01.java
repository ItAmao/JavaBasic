package com.amao.demo05_正则表达式;

import org.junit.Test;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/7/7 10:36
 */
public class Test01 {
    /**
     * 字符类
     */
    @Test
    public void test1() {
        String s = "";

        //用正则表达式去匹配字符串的方法
        //表示第一个字符为 abc其中的一个
        //第二个字符表示 0-9
        //第三个字符表示不能为abc
        System.out.println(s.matches("[abc][0-9][^abc]"));
    }

    /**
     * 逻辑运算符
     */
    @Test
    public void test2() {
        String s = "";
        System.out.println(s.matches("[a-z&&[^bcd]]"));
    }

    /**
     * 预定义字符
     */
    @Test
    public void test3() {
        String s = "";
        //预定义字符不能加[]
        boolean matches = s.matches(".\\d");
    }

    /**
     * 数量词
     */
//      1. X? : 0次或1次
//      2. X* : 0次到多次
//      3. X+ : 1次或多次
//      4. X{n} : 恰好n次
//      5. X{n,} : 至少n次
//      6. X{n,m}: n到m次(n和m都是包含的)
    @Test
    public void test4() {
        String s = "452861727@qq.com";
        //System.out.println(s.matches("\\d{4,6} \\w{4,6}"));
        //System.out.println(s.matches(".*雨.*"));

        //String matches = "\\w{6,12}@[a-z0-9{2,6}]\\.com";
        // System.out.println(s.matches("\\w{6,12}@[a-z0-9]{2,6}\\.com"));
        String matches = "[\\w&&[^_]]{6,12}@[a-z0-9]{2,6}\\.com";
        System.out.println(s.matches(matches));
    }

    /*
    分组括号
    ()代表分组,从前往后,第一个小括号代表的是第一组,第二个小括号代表的是第二组
    \\1表示再次出现第一组的内容  \\2表示再次的出现第二组的内容
     */
    @Test
    public void test5() {
        String s = "abc123";
        //System.out.println(s.matches("([a-z])\\1([a-z])\\2"));
        System.out.println(s.matches(""));

    }

    /*
        split;
        replaceAll:
     */

}
