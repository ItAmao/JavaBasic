package com.amao.homework;

/**
 *  @Author : ItAmao
 *  @Date   : 2020/7/2 17:57
 */
public class Test {
    public static void main(String[] args) {
        String show = show("2[ab3[c]]");
        System.out.println(show);
        String show1 = show("3[b5[c]]");
        System.out.println(show1);
    }

    public static String show(String s) {
        //获取传入字符串中第一次出现 [ 的索引
        int index;
        if ((index = s.indexOf("[")) != -1) {
            //传入的有[
            int num = Integer.parseInt(s.charAt(index - 1) + "");//获取次数
            //括号中的内容
            int left = index + 1;
            int right = s.lastIndexOf("]");
            //传给下一个show的字符串
            String next = s.substring(left, right);
            //本轮字符串除去次数和传给下次参数的剩余部分 ,这里用"   "替换是懒得写,目的只是区别出那部分
            String other = s.replace(num + "[" + next + "]", "   ");
            //传递给下次的返回值
            String showback = show(next);
            String realback = "";
            for (int i = 0; i < num; i++) {
                realback += showback;
            }
            String realString = other.replace("   ", realback);
            return realString;
        } else {
            //传入的没有 [
            return s;
        }

    }

}
