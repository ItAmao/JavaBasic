package com.amao.homework.demo08;

public class Test {
    public static void main(String[] args) {
        String txt = "Java语言是面向对象的，Java语言是健壮的，Java语言是安全的，Java是高性能的，Java语言是跨平台的";
        String target = "Java";
        System.out.println(times(txt, target));
    }

    /*
    // 查找参数字符串str在调用方法的字符串中第一次出现的索引，如果不存在，返回-1
        public int indexOf(String str)

        // 截取字符串，从索引beginIndex（包含）开始到字符串的结尾
        public String substring(int beginIndex)


     */
    public static int times(String txt, String target) {
        int count = 0;
        //如果找到了，那么就记录出现的位置并在剩余的字符串中继续查找该子串，
        // 而剩余字符串的起始位是出现位置再加上子串的长度。
        while (txt.indexOf(target) != -1) {
            int index = txt.indexOf(target);
            count++;
            txt = txt.substring(index + target.length());
        }
        return count;
    }
}
