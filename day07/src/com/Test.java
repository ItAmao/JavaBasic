package com;

import java.awt.geom.FlatteningPathIterator;
import java.util.ArrayList;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        //1.判断一个字符串 是否是 "等括号"字符串
        //等括号的含义
        //1).必须成对出现 有开始有结束  "()" "[]"
        //2).允许括号嵌套  "([])"  "[{}([])]"
        //3).但是不允许单独嵌套  "{(})" "({[}])"
        //4).字符串中只有一共四种括号 () [] {} <>
        //题目: 要用户输入一个只包含这四种括号的字符串,我们判断该字符串是否是"等括号"字符串
//        long startTime = System.nanoTime();
//        String s = "[{}([])][{}([])][{}([])][{}([])][{}([])][{}([])][{}([])][{}([])][{}([])][{}([])]";
//        boolean bool = isValid(s);
//        System.out.println(bool);
//        long endTime = System.nanoTime();
//        System.out.println((endTime - startTime) / 100000000.0);
//        System.out.println("========");
//        long startTime1 = System.nanoTime();
//        boolean bool1 = isValid4(s);
//        System.out.println(bool);
//        long endTime1 = System.nanoTime();
//        System.out.println((endTime1 - startTime1) / 100000000.0);
        String s = "<<>{}()[]>";
        boolean bool = isValid(s);
        System.out.println(bool);
    }

    public static boolean isValid4(String s) {
        while (s.contains("{}") || s.contains("[]") || s.contains("()")) {
//            if (s.contains("{}")) s = s.replace("{}", "");
//            if (s.contains("()")) s = s.replace("()", "");
//            if (s.contains("[]")) s = s.replace("[]", "");
            s = s.replace("{}", "");
            s = s.replace("()", "");
            s = s.replace("[]", "");

        }
        return s.isEmpty();
    }

    public static boolean isValid(String s) {
        while (s.contains("{}") || s.contains("[]") || s.contains("()") || s.contains("<>")) {
            if (s.contains("{}")) s = s.replace("{}", "");
            if (s.contains("()")) s = s.replace("()", "");
            if (s.contains("[]")) s = s.replace("[]", "");
            if (s.contains("<>")) s = s.replace("<>", "");
//            s = s.replace("{}", "");
//            s = s.replace("()", "");
//            s = s.replace("[]", "");

        }
        return s.isEmpty();
    }

    public boolean isValid2(String s) {
        char[] charArray = new char[s.length() + 1];
        int p = 1;
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                charArray[p++] = c;
            } else {
                p--;
                if (c == ')' && charArray[p] != '(') {
                    return false;
                }
                if (c == '}' && charArray[p] != '{') {
                    return false;
                }
                if (c == ']' && charArray[p] != '[') {
                    return false;
                }
            }
        }
        return p == 1; // 如果左括号还有剩余 括号没有一一对应，属于无效情况
    }

    public static boolean isValid3(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);//把c压入栈中
            } else if (c == ')' || c == '}' || c == ']') {
                //如果是右括号 把栈里的元素取出来匹配
                //先判断栈是否为空
                if (stack.isEmpty()) {
                    return false;
                }
                //栈不为空
                char topChar = stack.pop();//取出栈顶元素
                if (c == ')' && topChar != '(') {
                    return false;
                }
                if (c == ']' && topChar != '[') {
                    return false;
                }
                if (c == '}' && topChar != '{') {
                    return false;
                }
            } else {
                continue;
            }
        }
        return stack.isEmpty();
    }
}
