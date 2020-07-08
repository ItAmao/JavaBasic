package com.amao.demo05_正则表达式;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/7/7 14:25
 */
public class Test02 {
    @Test
    public void test1() {
        String s = "2[ab3[c]4[b]]3[a]";
        String s1 = "2[abccc]";
        String matches = "(\\d+)\\[([a-zA-Z]+)\\]";
//        Pattern pattern = Pattern.compile(matches);
//        Matcher matcher = pattern.matcher(s);
//        while (matcher.find()) {
//            System.out.println(matcher.group());
//        }
        matches(matches, s);
    }

    /**
     * 利用正则匹配
     */
    public static void matches(String matches, String s) {
        if (!(s.contains("[") && s.contains("]"))) {
            System.out.println(s);
            return;
        }
        Pattern pattern = Pattern.compile(matches);
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            String group = matcher.group();
            s = s.replace(group, times(group));
        }
        matches(matches, s);
    }

    /**
     * 分离数字,匹配字符串
     */
    public static String times(String s) {
        //String s = "2[ab3ccc]";
        char firNum = s.charAt(0);
        int num = firNum - '0';
        //System.out.println(num);
        //System.out.println(firNum);
        s = s.substring(1);
        String a = "";
        //System.out.println(s);
        for (int i = 0; i < num; i++) {
            a += s;
        }
        a = a.replace("[", "");
        a = a.replace("]", "");
//        System.out.println(a);
        return a;
    }
}
